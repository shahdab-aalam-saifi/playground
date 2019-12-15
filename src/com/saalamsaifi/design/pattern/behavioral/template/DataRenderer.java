package com.saalamsaifi.design.pattern.behavioral.template;

public abstract class DataRenderer {
	public final void render() {
		String raw = null;
		String processed = null;

		raw = read();
		processed = process(raw);

		System.out.println(processed);
	}

	public abstract String read();

	public abstract String process(String data);
}
