	package com.saalamsaifi.playground.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ReadFileApplication {

	public static void main(String[] args) {
		String[] fileNames = { "/int.txt", "/double.txt", "/float.txt" };
		ReadFileThread[] threads = new ReadFileThread[fileNames.length];
		ExecutorService service = Executors.newFixedThreadPool(5);

		for (int i = 0; i < fileNames.length; i++) {
			threads[i] = new ReadFileThread(fileNames[i]);
			service.execute(threads[i]);
		}
		service.shutdown();

		while (!service.isTerminated()) {
			/* Do nothing */
		}

		for (ReadFileThread readFileThread : threads) {
			System.out.println(readFileThread.getFileName() + " - " + readFileThread.getLines().size());
		}
	}
}
