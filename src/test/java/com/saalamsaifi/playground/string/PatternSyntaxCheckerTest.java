package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Spectrum.class)
public class PatternSyntaxCheckerTest {
  private PatternSyntaxChecker application;

  {
    beforeEach(() -> application = new PatternSyntaxChecker());

    describe(
        "syntaxChecker",
        () -> {
          it(
              "should return INVALID when string is null",
              () -> {
                assertEquals("INVALID", application.syntaxChecker(null));
              });

          it(
              "should return VALID when string is empty",
              () -> {
                assertEquals("VALID", application.syntaxChecker(""));
              });

          it(
              "should return VALID when string is not empty",
              () -> {
                assertEquals("VALID", application.syntaxChecker("[A-Z]"));
              });
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
