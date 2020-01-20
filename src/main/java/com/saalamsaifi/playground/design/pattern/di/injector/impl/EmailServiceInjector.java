package com.saalamsaifi.design.pattern.di.injector.impl;

import com.saalamsaifi.design.pattern.di.DependencyInjection;
import com.saalamsaifi.design.pattern.di.consumer.Consumer;
import com.saalamsaifi.design.pattern.di.injector.MessageServiceInjector;
import com.saalamsaifi.design.pattern.di.service.impl.EmailServiceImpl;

public class EmailServiceInjector implements MessageServiceInjector {

	@Override
	public Consumer getConsumer() {
		return new DependencyInjection(new EmailServiceImpl());
	}

}