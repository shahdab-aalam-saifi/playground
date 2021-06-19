package com.saalamsaifi.playground.codility.arrays;

import com.greghaskins.spectrum.Spectrum;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.greghaskins.spectrum.Spectrum.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(Spectrum.class)
public class OddOccurrencesInArrayTest {
  private OddOccurrencesInArray application;

  {
    beforeEach(
        () -> application = new OddOccurrencesInArray());

    describe(
        "unpaired",
        () -> {
          it(
              "should return 0 when array is empty",
              () -> {
                int result = application.unpaired(new int[] {});
                assertEquals(0, result);
              });

          it(
              "should return element when array has single element",
              () -> {
                int result = application.unpaired(new int[] {10});
                assertEquals(10, result);
              });

          it(
              "should return unpaired element when array has multiple elements",
              () -> {
                int result = application.unpaired(new int[] {10, 3, 2, 2, 3, 10, 3});
                assertEquals(3, result);
              });
        });
  }

  @Test
  public void fake() {
    assertTrue(true);
  }
}
