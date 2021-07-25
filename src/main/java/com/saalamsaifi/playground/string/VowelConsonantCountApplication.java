package com.saalamsaifi.playground.string;

import com.saalamsaifi.playground.common.model.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class VowelConsonantCountApplication {
  private static final Set<Character> VOWELS =
      new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

  public Pair<Long, Long> countVowelAndConsonants(String str) {
    Map<Boolean, Long> result =
        str.toLowerCase()
            .chars()
            .mapToObj(ch -> (char) ch)
            .filter(ch -> (ch >= 'a' && ch <= 'z'))
            .collect(Collectors.partitioningBy(ch -> VOWELS.contains(ch), Collectors.counting()));

    return Pair.of(result.get(true), result.get(false));
  }
}
