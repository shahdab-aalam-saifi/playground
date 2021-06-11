package com.saalamsaifi.playground.multithreading.philosopher;

public class DiningPhilosopherApplication {
  public static void main(String[] args) {
    var diningPhilosopher = new DiningPhilosopher(5);

    try {
      diningPhilosopher.eat();
    } catch (InterruptedException e) {
      e.printStackTrace();
      // Interrupt main thread
      Thread.currentThread().interrupt();
    }
  }
}
