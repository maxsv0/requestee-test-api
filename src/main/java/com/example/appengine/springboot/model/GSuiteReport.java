package com.example.appengine.springboot.model;

import java.util.List;
import lombok.Data;

@Data
public class GSuiteReport extends Report {
  private boolean result;

  private List<GSuiteUser> users;
}
