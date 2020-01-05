package com.saalamsaifi.playground.design.pattern.creation.abstractfactory;

public class HDFC implements Bank {
	private final String bankName;

	public HDFC() {
		this.bankName = "HDFC";
	}

	@Override
	public String getBankName() {
		return this.bankName;
	}

}
