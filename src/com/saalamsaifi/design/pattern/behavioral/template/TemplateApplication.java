package com.saalamsaifi.design.pattern.behavioral.template;

public class TemplateApplication {
	public static void main(String[] args) {
		DataRenderer renderer = new XMLDataRenderer();
		renderer.render();

		renderer = new TextDataRenderer();
		renderer.render();
	}
}
