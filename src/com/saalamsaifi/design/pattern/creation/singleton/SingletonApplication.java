package com.saalamsaifi.design.pattern.creation.singleton;

public class SingletonApplication {
	public static void main(String[] args) {
		DateUtil util = DateUtil.getInstance();

		System.out.println("Day: " + util.getDay() + "/" + DateUtil.getInstance().getDay());
	}
}
