package com.saalamsaifi.playground.network.weather;

import java.io.IOException;
import java.time.format.DateTimeFormatter;

import com.saalamsaifi.playground.network.weather.model.CityWeather;
import com.saalamsaifi.playground.network.weather.model.Weather;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NetworkApplication {
	public static void main(String[] args) {
		WeatherApi.getInstance().addCity("1259229").addCity("2934246").addCity("360630").addCity("2640692");

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder().url(WeatherApi.getInstance().getCurrentWeatherApi()).build();

		client.newCall(request).enqueue(new Callback() {

			@Override
			public void onResponse(Call call, Response response) throws IOException {
				final String r = response.body().string();

				CityWeather cities = new CityWeather(r);

				for (Weather weather : cities.getCityWeather()) {
					System.out.format("City: %s [%s]%n", weather.getName(), weather.getDateTime().format(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss a")));
					System.out.format("Temperature: %s F (%s/%s)%n", weather.getTemperature(), weather.getMinTemperature(), weather.getMaxTemperature());
					System.out.format("Wind: %s m/s %s deg%n%n", weather.getSpeed(), weather.getDegree());
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
