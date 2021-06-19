package com.saalamsaifi.playground.string;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
  public String syntaxChecker(String input) {
    if (input == null) {
      return "INVALID";
    }

    try {
      Pattern.compile(input);
      return "VALID";
    } catch (PatternSyntaxException e) {
      return "INVALID";
    }
  }
}
