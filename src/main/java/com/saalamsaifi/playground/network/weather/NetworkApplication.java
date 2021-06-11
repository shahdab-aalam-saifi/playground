package com.saalamsaifi.playground.network.weather;

import com.saalamsaifi.playground.network.weather.model.CityWeather;
import okhttp3.*;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

public class NetworkApplication {
  public static void main(String[] args) {
    WeatherApi.getInstance()
        .addCity("1259229")
        .addCity("2934246")
        .addCity("360630")
        .addCity("2640692");

    var client = new OkHttpClient();

    var request =
        new Request.Builder().url(WeatherApi.getInstance().getCurrentWeatherApi()).build();

    client
        .newCall(request)
        .enqueue(
            new Callback() {

              @Override
              public void onResponse(Call call, Response response) throws IOException {
                final var r = response.body().string();

                var cities = new CityWeather(r);

                for (var weather : cities.getCityWeather()) {
                  System.out.format(
                      "City: %s [%s]%n",
                      weather.getName(),
                      weather
                          .getDateTime()
                          .format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a")));
                  System.out.format(
                      "Temperature: %s F (%s/%s)%n",
                      weather.getTemperature(),
                      weather.getMinTemperature(),
                      weather.getMaxTemperature());
                  System.out.format(
                      "Wind: %s m/s %s deg%n%n", weather.getSpeed(), weather.getDegree());
                }

                System.exit(0);
              }

              @Override
              public void onFailure(Call call, IOException exception) {
                System.out.println(exception);
                call.cancel();
                System.exit(0);
              }
            });
  }
}
