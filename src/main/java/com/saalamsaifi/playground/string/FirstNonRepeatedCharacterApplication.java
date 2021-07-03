package com.saalamsaifi.playground.string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacterApplication {
  public String firstNonRepeatedCharacter(String str) {
    LinkedHashMap<Integer, Long> chars =
        str.codePoints()
            .boxed()
            .collect(
                Collectors.groupingBy(
                    Function.identity(), LinkedHashMap::new, Collectors.counting()));

    int codePoint =
        chars.entrySet().stream()
            .filter(e -> e.getValue() == 1L)
            .findFirst()
            .map(Map.Entry::getKey)
            .orElse((int) Character.MIN_VALUE);

    return String.valueOf(Character.toChars(codePoint));
  }
}
