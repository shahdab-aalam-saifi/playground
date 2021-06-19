package com.saalamsaifi.playground.string;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.*;

@RunWith(Spectrum.class)
public class StringCompressionApplicationTest {
  private StringCompressionApplication application;

  {
    beforeEach(
        () -> application = new StringCompressionApplication());

    describe(
        "compress",
        () -> {
          it(
              "should return compressed string when source is not empty",
              () -> {
                String result = application.compress("aabbbcc");
                assertEquals("a2b3c2", result);
              });

          it(
              "should return null when source is null",
              () -> {
                String result = application.compress(null);
                assertNull(result);
              });

          it(
              "should return empty string when source is empty",
              () -> {
                String result = application.compress("");
                assertEquals("", result);
              });
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
