package com.saalamsaifi.playground.multithreading.philosopher;

public class DiningPhilosopher {
  private final Object[] forks;
  private final Philosopher[] philosophers;

  public DiningPhilosopher(int size) {
    this.forks = new Object[size];
    this.philosophers = new Philosopher[size];

    for (var i = 0; i < size; i++) {
      forks[i] = new Object();
    }

    for (var i = 0; i < size; i++) {
      int leftFork = i;
      int rightFork = (i + 1) % size;

      if (leftFork < rightFork) {
        philosophers[i] = new Philosopher(i, this.forks[leftFork], this.forks[rightFork]);
      } else {
        philosophers[i] = new Philosopher(i, this.forks[rightFork], this.forks[leftFork]);
      }
    }
  }

  public void eat() throws InterruptedException {
    for (var i = 0; i < philosophers.length; i++) {
      philosophers[i].start();
    }

    // This will never happen
    philosophers[0].join();
  }
}
