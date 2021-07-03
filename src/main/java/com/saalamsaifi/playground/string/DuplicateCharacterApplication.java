package com.saalamsaifi.playground.string;

import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterApplication {
  public Map<String, Long> countDuplicateCharacters(String str) {
    return str.codePoints()
        .mapToObj(c -> String.valueOf(Character.toChars(c)))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
  }
}
