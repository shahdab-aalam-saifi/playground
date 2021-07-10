package com.saalamsaifi.playground.immutable;

import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

public final class User {
  private final String firstName;
  private final String lastName;
  private final String email;
  private final String userName;
  private final LocalDateTime createAt;

  private User(UserBuilder builder) {
    this.firstName = builder.firstName;
    this.lastName = builder.lastName;
    this.email = builder.email;
    this.userName = builder.userName;
    this.createAt = builder.createAt;
  }

  public static UserBuilder builder(String email, String userName) {
    return new UserBuilder(email, userName);
  }

  public static final class UserBuilder {
    private String firstName;
    private String lastName;

    @Email(message = "must be valid")
    private final String email;

    @Size(min = 6, max = 20, message = "must be between 6 to 20 characters")
    private final String userName;

    private final LocalDateTime createAt;

    public UserBuilder(String email, String userName) {
      this.email = email;
      this.userName = userName;
      this.createAt = LocalDateTime.now();
    }

    public UserBuilder firstName(String firstName) {
      this.firstName = firstName;
      return this;
    }

    public UserBuilder lastName(String lastName) {
      this.lastName = lastName;
      return this;
    }

    public User build() {
      return new User(this);
    }
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getEmail() {
    return email;
  }

  public String getUserName() {
    return userName;
  }

  public LocalDateTime getCreateAt() {
    return createAt;
  }
}
