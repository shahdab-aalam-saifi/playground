package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import com.saalamsaifi.playground.common.model.Pair;
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
        "countVowelAndConsonants",
        () -> {
          it(
              "count",
              () -> {
                Pair<Long, Long> result =
                    application.countVowelAndConsonants("SAALAMSAIFI@GMAIL.COM");

                assertEquals(9L, result.getKey().longValue());
                assertEquals(10L, result.getValue().longValue());
              });
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
