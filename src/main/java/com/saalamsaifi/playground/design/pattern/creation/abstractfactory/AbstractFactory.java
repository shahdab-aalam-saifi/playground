package com.saalamsaifi.playground.design.pattern.creation.abstractfactory;

public abstract class AbstractFactory {
  /**
   * @param type
   * @return
   */
  public abstract Bank getBank(BankType type);

  /**
   * @param type
   * @return
   */
  public abstract Loan getLoan(LoanType type);
}
