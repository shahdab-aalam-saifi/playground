package com.saalamsaifi.string;

public class StringCompressionApplication {
	private String compress(String source) {
		StringBuilder builder = new StringBuilder();
		int count = 0;

		for (int i = 0; i < source.length(); i++) {
			count++;

			if (i + 1 >= source.length() || source.charAt(i) != source.charAt(i + 1)) {
				builder.append(source.charAt(i));
				builder.append(count);
				count = 0;
			}
		}
		return builder.length() < source.length() ? builder.toString() : source;
	}

	public static void main(String[] args) {
		StringCompressionApplication application = new StringCompressionApplication();

		System.out.println(application.compress("aaabbcc"));
		System.out.println(application.compress("abcabc"));
		System.out.println(application.compress("aabbbbac"));
	}
}
