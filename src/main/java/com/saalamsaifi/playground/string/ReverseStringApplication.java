package com.saalamsaifi.playground.string;

public class ReverseStringApplication {
  public static void main(String[] args) {
    var application = new ReverseStringApplication();

    System.out.println(application.reverse("--> --> -->"));
    System.out.println(application.reverse("> *** <"));
    System.out.println(application.reverse("Shahdab Aalam Saifi"));
  }

  private String reverse(String source) {
    if (source == null) {
      return null;
    }

    var sb = new StringBuilder();

    for (var i = source.length() - 1; i >= 0; i--) {
      sb.append(source.charAt(i));
    }

    return sb.toString();
  }
}
