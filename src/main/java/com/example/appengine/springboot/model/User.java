package com.example.appengine.springboot.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Index;
import javax.persistence.Table;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Table(
    name = "user",
    indexes = {
        @Index(columnList = "id"),
        @Index(columnList = "email")
    })
@Data
public class User {
  @Id
  @GeneratedValue
  private Integer id;

  private String email;

  private String token;

  private Date updateDate;
}
