package com.saalamsaifi.playground.design.pattern.creation.factory;

public abstract class Plan {
  protected double rate;

  /** @return */
  abstract double getRate();

  /**
   * @param unit
   * @return
   */
  public double getBill(int unit) {
    return this.rate * unit;
  }
}
