package com.saalamsaifi.network.weather;

import java.io.IOException;
import java.util.Objects;

import org.json.JSONArray;
import org.json.JSONObject;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class NetworkApplication {
	public static void main(String[] args) {
		WeatherApi.getInstance().addCity(1259229).addCity(2934246).addCity(360630).addCity(2640692);

		OkHttpClient client = new OkHttpClient();

		Request request = new Request.Builder().url(WeatherApi.getInstance().getCurrentWeatherApi()).build();

		client.newCall(request).enqueue(new Callback() {

			@Override
			public void onResponse(Call call, Response response) throws IOException {
				JSONArray cities = new JSONObject(response.body().string()).optJSONArray("list");

				if (Objects.nonNull(cities)) {
					for (int i = 0; i < cities.length(); i++) {
						JSONObject city = cities.optJSONObject(i);
						
						if (Objects.nonNull(city)) {
							System.out.format("City: %s%n" ,city.optString("name"));
							
							JSONObject main = city.optJSONObject("main");
							
							if (Objects.nonNull(main)) {
								System.out.format("Temperature (min/max): %s F (%s/%s)%n%n", main.optString("temp"), main.optString("temp_min"), main.optString("temp_max"));
							}
						}
					}
				}

				System.exit(0);
			}

			@Override
			public void onFailure(Call call, IOException exception) {
				System.out.println(exception);
				call.cancel();
			}
		});
	}
}
