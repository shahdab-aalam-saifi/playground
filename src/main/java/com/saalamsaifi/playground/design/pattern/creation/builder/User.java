package com.saalamsaifi.playground.design.pattern.creation.builder;

public class User {
  private final String firstName;
  private final String lastName;
  private final int age;
  private final long phone;
  private final String address;

  private User(UserBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.age = builder.age;
    this.phone = builder.phone;
    this.address = builder.address;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public int getAge() {
    return age;
  }

  public long getPhone() {
    return phone;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return "User ["
        + (firstName != null ? "firstName=" + firstName + ", " : "")
        + (lastName != null ? "lastName=" + lastName + ", " : "")
        + "age="
        + age
        + ", phone="
        + phone
        + ", "
        + (address != null ? "address=" + address : "")
        + "]";
  }

  public static class UserBuilder {
    private final String firstName;
    private final String lastName;
    private int age;
    private long phone;
    private String address;

    public UserBuilder(String firstName, String lastName) {
      super();
      this.firstName = firstName;
      this.lastName = lastName;
    }

    public UserBuilder age(int age) {
      this.age = age;
      return this;
    }

    public UserBuilder phone(long phone) {
      this.phone = phone;
      return this;
    }

    public UserBuilder address(String address) {
      this.address = address;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }
}
