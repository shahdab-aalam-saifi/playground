package com.saalamsaifi.playground.immutable;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.validation.ConstraintViolation;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.*;

@RunWith(Spectrum.class)
public class ImmutableUserBuilderApplicationTest {
  private ImmutableUserBuilderApplication application;
  private User user;

  {
    describe(
        "User",
        () -> {
          it(
              "mandatory fields",
              () -> {
                user = User.builder("saalamsaifi@gmail.com", "saalamsaifi").build();

                assertEquals("saalamsaifi@gmail.com", user.getEmail());
                assertEquals("saalamsaifi", user.getUserName());
              });

          it(
              "optional fields",
              () -> {
                user =
                    User.builder("saalamsaifi@gmail.com", "saalamsaifi")
                        .firstName("Shahdab Aalam")
                        .lastName("Saifi")
                        .build();

                assertEquals("Shahdab Aalam", user.getFirstName());
                assertEquals("Saifi", user.getLastName());
                assertNotNull(user.getCreateAt());
              });
        });

    describe(
        "validate",
        () -> {
          beforeEach(
              () -> {
                application = new ImmutableUserBuilderApplication();
              });

          it(
              "should return no violation",
              () -> {
                var userBuilder = new User.UserBuilder("saalamsaifi@gmail.com", "saalamsaifi");
                var violations = application.validate(userBuilder);

                assertTrue(violations.isEmpty());
              });

          it(
              "should return violation in email",
              () -> {
                var userBuilder = new User.UserBuilder("saalamsaifi.com", "saalamsaifi");
                var violations = application.validate(userBuilder);

                for (ConstraintViolation<User.UserBuilder> violation : violations) {
                  assertEquals("email", violation.getPropertyPath().toString());
                }
              });

            it(
                    "should return violation in userName",
                    () -> {
                        var userBuilder = new User.UserBuilder("saalamsaifi@gmail.com", "saifi");
                        var violations = application.validate(userBuilder);

                        for (ConstraintViolation<User.UserBuilder> violation : violations) {
                            assertEquals("userName", violation.getPropertyPath().toString());
                        }
                    });
        });
  }

  @Test
  public void foo() {
    assertTrue(true);
  }
}
