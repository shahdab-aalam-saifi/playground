package com.saalamsaifi.playground.string;

public class StringCompressionApplication {
  public String compress(String source) {
    if (source == null) {
      return null;
    }

    var builder = new StringBuilder();
    var count = 0;

    for (var i = 0; i < source.length(); i++) {
      count++;

      if (i + 1 >= source.length() || source.charAt(i) != source.charAt(i + 1)) {
        builder.append(source.charAt(i));
        builder.append(count);
        count = 0;
      }
    }

    return builder.length() < source.length() ? builder.toString() : source;
  }
}
