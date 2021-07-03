package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Spectrum.class)
public class ReverseWordApplicationTest {
  private ReverseWordApplication application;

  {
    beforeAll(() -> application = new ReverseWordApplication());

    describe(
        "reverseWords",
        () -> {
          it(
              "reverse",
              () -> {
                var result = application.reverseWords("Shahdab Aalam Saifi");

                assertEquals("badhahS malaA ifiaS", result);
              });
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
