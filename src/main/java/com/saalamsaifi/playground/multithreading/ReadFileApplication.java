package com.saalamsaifi.playground.multithreading;

import java.util.concurrent.Executors;

public class ReadFileApplication {

  public static void main(String[] args) {
    var fileNames = new String[] {"/int.txt", "/double.txt", "/float.txt"};
    var threads = new ReadFileThread[fileNames.length];
    var service = Executors.newFixedThreadPool(5);

    for (var i = 0; i < fileNames.length; i++) {
      threads[i] = new ReadFileThread(fileNames[i]);
      service.execute(threads[i]);
    }
    service.shutdown();

    while (!service.isTerminated()) {
      /* Do nothing */
    }

    for (var readFileThread : threads) {
      System.out.println(readFileThread.getFileName() + " - " + readFileThread.getLines().size());
    }
  }
}
