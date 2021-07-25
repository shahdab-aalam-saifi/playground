package com.saalamsaifi.playground.string;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class DuplicateCharacterApplication {
  public Map<String, Long> countDuplicateCharacters(String str) {
    return str.codePoints()
        .mapToObj(c -> String.valueOf(Character.toChars(c)))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
  }

  public String removeDuplicateCharacters(String str) {
    return Arrays.asList(str.split("")).stream().distinct().collect(Collectors.joining());
  }
}
