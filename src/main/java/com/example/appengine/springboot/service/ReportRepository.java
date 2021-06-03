package com.example.appengine.springboot.service;

import com.example.appengine.springboot.model.Report;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Report, Integer> {
  Report findFirstReportByUserIdOrderByDateDesc(Integer userId);
}
