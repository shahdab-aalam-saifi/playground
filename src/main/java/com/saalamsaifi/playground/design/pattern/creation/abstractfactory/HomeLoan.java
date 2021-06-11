package com.saalamsaifi.playground.design.pattern.creation.abstractfactory;

public class HomeLoan extends Loan {
  public HomeLoan(double rate) {
    this.rate = rate;
  }

  @Override
  double getInterestRate() {
    return this.rate;
  }
}
