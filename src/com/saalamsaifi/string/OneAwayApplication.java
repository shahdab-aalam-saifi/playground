package com.saalamsaifi.string;

public class OneAwayApplication {
	private boolean oneAway(String source, String input) {
		if (source.length() < input.length()) {
			return oneAway(input, source);
		}

		int count = 0;

		for (int i = 0; i < source.length() && i < input.length(); i++) {
			if (!(source.charAt(i) == input.charAt(i) || source.charAt(i + 1) == input.charAt(i))) {
				count++;
				if (count > 1) {
					return false;
				}
			}
		}

		return true;
	}

	public static void main(String[] args) {
		OneAwayApplication application = new OneAwayApplication();

		System.out.println(application.oneAway("pale", "ple"));
		System.out.println(application.oneAway("ple", "pale"));
		System.out.println(application.oneAway("pales", "pale"));
		System.out.println(application.oneAway("pale", "bale"));
		System.out.println(application.oneAway("pale", "bake"));
	}
}
