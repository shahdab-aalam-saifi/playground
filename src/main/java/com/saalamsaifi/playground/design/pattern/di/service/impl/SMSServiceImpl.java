package com.saalamsaifi.playground.design.pattern.di.service.impl;

import com.saalamsaifi.playground.design.pattern.di.service.MessageService;

public class SMSServiceImpl implements MessageService {

  @Override
  public void sendMessage(String message, String receiver) {
    System.out.println("SMS sent to " + receiver + " with Message=" + message);
  }
}
