package com.saalamsaifi.design.pattern.creation.factory;

public class InstitutionalPlan extends Plan {
	public InstitutionalPlan() {
		this.rate = 5.50;
	}

	@Override
	double getRate() {
		return this.rate;
	}
}
