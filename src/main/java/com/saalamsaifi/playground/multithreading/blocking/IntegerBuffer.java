package com.saalamsaifi.playground.multithreading.blocking;

public class IntegerBuffer {
  private final int[] buffer;
  private int index;

  public IntegerBuffer(int size) {
    this.buffer = new int[size];
  }

  public synchronized void add(int integer) {
    while (this.index == this.buffer.length) {
      try {
        this.wait();
      } catch (InterruptedException e) {
        System.out.println("Buffer.add: " + e.getMessage());
      }
    }

    this.buffer[this.index++] = integer;
    this.notifyAll();
  }

  public synchronized int remove() {
    while (this.index == 0) {
      try {
        this.wait();
      } catch (InterruptedException e) {
        System.out.println("Buffer.remove: " + e.getMessage());
      }
    }

    var integer = this.buffer[--this.index];
    this.notifyAll();
    return integer;
  }
}
