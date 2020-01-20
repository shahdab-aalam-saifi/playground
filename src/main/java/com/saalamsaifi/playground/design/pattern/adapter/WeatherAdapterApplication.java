package com.saalamsaifi.playground.design.pattern.adapter;

public class WeatherAdapterApplication {
	public static void main(String[] args) {
		System.out.println(new WeatherAdapter().findTemperature(411042));
		System.out.println(new WeatherAdapter().findTemperature(411014));
	}
}
 