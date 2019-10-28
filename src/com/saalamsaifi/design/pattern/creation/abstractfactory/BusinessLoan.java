package com.saalamsaifi.design.pattern.creation.abstractfactory;

public class BusinessLoan extends Loan {
	public BusinessLoan(double rate) {
		this.rate = rate;
	}

	@Override
	double getInterestRate() {
		return this.rate;
	}

}
