package com.saalamsaifi.playground.backtracking.core;

import java.time.LocalDateTime;

public class BadClass {
  private int intValue;
  private String stringValue;
  private LocalDateTime timeValue;

  public int getIntValue() {
    return intValue;
  }

  public void setIntValue(int intValue) {
    this.intValue = intValue;
  }

  public String getStringValue() {
    return stringValue;
  }

  public void setStringValue(String stringValue) {
    this.stringValue = stringValue;
  }

  public LocalDateTime getTimeValue() {
    return timeValue;
  }

  public void setTimeValue(LocalDateTime timeValue) {
    this.timeValue = timeValue;
  }

  @Override
  public String toString() {
    var builder = new StringBuilder();
    builder.append("BadClass [intValue=").append(intValue).append(", ");
    if (stringValue != null) builder.append("stringValue=").append(stringValue).append(", ");
    if (timeValue != null) builder.append("timeValue=").append(timeValue);
    builder.append("]");
    return builder.toString();
  }
}
