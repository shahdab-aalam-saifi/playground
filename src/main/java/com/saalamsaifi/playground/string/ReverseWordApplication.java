package com.saalamsaifi.playground.string;

import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class ReverseWordApplication {
  private static final Pattern PATTERN = Pattern.compile(" +");

  public String reverseWords(String str) {
    return PATTERN
        .splitAsStream(str)
        .map(w -> new StringBuilder(w).reverse())
        .collect(Collectors.joining(" "));
  }
}
