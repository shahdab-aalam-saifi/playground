package com.saalamsaifi.playground.immutable;

public class Course implements Cloneable {
  private long id;
  private String name;
  private double duration;

  public Course(long id, String name, double duration) {
    super();
    this.id = id;
    this.name = name;
    this.duration = duration;
  }

  /** @return the id */
  public long getId() {
    return id;
  }

  /** @param id the id to set */
  public void setId(long id) {
    this.id = id;
  }

  /** @return the name */
  public String getName() {
    return name;
  }

  /** @param name the name to set */
  public void setName(String name) {
    this.name = name;
  }

  /** @return the duration */
  public double getDuration() {
    return duration;
  }

  /** @param duration the duration to set */
  public void setDuration(double duration) {
    this.duration = duration;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public String toString() {
    var builder = new StringBuilder();
    builder.append("Course [id=").append(id).append(", ");
    if (name != null) builder.append("name=").append(name).append(", ");
    builder.append("duration=").append(duration).append("]");
    return builder.toString();
  }
}
