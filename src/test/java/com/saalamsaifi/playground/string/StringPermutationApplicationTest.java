package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.assertTrue;

@RunWith(Spectrum.class)
public class StringPermutationApplicationTest {
  private StringPermutationApplication application;

  {
    beforeAll(() -> application = new StringPermutationApplication());

    describe(
        "permutation",
        () -> {
          it(
              "permutation",
              () -> {
                application.permutation("", "QWERTY");
              });
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
