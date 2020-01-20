package com.saalamsaifi.playground.design.pattern.behavioral.template;

public class XMLDataRenderer extends DataRenderer {

	@Override
	public String read() {
		return "<xml>data</xml>";
	}

	@Override
	public String process(String data) {
		return "<xml><processed>" + data + "</processed></xml>";
	}

}
