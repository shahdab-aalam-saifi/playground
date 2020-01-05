package com.saalamsaifi.playground.multithreading.blocking;

import java.util.Random;

public class ProducerThread extends Thread {
	private IntegerBuffer buffer;
	private Random random;

	public ProducerThread(final IntegerBuffer buffer) {
		this.buffer = buffer;
		this.random = new Random(System.currentTimeMillis());
	}

	@Override
	public void run() {
		while (true) {
			int integer = random.nextInt(1000);

			this.buffer.add(integer);
			
			System.out.println("Producer: " + integer + " is added to buffer");
		}
	}
}
