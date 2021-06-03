package com.example.appengine.springboot.model;

public class ResponseConnect {
  private boolean result;

  public ResponseConnect(boolean result) {
    this.result = result;
  }

  public boolean isResult() {
    return result;
  }

  public void setResult(boolean result) {
    this.result = result;
  }
}
