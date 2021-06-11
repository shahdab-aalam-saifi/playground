package com.saalamsaifi.playground.multithreading.philosopher;

import java.text.MessageFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Philosopher extends Thread {
  private final int id;
  private final Object leftFork;
  private final Object rightFork;

  public Philosopher(int id, Object leftFork, Object rightFork) {
    this.id = id;
    this.leftFork = leftFork;
    this.rightFork = rightFork;
  }

  @Override
  public void run() {
    while (true) {
      status("Picking up left fork");
      synchronized (this.leftFork) {
        status("Picking up right fork");
        synchronized (this.rightFork) {
          status("Eating...");
        }
      }
    }
  }

  private void status(String message) {
    System.out.println(
        MessageFormat.format(
            "{2} Philosopher [{0}]: {1}",
            this.id, message, LocalDateTime.now().format(DateTimeFormatter.ISO_DATE_TIME)));
  }
}
