package com.example.appengine.springboot.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Index;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Table(
    name = "report",
    indexes = {
        @Index(columnList = "id"),
        @Index(columnList = "userId"),
        @Index(columnList = "taskId"),
        @Index(columnList = "date")
    })
@Data
public class Report {
  @Id
  @GeneratedValue
  private Integer id;

  private Integer userId;

  private Integer taskId;

  private Date date;

  private boolean result;

  @Column(length = 8192)
  private String report;
}
