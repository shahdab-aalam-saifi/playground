package com.saalamsaifi.design.pattern.creation.abstractfactory;

public class SBI implements Bank {
	private final String bankName;

	public SBI() {
		this.bankName = "SBI";
	}

	@Override
	public String getBankName() {
		return this.bankName;
	}

}
