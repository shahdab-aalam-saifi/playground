package com.saalamsaifi.playground.evenodd;

import java.util.Arrays;

public class FilterEvenOddApplication {
  public static void main(String[] args) {
    var filtering = new FilterEvenOdd();

    int[] integers = filtering.randomIntegers(10);
    System.out.println(Arrays.toString(filtering.filterEvenOdd(integers)));

    int[] numbers = filtering.randomIntegers(15);
    System.out.println(Arrays.toString(filtering.filterEvenOdd(numbers)));

    int[] input = filtering.randomIntegers(100);
    System.out.println(Arrays.toString(filtering.filterEvenOdd(input)));
  }
}
