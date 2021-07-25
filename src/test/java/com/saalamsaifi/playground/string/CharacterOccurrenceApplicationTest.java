package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Spectrum.class)
public class CharacterOccurrenceApplicationTest {
  private CharacterOccurrenceApplication application;

  {
    beforeEach(() -> application = new CharacterOccurrenceApplication());

    describe(
        "maxOccurrenceCharacter",
        () -> {
          it(
              "should count occurrence of character",
              () -> {
                var result = application.maxOccurrenceCharacter("Shahdab Aalam Saifi");

                assertEquals(Character.valueOf('a'), result.getKey());
                assertEquals(6, result.getValue().longValue());
              });
        });
  }

  @Test
  public void foo() {
    assertTrue(true);
  }
}
