package com.saalamsaifi.playground.immutable;

public final class Student {
  private final int rollNumber;
  private final String name;
  private final Course course;

  public Student(int rollNumber, String name, Course course) {
    this.rollNumber = rollNumber;
    this.name = name;
    this.course = course;
  }

  /** @return the rollNumber */
  public int getRollNumber() {
    return rollNumber;
  }

  /** @return the name */
  public String getName() {
    return name;
  }

  /** @return the course */
  public Course getCourse() throws CloneNotSupportedException {
    return (Course) course.clone();
  }

  @Override
  public String toString() {
    var builder = new StringBuilder();
    builder.append("Student [rollNumber=").append(rollNumber).append(", ");
    if (name != null) builder.append("name=").append(name).append(", ");
    if (course != null) builder.append("course=").append(course);
    builder.append("]");
    return builder.toString();
  }
}
