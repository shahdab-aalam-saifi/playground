package com.saalamsaifi.playground.string;

public class OneAwayApplication {
  public static void main(String[] args) {
    var application = new OneAwayApplication();

    System.out.println(application.oneAway("pale", "ple"));
    System.out.println(application.oneAway("ple", "pale"));
    System.out.println(application.oneAway("pales", "pale"));
    System.out.println(application.oneAway("pale", "bale"));
    System.out.println(application.oneAway("pale", "bake"));
  }

  private boolean oneAway(String source, String input) {
    if (source.length() < input.length()) {
      return oneAway(input, source);
    }

    var count = 0;

    for (var i = 0; i < source.length() && i < input.length(); i++) {
      if (!(source.charAt(i) == input.charAt(i) || source.charAt(i + 1) == input.charAt(i))) {
        count++;
        if (count > 1) {
          return false;
        }
      }
    }

    return true;
  }
}
