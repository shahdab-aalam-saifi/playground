package com.saalamsaifi.playground.number;

public class FizzBuzzApplication {
  public static void main(String[] args) {
    var application = new FizzBuzzApplication();

    application.fizzBuzz(0, 10);
    application.fizzBuzz(10, 100);
    application.fizzBuzz(100, 1000);
  }

  private void fizzBuzz(int start, int end) {
    for (int i = start; i <= end; i++) {
      boolean isDivisibleBy3 = i % 3 == 0;
      boolean isDivisibleBy5 = i % 5 == 0;

      if (isDivisibleBy3) {
        System.out.println("Fizz");
      } else if (isDivisibleBy5) {
        System.out.println("Buzz");
      } else if (isDivisibleBy3 && isDivisibleBy5) {
        System.out.println("FizzBuzz");
      } else {
        System.out.println(i);
      }
    }
  }
}
