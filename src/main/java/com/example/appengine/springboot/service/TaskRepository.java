package com.example.appengine.springboot.service;

import com.example.appengine.springboot.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}
