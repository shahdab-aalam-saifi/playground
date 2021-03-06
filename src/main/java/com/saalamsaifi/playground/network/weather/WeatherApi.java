package com.saalamsaifi.playground.network.weather;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class WeatherApi {
  private static final String WEAHTER_API =
      "https://api.openweathermap.org/data/2.5/group?id={0}&APPID={1}";
  private static final String WATHER_API_KEY = "WEATHER_API_KEY";
  private static final String ID_SEPARATOR = ",";
  private static WeatherApi instance;
  private final Set<String> ids;

  /** */
  private WeatherApi() {
    this.ids = new HashSet<>();
  }

  /** @return */
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

  public WeatherApi addCity(String id) {
    this.ids.add(id);
    return this;
  }

  public String getCurrentWeatherApi() {
    //		https://stackoverflow.com/a/12414144
    return MessageFormat.format(
        WEAHTER_API, String.join(ID_SEPARATOR, this.ids), System.getenv(WATHER_API_KEY));
  }
}
