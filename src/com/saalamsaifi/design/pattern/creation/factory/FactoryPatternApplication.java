package com.saalamsaifi.design.pattern.creation.factory;

import java.util.Random;

public class FactoryPatternApplication {
	@FunctionalInterface
	private interface Function<P, I> {
		public void apply(P plan, I units);
	}

	public static void main(String[] args) {
		Function<Plan, Integer> function = (plan, units) -> {
			System.out.println("Bill: " + plan.getBill(units) + " Rate: " + plan.getRate() + "/unit Plan: "
					+ plan.getClass().getSimpleName());
		};

		int units = new Random().nextInt(1000);
		System.out.println("Unit(s): " + units);

		PlanFactory factory = new PlanFactory();

		Plan plan = factory.getPlan(PlanType.DOMESTIC);

		plan.getRate();
		function.apply(plan, units);

		plan = factory.getPlan(PlanType.COMMERCIAL);
		function.apply(plan, units);

		plan = factory.getPlan(PlanType.INSTITUTIONAL);
		function.apply(plan, units);
	}
}
