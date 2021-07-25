package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Spectrum.class)
public class DuplicateCharacterApplicationTest {
  private DuplicateCharacterApplication application;

  {
    beforeAll(() -> application = new DuplicateCharacterApplication());

    describe(
        "countDuplicateCharacters",
        () -> {
          it(
              "should count duplicate characters",
              () -> {
                var result = application.countDuplicateCharacters("shahdab-aalam-saifi");

                assertEquals(6, result.get("a").longValue());
                assertEquals(2, result.get("s").longValue());
              });
        });

    describe(
        "removeDuplicateCharacters",
        () -> {
          it(
              "should remove duplicates",
              () -> {
                var result = application.removeDuplicateCharacters("shahdab-aalam-saifi");

                assertEquals("shadb-lmif", result);
              });
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
