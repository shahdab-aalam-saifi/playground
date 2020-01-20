package com.saalamsaifi.backtracking.core;

import java.util.HashMap;
import java.util.Map;

public class EqualAndHashCodeApplication {
	public static void main(String[] args) {
		Map<String, BadClass> buggyObjects = new HashMap<>();

		BadClass bo1 = new BadClass();
		bo1.setIntValue(1);
		bo1.setStringValue("2");
		bo1.setTimeValue(null);

		BadClass bo2 = new BadClass();
		bo2.setIntValue(1);
		bo2.setStringValue("2");
		bo2.setTimeValue(null);

		buggyObjects.put("1", bo1);
		buggyObjects.put("2", bo2);

		System.out.println(bo1 == bo2);
		System.out.println(buggyObjects.containsValue(bo2));
		System.out.println(bo1.hashCode() + " " + bo2.hashCode());

		Map<String, GoodClass> goodObjects = new HashMap<>();

		GoodClass go1 = new GoodClass();
		go1.setIntValue(1);
		go1.setStringValue("2");
		go1.setTimeValue(null);

		GoodClass go2 = new GoodClass();
		go2.setIntValue(1);
		go2.setStringValue("2");
		go2.setTimeValue(null);

		goodObjects.put("1", go1);
		goodObjects.put("2", go2);

		System.out.println(go1 == go2); // both objects are different on memory
		System.out.println(goodObjects.containsValue(go2));
		System.out.println(go1.hashCode() + " " + go2.hashCode()); // objects are same logically
	}
}
