package com.saalamsaifi.network.weather;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WeatherApi {
	private static final String WEAHTER_API = "https://api.openweathermap.org/data/2.5/group?id={0}&APPID={1}";
	private static final String WATHER_API_KEY = "weather.api.key";
	private static final String ID_SEPARATOR = ",";

	private Set<String> ids;
	private static WeatherApi instance;

	/**
	 * 
	 */
	private WeatherApi() {
		this.ids = new HashSet<>();
	}

	/**
	 * @return
	 */
	public static WeatherApi getInstance() {
		if (Objects.isNull(instance)) {
			synchronized (WeatherApi.class) {
				if (Objects.isNull(instance)) {
					instance = new WeatherApi();
				}
			}
		}
		return instance;
	}

	public WeatherApi addCity(Integer id) {
		this.ids.add(String.valueOf(id));
		return this;
	}

	public String getCurrentWeatherApi() {
		return MessageFormat.format(WEAHTER_API, String.join(ID_SEPARATOR, this.ids), System.getProperty(WATHER_API_KEY));
	}
}
