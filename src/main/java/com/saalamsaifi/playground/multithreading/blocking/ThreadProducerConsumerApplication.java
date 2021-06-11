package com.saalamsaifi.playground.multithreading.blocking;

public class ThreadProducerConsumerApplication {
  public static void main(String[] args) {
    var buffer = new IntegerBuffer(10);
    var producer = new ProducerThread(buffer);
    var consumer = new ConsumerThread(buffer);

    producer.start();
    consumer.start();
  }
}
