package com.saalamsaifi.playground.design.pattern.creation.abstractfactory;

import java.util.Random;

public class AbstractFactoryPatternApplication {
	public static void main(String[] args) {
		AbstractFactory factory = FactoryCreator.getFactory(FactoryType.BANK);

		Bank bank = factory.getBank(BankType.SBI);

		factory = FactoryCreator.getFactory(FactoryType.LOAN);

		Loan loan = factory.getLoan(LoanType.EDUCATIONAL);

		double years = new Random().nextInt(10);

		System.out.println(bank.getBankName() + ": EMI " + String.format("%.2f", loan.loadPayment(1_00_000, years))
				+ "/month for " + years + " year(s)");
	}
}
