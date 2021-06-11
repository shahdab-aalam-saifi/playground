package com.saalamsaifi.playground.multithreading.blocking;

public class ConsumerThread extends Thread {
  private final IntegerBuffer buffer;

  public ConsumerThread(final IntegerBuffer buffer) {
    this.buffer = buffer;
  }

  @Override
  public void run() {
    while (true) {
      var integer = buffer.remove();
      System.out.println("Consumer: " + integer + " is removed from buffer");
    }
  }
}
