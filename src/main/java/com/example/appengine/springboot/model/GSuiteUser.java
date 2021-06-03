package com.example.appengine.springboot.model;

import lombok.Data;

@Data
public class GSuiteUser {
  private String email;

  private String name;

  private String pic;

  private boolean mfa;

}
