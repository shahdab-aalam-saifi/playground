package com.saalamsaifi.playground.codility.arrays;

import java.util.Arrays;

public class OddOccurrencesInArray {
  public static void main(String[] args) {
    var application = new OddOccurrencesInArray();

    System.out.println(application.unpaired(new int[] {9, 3, 9, 3, 9, 7, 9}));
    System.out.println(application.unpaired(new int[] {9, 3, 3, 9, 9, 3, 9, 7, 7}));
  }

  public int unpaired(int[] array) {
    Arrays.sort(array);


    for (var i = 0; i < array.length; ) {
      var number = array[i];
      var count = 1;
      var next = array.length > 1 ? i + 1 : 0;

      for (; next < array.length - 1; next++) {
        if (number == array[next]) {
          count++;
        } else {
          break;
        }
      }

      if (count % 2 != 0) {
        return number;
      }

      i = next;
    }

    return 0;
  }
}
