package com.saalamsaifi.playground.design.pattern.creation.abstractfactory;

public abstract class Loan {
  protected double rate;

  /** @param rate */
  abstract double getInterestRate();

  public double loadPayment(double loanAmount, double years) {
    double months = years * 12;
    this.rate = this.rate / (12 * 100);
    return (this.rate * Math.pow(1 + this.rate, months))
        / (Math.pow(1 + this.rate, months) - 1)
        * loanAmount;
  }
}
