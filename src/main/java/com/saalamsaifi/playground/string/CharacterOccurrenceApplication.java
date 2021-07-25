package com.saalamsaifi.playground.string;

import com.saalamsaifi.playground.common.model.Pair;

import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;

public class CharacterOccurrenceApplication {
  public Pair<Character, Long> maxOccurrenceCharacter(String str) {
    return str
        .toLowerCase()
        .codePoints()
        .filter(cp -> !Character.isWhitespace(cp))
        .mapToObj(ch -> (char) ch)
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
        .entrySet()
        .stream()
        .max(comparingByValue())
        .map(p -> Pair.of(p.getKey(), p.getValue()))
        .orElse(Pair.of(Character.MIN_VALUE, -1L));
  }
}
