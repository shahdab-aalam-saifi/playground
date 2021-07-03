package com.saalamsaifi.playground.string;

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

  static final class Pair<V, C> {
    private final V vowels;
    private final C consonants;

    public Pair(V vowels, C consonants) {
      this.vowels = vowels;
      this.consonants = consonants;
    }

    static <V, C> Pair<V, C> of(V vowels, C consonants) {
      return new Pair<>(vowels, consonants);
    }

    public V getVowels() {
      return vowels;
    }

    public C getConsonants() {
      return consonants;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Pair<?, ?> pair = (Pair<?, ?>) o;
      return Objects.equals(vowels, pair.vowels) && Objects.equals(consonants, pair.consonants);
    }

    @Override
    public int hashCode() {
      return Objects.hash(vowels, consonants);
    }
  }
}
