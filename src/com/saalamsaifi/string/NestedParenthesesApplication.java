package com.saalamsaifi.string;

public class NestedParenthesesApplication {
	private boolean isNestedProperly(String expression) {
		int count = 0;

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);

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

	public static void main(String[] args) {
		NestedParenthesesApplication application = new NestedParenthesesApplication();

		System.out.println(application.isNestedProperly("()"));
		System.out.println(application.isNestedProperly("))"));
		System.out.println(application.isNestedProperly("(("));
		System.out.println(application.isNestedProperly(")("));
	}
}
