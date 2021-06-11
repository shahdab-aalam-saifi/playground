package com.saalamsaifi.playground.string;

public class StringCompressionApplication {
  public static void main(String[] args) {
    var application = new StringCompressionApplication();

    System.out.println(application.compress("aaabbcc"));
    System.out.println(application.compress("abcabc"));
    System.out.println(application.compress("aabbbbac"));
  }

  private String compress(String source) {
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
