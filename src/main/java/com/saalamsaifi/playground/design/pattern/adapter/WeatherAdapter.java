package com.saalamsaifi.playground.design.pattern.adapter;

public class WeatherAdapter {
	public int findTemperature(int zipCode) {
		String city = null;

		if (zipCode == 411042) {
			city = "pune";
		}

		return new WeatherFinder().find(city);
	}
}
