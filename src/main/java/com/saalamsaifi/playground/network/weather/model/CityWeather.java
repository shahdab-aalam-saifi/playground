package com.saalamsaifi.playground.network.weather.model;

import org.json.JSONArray;
import org.json.JSONObject;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CityWeather {
  private static final String KEY_LIST = "list";
  private static final String KEY_ID = "id";
  private static final String KEY_NAME = "name";
  private static final String KEY_DT = "dt";
  private static final String KEY_WIND = "wind";
  private static final String KEY_SPEED = "speed";
  private static final String KEY_DEG = "deg";
  private static final String KEY_MAIN = "main";
  private static final String KEY_TEMP = "temp";
  private static final String KEY_TEMP_MIN = "temp_min";
  private static final String KEY_TEMP_MAX = "temp_max";

  private final JSONObject json;

  public CityWeather(String json) {
    this.json = new JSONObject(json);
  }

  public List<Weather> getCityWeather() {
    JSONArray array = this.getCities();
    List<Weather> cities = new ArrayList<>();

    for (var i = 0; i < array.length(); i++) {
      if (Objects.nonNull(array.optJSONObject(i))) {
        var city = array.getJSONObject(i);
        var weather = new Weather();

        this.getCityDetails(weather, city);
        this.getWind(weather, city.optJSONObject(KEY_WIND));
        this.getTemperature(weather, city.optJSONObject(KEY_MAIN));

        cities.add(weather);
      }
    }

    return cities;
  }

  private JSONArray getCities() {
    final var cities = this.json.optJSONArray(KEY_LIST);

    if (Objects.nonNull(cities)) {
      return cities;
    }

    throw new IllegalArgumentException("Error while fetching cities from json");
  }

  private void getCityDetails(Weather weather, JSONObject city) {
    weather.setId(city.getLong(KEY_ID));
    weather.setName(city.getString(KEY_NAME));
    weather.setDate(LocalDateTime.ofEpochSecond(city.getLong(KEY_DT), 0, ZoneOffset.UTC));
  }

  private void getWind(Weather weather, JSONObject wind) {
    if (Objects.nonNull(wind)) {
      weather.setSpeed(wind.getDouble(KEY_SPEED));
      weather.setDegree(wind.getDouble(KEY_DEG));
    }
  }

  private void getTemperature(Weather weather, JSONObject temperature) {
    if (Objects.nonNull(temperature)) {
      weather.setTemperature(temperature.getDouble(KEY_TEMP));
      weather.setMinTemperature(temperature.getDouble(KEY_TEMP_MIN));
      weather.setMaxTemperature(temperature.getDouble(KEY_TEMP_MAX));
    }
  }
}
