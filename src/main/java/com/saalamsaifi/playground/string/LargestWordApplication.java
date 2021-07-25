package com.saalamsaifi.playground.string;

import java.util.*;
import java.util.stream.Collectors;

public class LargestWordApplication {
  public Set<String> largestWord(String str, int n) {
    if (Objects.isNull(str) || str.isBlank() || n <= 0) {
      throw new IllegalArgumentException("String is empty or n <= 0");
    }

    var wordByLength =
        Arrays.stream(str.split("\\s+"))
            .collect(
                Collectors.groupingBy(
                    String::length, Collectors.mapping(s -> s, Collectors.toSet())));

    var sortedKeys =
        wordByLength.keySet().stream()
            .sorted(Comparator.reverseOrder())
            .collect(Collectors.toUnmodifiableList());

    return sortedKeys.isEmpty() ? new HashSet<>() : wordByLength.get(sortedKeys.get(n - 1));
  }
}
