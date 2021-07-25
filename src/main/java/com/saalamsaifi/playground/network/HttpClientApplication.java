package com.saalamsaifi.playground.network;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientApplication {
  public HttpResponse<String> getUser() throws IOException, InterruptedException {
    var client = HttpClient.newHttpClient();
    var request = HttpRequest.newBuilder().uri(URI.create("https://reqres.in/api/users/2")).build();
    return client.send(request, HttpResponse.BodyHandlers.ofString());
  }

  public static void main(String[] args) throws IOException, InterruptedException {
    var application = new HttpClientApplication();
    var response = application.getUser();

    System.out.println(response);
  }
}
