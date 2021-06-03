package com.example.appengine.springboot.service;

import com.example.appengine.springboot.google.Util;
import com.example.appengine.springboot.model.Report;
import com.example.appengine.springboot.model.Task;
import com.example.appengine.springboot.model.TaskPerformReport;
import com.example.appengine.springboot.model.User;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.services.directory.Directory;
import com.google.api.services.directory.model.Users;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TasksService {

  @Autowired TaskRepository taskRepository;

  @Autowired ReportRepository reportRepository;

  @Autowired UserRepository userRepository;

  private final List<Task> tasks;

  ObjectMapper mapper = new ObjectMapper();

  public TasksService() {
    this.tasks = this.taskRepository.findAll();
  }

  @Scheduled(fixedRate = 1000)
  private void performsTasksCheck() throws IOException {
    List<User> users = this.userRepository.findAll();

    // perform all tasks for every users
    for (User user : users) {
      for (Task task : tasks) {
        Report report = new Report();
        report.setTaskId(task.getId());
        report.setUserId(user.getId());
        report.setDate(new Date());

        TaskPerformReport taskPerformReport = performTask(task, user);

        report.setResult(taskPerformReport.isResult());
        report.setReport(taskPerformReport.getReport());

        reportRepository.save(report);
      }
    }
  }

  private TaskPerformReport performTask(Task task, User user) throws IOException {

    TaskPerformReport report = new TaskPerformReport();

    switch (task.getType()) {
      case G_SUITE_MFA:
        Directory directory = Util.buildDirectoryService(user.getToken());

        Users result =
            directory
                .users()
                .list()
                .setCustomer("my_customer")
                .setMaxResults(10)
                .setOrderBy("email")
                .execute();

        boolean allOk = true;

        List<com.google.api.services.directory.model.User> users = result.getUsers();
        for (com.google.api.services.directory.model.User gUser : users) {
          if (!gUser.getIsEnrolledIn2Sv()) {
            allOk = false;
          }
        }

        JsonNode node = mapper.valueToTree(users);

        report.setReport(node.asText());
        report.setResult(allOk);

        break;

      default:
        report.setReport("Unknown type");
        report.setResult(false);
    }

    return report;
  }
}
