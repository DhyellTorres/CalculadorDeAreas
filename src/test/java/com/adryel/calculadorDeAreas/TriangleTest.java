package com.adryel.calculadorDeAreas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TriangleTest {

  @Test
  public void testCalculateArea() {
    Triangle triangle = new Triangle(3);
    double expectedArea = (Math.sqrt(3) / 4) * (3 * 3);
    assertEquals(expectedArea, triangle.calculateArea(), 0.01);
  }

  @Test
  public void testGetType() {
    Triangle triangle = new Triangle(3);
    assertEquals("Triângulo", triangle.getType());
  }

  @Test
  public void testToString() {
    Triangle triangle = new Triangle(3);
    String expectedString = "Triângulo de lado 3.0 cm e área " + String.format("%.2f", triangle.calculateArea())
        + " cm²";
    assertEquals(expectedString, triangle.toString());
  }
}
