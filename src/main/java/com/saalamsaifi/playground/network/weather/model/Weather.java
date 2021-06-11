package com.saalamsaifi.playground.network.weather.model;

import java.time.LocalDateTime;

public class Weather {
  private long id;
  private String name;
  private LocalDateTime dateTime;

  // Temperature
  private double temperature;
  private double minTemperature;
  private double maxTemperature;

  // Weather Description
  private String description;

  // Wind
  private double speed;
  private double degree;

  public long getId() {
    return id;
  }

  protected void setId(long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  protected void setName(String name) {
    this.name = name;
  }

  public LocalDateTime getDateTime() {
    return dateTime;
  }

  protected void setDate(LocalDateTime dateTime) {
    this.dateTime = dateTime;
  }

  public double getTemperature() {
    return temperature;
  }

  protected void setTemperature(double temperature) {
    this.temperature = temperature;
  }

  public double getMinTemperature() {
    return minTemperature;
  }

  protected void setMinTemperature(double minTemperature) {
    this.minTemperature = minTemperature;
  }

  public double getMaxTemperature() {
    return maxTemperature;
  }

  protected void setMaxTemperature(double maxTemperature) {
    this.maxTemperature = maxTemperature;
  }

  public String getDescription() {
    return description;
  }

  protected void setDescription(String description) {
    this.description = description;
  }

  public double getSpeed() {
    return speed;
  }

  protected void setSpeed(double speed) {
    this.speed = speed;
  }

  public double getDegree() {
    return degree;
  }

  protected void setDegree(double degree) {
    this.degree = degree;
  }

  @Override
  public String toString() {
    var builder = new StringBuilder();
    builder.append("Weather [id=").append(id).append(", ");
    if (name != null) builder.append("name=").append(name).append(", ");
    if (dateTime != null) builder.append("date=").append(dateTime).append(", ");
    builder
        .append("temperature=")
        .append(temperature)
        .append(", minTemperature=")
        .append(minTemperature)
        .append(", maxTemperature=")
        .append(maxTemperature)
        .append(", ");
    if (description != null) builder.append("description=").append(description).append(", ");
    builder.append("speed=").append(speed).append(", degree=").append(degree).append("]");
    return builder.toString();
  }
}
