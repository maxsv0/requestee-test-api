package com.example.appengine.springboot.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Index;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Table(
    name = "task",
    indexes = {
        @Index(columnList = "id")
    })
@Data
public class Task {
  @Id
  @GeneratedValue
  private Integer id;

  private TaskType type;

  private String name;
}
