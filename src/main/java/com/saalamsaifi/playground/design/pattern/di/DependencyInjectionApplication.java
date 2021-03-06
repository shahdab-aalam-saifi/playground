package com.saalamsaifi.playground.design.pattern.di;

import com.saalamsaifi.playground.design.pattern.di.consumer.Consumer;
import com.saalamsaifi.playground.design.pattern.di.injector.MessageServiceInjector;
import com.saalamsaifi.playground.design.pattern.di.injector.impl.EmailServiceInjector;
import com.saalamsaifi.playground.design.pattern.di.injector.impl.SMSServiceInjector;

public class DependencyInjectionApplication {
  public static void main(String[] args) {
    MessageServiceInjector injector = null;
    Consumer app = null;
    var message = "Hello, World!!!";

    // Send email
    injector = new EmailServiceInjector();
    app = injector.getConsumer();
    app.processMessages(message, "saalamsaifi@gmail.com");

    // Send SMS
    injector = new SMSServiceInjector();
    app = injector.getConsumer();
    app.processMessages(message, "7891234560");
  }
}
