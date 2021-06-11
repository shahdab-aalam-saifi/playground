package com.saalamsaifi.playground.design.pattern.creation.factory;

public class DomesticPlan extends Plan {
  public DomesticPlan() {
    this.rate = 3.50;
  }

  @Override
  double getRate() {
    return this.rate;
  }
}
