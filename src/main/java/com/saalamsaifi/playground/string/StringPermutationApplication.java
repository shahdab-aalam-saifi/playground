package com.saalamsaifi.playground.string;

import java.util.stream.IntStream;

public class StringPermutationApplication {
  public void permutation(String prefix, String str) {
    int n = str.length();

    if (n == 0) {
      System.out.print(prefix + " ");
    } else {
      IntStream.range(0, n)
//          .parallel()
          .forEach(
              i ->
                  permutation(
                      prefix + str.charAt(i), str.substring(i + 1, n) + str.substring(0, i)));
    }
  }
}
