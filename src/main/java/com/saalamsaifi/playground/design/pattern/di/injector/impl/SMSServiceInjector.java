package com.saalamsaifi.playground.design.pattern.di.injector.impl;

import com.saalamsaifi.playground.design.pattern.di.DependencyInjection;
import com.saalamsaifi.playground.design.pattern.di.consumer.Consumer;
import com.saalamsaifi.playground.design.pattern.di.injector.MessageServiceInjector;
import com.saalamsaifi.playground.design.pattern.di.service.impl.SMSServiceImpl;

public class SMSServiceInjector implements MessageServiceInjector {
  @Override
  public Consumer getConsumer() {
    return new DependencyInjection(new SMSServiceImpl());
  }
}
