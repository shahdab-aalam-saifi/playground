package com.saalamsaifi.playground.string;

public class ReverseStringApplication {
	private String reverse(String source) {
		if (source == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder();

		for (int i = source.length() - 1; i >= 0; i--) {
			sb.append(source.charAt(i));
		}

		return sb.toString();
	}

	public static void main(String[] args) {
		ReverseStringApplication application = new ReverseStringApplication();

		System.out.println(application.reverse("--> --> -->"));
		System.out.println(application.reverse("> *** <"));
		System.out.println(application.reverse("Shahdab Aalam Saifi"));
	}

}
