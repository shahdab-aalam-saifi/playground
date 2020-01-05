package com.saalamsaifi.playground.design.pattern.creation.abstractfactory;

public class ICICI implements Bank {
	private final String bankName;

	public ICICI() {
		this.bankName = "ICICI";
	}

	@Override
	public String getBankName() {
		return this.bankName;
	}

}
