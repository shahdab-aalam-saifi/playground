package com.saalamsaifi.playground.multithreading.blocking;

import java.util.Random;

public class ProducerThread extends Thread {
  private final IntegerBuffer buffer;
  private final Random random;

  public ProducerThread(final IntegerBuffer buffer) {
    this.buffer = buffer;
    this.random = new Random(System.currentTimeMillis());
  }

  @Override
  public void run() {
    while (true) {
      var integer = random.nextInt(1000);

      this.buffer.add(integer);

      System.out.println("Producer: " + integer + " is added to buffer");
    }
  }
}
