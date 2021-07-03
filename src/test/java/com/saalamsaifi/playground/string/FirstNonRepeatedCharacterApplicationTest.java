package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Spectrum.class)
public class FirstNonRepeatedCharacterApplicationTest {
  private FirstNonRepeatedCharacterApplication application;

  {
    beforeAll(() -> application = new FirstNonRepeatedCharacterApplication());

    describe(
        "firstNonRepeatedCharacter",
        () -> {
          it(
              "first non repeated character",
              () -> {
                var result = application.firstNonRepeatedCharacter("shahdab-aalam-saifi");

                assertEquals("d", result);
              });
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
