package com.saalamsaifi.design.pattern.creation.abstractfactory;

public class BankFactory extends AbstractFactory {

	@Override
	public Bank getBank(BankType type) {
		switch (type) {
		case HDFC:
			return new HDFC();

		case ICICI:
			return new ICICI();

		case SBI:
			return new SBI();

		default:
			return null;
		}
	}

	@Override
	public Loan getLoan(LoanType type) {
		return null;
	}

}
