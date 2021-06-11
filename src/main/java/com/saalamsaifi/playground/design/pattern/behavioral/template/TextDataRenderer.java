package com.saalamsaifi.playground.design.pattern.behavioral.template;

public class TextDataRenderer extends DataRenderer {

  @Override
  public String read() {
    return "data";
  }

  @Override
  public String process(String data) {
    return "processed-" + data;
  }
}
