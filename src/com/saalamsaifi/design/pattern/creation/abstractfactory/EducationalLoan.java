package com.saalamsaifi.design.pattern.creation.abstractfactory;

public class EducationalLoan extends Loan {
	public EducationalLoan(double rate) {
		this.rate = rate;
	}

	@Override
	double getInterestRate() {
		return this.rate;
	}

}
