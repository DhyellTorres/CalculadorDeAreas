package com.adryel.calculadorDeAreas;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class PolygonTest {

  // Subclasse de teste para Polygon
  private class TestPolygon extends Polygon {
    public TestPolygon(double side) {
      super(side);
    }

    @Override
    public double calculateArea() {
      return side * side; // implementação fictícia apenas para teste
    }

    @Override
    public String getType() {
      return "TestPolygon";
    }
  }

  @Test
  public void testConstructor() {
    Polygon polygon = new TestPolygon(5);
    assertEquals(5.0, polygon.side, 0.01);
  }

  @Test
  public void testToString() {
    Polygon polygon = new TestPolygon(5);
    String expectedString = "TestPolygon de lado 5.0 cm e área 25,00 cm²";
    assertEquals(expectedString, polygon.toString());
  }
}
