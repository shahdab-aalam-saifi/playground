package com.saalamsaifi.playground.string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinByDelimiterApplication {
  public String joinBy(char delimiter, String... args) {
    return Arrays.stream(args, 0, args.length)
        .collect(Collectors.joining(String.valueOf(delimiter)));
  }
}
