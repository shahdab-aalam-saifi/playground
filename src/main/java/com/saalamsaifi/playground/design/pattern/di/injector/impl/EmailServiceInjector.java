package com.saalamsaifi.playground.design.pattern.di.injector.impl;

import com.saalamsaifi.playground.design.pattern.di.DependencyInjection;
import com.saalamsaifi.playground.design.pattern.di.consumer.Consumer;
import com.saalamsaifi.playground.design.pattern.di.injector.MessageServiceInjector;
import com.saalamsaifi.playground.design.pattern.di.service.impl.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

  @Override
  public Consumer getConsumer() {
    return new DependencyInjection(new EmailServiceImpl());
  }
}
