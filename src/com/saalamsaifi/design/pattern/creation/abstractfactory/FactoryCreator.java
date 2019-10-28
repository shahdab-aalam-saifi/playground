package com.saalamsaifi.design.pattern.creation.abstractfactory;

public class FactoryCreator {
	public static AbstractFactory getFactory(FactoryType type) {
		switch (type) {
		case BANK:
			return new BankFactory();

		case LOAN:
			return new LoanFactory();

		default:
			return null;
		}
	}
}
