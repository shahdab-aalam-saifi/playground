package com.saalamsaifi.playground.min;

import java.util.Arrays;

public class MinMax {
  private final int[] array;
  private int[] sortedArray;

  public MinMax(final int[] array) {
    if (array == null) {
      throw new IllegalArgumentException("array == null");
    }

    this.array = array;
    this.sortedArray = array;

    // Clone the array and sort the elements of the array
    this.sortedArray = array.clone();
    sort(this.sortedArray);
  }

  public int[] getArray() {
    return this.array;
  }

  private void sort(int[] unsortedArray) {
    // Sort elements of the array
    Arrays.sort(unsortedArray);
  }

  public int getMin() {
    return getMin(1);
  }

  public int getMin(int position) {
    int length = this.sortedArray.length;

    if (length == 0) {
      return 0;
    }

    if (position < 0) {
      throw new IllegalArgumentException("position < 0");
    }

    if (position > length) {
      throw new IllegalArgumentException("position > length");
    }

    return this.sortedArray[position - 1];
  }

  public int getMax() {
    return getMax(1);
  }

  public int getMax(int position) {
    int length = this.sortedArray.length;

    if (length == 0) {
      return 0;
    }

    if (position < 0) {
      throw new IllegalArgumentException("position < 0");
    }

    if (position > length) {
      throw new IllegalArgumentException("position > array.length");
    }

    return this.sortedArray[length - position];
  }
}
