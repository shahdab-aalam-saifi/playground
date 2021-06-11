package com.saalamsaifi.playground.design.pattern.creation.builder;

public class BuilderApplication {
  public static void main(String[] args) {
    var user =
        new User.UserBuilder("Shahdab Aalam", "Saifi")
            .age(23)
            .phone(1234567890)
            .address("India")
            .build();

    System.out.println(user);

    user = new User.UserBuilder("Shahdab Aalam", "Saifi").build();

    System.out.println(user.getFirstName() + " " + user.getLastName());
  }
}
