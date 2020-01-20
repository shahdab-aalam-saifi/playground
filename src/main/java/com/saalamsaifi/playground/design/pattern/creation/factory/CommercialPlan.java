package com.saalamsaifi.playground.design.pattern.creation.factory;

public class CommercialPlan extends Plan {
	public CommercialPlan() {
		this.rate = 7.50;
	}

	@Override
	double getRate() {
		return this.rate;
	}
}
