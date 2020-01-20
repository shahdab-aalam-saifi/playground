package com.saalamsaifi.playground.multithreading.blocking;

public class ThreadProducerConsumerApplication {
	public static void main(String[] args) {
		IntegerBuffer buffer = new IntegerBuffer(10);
		ProducerThread producer = new ProducerThread(buffer);
		ConsumerThread consumer = new ConsumerThread(buffer);
		
		producer.start();
		consumer.start();
	}
}
