package com.saalamsaifi.playground.evenodd;

import java.util.ArrayList;
import java.util.Random;

public class FilterEvenOdd {

  private boolean isEven(int number) {
    return number % 2 == 0;
  }

  public int[] randomIntegers(int length) {
    if (length <= 0) {
      return new int[] {};
    }

    var random = new Random(System.currentTimeMillis());
    var array = new int[length];

    for (var i = 0; i < length; i++) {
      array[i] = random.nextInt(1000);
    }

    return array;
  }

  // TODO: Avoid/remove this warning
  @SuppressWarnings("unchecked")
  public ArrayList<ArrayList<Integer>>[] filterEvenOdd(int[] numbers) {
    if (numbers == null) {
      return new ArrayList[] {};
    }

    ArrayList<Integer> evenNumbers = new ArrayList<>();
    ArrayList<Integer> oddNumbers = new ArrayList<>();

    for (Integer integer : numbers) {
      if (isEven(integer)) {
        evenNumbers.add(integer);
      } else {
        oddNumbers.add(integer);
      }
    }

    return new ArrayList[] {evenNumbers, oddNumbers};
  }
}
