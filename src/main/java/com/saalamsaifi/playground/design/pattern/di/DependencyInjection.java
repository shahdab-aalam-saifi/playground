package com.saalamsaifi.playground.design.pattern.di;

import com.saalamsaifi.playground.design.pattern.di.consumer.Consumer;
import com.saalamsaifi.playground.design.pattern.di.service.MessageService;

public class DependencyInjection implements Consumer {
  private final MessageService service;

  public DependencyInjection(MessageService service) {
    this.service = service;
  }

  @Override
  public void processMessages(String message, String receiver) {
    this.service.sendMessage(message, receiver);
  }
}
