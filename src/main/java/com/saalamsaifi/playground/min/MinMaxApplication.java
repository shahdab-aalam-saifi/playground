package com.saalamsaifi.playground.min;

import java.util.Arrays;

public class MinMaxApplication {

  public static void main(String[] args) {
    var minMax = new MinMax(new int[] {5, 1, 10, 55, 0, -4, -10});

    System.out.println("Min: " + minMax.getMin());
    System.out.println("Max: " + minMax.getMax());
    System.out.println("2nd Min: " + minMax.getMin(2));
    System.out.println("4th Max: " + minMax.getMax(4));

    System.out.println("Original array: " + Arrays.toString(minMax.getArray()));
  }
}
