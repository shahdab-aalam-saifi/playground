package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Collections;
import java.util.HashSet;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.*;

@RunWith(Spectrum.class)
public class LargestWordApplicationTest {
  private LargestWordApplication application;

  {
    beforeEach(() -> application = new LargestWordApplication());

    describe(
        "largestWord",
        () -> {
          it(
              "should return word when string is not empty",
              () -> {
                assertEquals(
                    new HashSet<>(Collections.singletonList("Welcome")),
                    application.largestWord("Welcome to the family", 1));

                assertEquals(
                    new HashSet<>(Collections.singletonList("family")),
                    application.largestWord("Welcome to the family", 2));
              });

          it(
              "should throw exception when string is empty",
              () ->
                  assertThrows(
                      IllegalArgumentException.class, () -> application.largestWord("", 2)));

          it(
              "should throw exception when n < 0",
              () ->
                  assertThrows(
                      IllegalArgumentException.class,
                      () -> application.largestWord("Welcome to the family", 0)));
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
