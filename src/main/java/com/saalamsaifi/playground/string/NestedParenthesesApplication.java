package com.saalamsaifi.playground.string;

public class NestedParenthesesApplication {
  public static void main(String[] args) {
    var application = new NestedParenthesesApplication();

    System.out.println(application.isNestedProperly("()"));
    System.out.println(application.isNestedProperly("))"));
    System.out.println(application.isNestedProperly("(("));
    System.out.println(application.isNestedProperly(")("));
  }

  private boolean isNestedProperly(String expression) {
    var count = 0;

    for (var i = 0; i < expression.length(); i++) {
      var ch = expression.charAt(i);

      if (ch == '(') {
        count++;
      } else if (ch == ')') {
        count--;

        if (count < 0) {
          return false;
        }
      } else {
        throw new IllegalArgumentException("Invalid character: " + ch);
      }
    }

    return count == 0;
  }
}
