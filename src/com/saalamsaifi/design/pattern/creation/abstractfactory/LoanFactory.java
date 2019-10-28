package com.saalamsaifi.design.pattern.creation.abstractfactory;

public class LoanFactory extends AbstractFactory {
	private static final double HOME_LOAN_RATE = 7.50;
	private static final double BUSINESS_LOAN_RATE = 10.00;
	private static final double EDUCATIONAL_LOAN_RATE = 8.50;

	@Override
	public Bank getBank(BankType type) {
		return null;
	}

	@Override
	public Loan getLoan(LoanType type) {
		switch (type) {
		case HOME:
			return new HomeLoan(HOME_LOAN_RATE);

		case BUSINESS:
			return new BusinessLoan(BUSINESS_LOAN_RATE);

		case EDUCATIONAL:
			return new EducationalLoan(EDUCATIONAL_LOAN_RATE);

		default:
			return null;
		}
	}

}
