package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Spectrum.class)
public class VowelConsonantCountApplicationTest {
  private VowelConsonantCountApplication application;

  {
    beforeAll(() -> application = new VowelConsonantCountApplication());

    describe(
        "reverseWords",
        () -> {
          it(
              "reverse",
              () -> {
                var result = application.countVowelAndConsonants("SAALAMSAIFI@GMAIL.COM");

                assertEquals(9L, result.getVowels().longValue());
                assertEquals(10L, result.getConsonants().longValue());
              });
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
