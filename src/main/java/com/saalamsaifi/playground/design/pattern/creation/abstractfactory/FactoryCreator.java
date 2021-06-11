package com.saalamsaifi.playground.design.pattern.creation.abstractfactory;

public class FactoryCreator {
  private FactoryCreator() {
    throw new UnsupportedOperationException();
  }

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
