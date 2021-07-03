package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Spectrum.class)
public class JoinByDelimiterApplicationTest {
  private JoinByDelimiterApplication application;

  {
    beforeAll(() -> application = new JoinByDelimiterApplication());

    describe(
        "joinBy",
        () -> {
          it(
              "join",
              () -> {
                var result = application.joinBy(' ', "Shahdab", "Aalam", "Saifi");

                assertEquals("Shahdab Aalam Saifi", result);
              });
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
