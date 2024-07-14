package com.adryel.calculadorDeAreas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class SquareTest {

  @Test
  public void testCalculateArea() {
    Square square = new Square(4);
    double expectedArea = 4 * 4;
    assertEquals(expectedArea, square.calculateArea(), 0.01);
  }

  @Test
  public void testGetType() {
    Square square = new Square(4);
    assertEquals("Quadrado", square.getType());
  }

  @Test
  public void testToString() {
    Square square = new Square(4);
    String expectedString = "Quadrado de lado 4.0 cm e área " + String.format("%.2f", square.calculateArea()) + " cm²";
    assertEquals(expectedString, square.toString());
  }
}
