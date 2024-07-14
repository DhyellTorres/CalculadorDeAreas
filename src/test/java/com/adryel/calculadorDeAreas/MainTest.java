package com.adryel.calculadorDeAreas;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {

  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayInputStream inContent = new ByteArrayInputStream("5\n2\n3\n0\n3\n3\n4\n4\nsair\n".getBytes());

  @BeforeEach
  public void setUpStreams() {
    System.setOut(new PrintStream(outContent));
    System.setIn(inContent);
  }

  @Test
  public void testMain() {
    Main.main(new String[] {});
    String expectedOutput = "Informe o número de lados do polígono (3 para triângulo, 4 para quadrado, ou 'sair' para calcular as áreas): Somente triângulos (3 lados) e quadrados (4 lados) são permitidos.\n"
        + "Informe o número de lados do polígono (3 para triângulo, 4 para quadrado, ou 'sair' para calcular as áreas): Somente triângulos (3 lados) e quadrados (4 lados) são permitidos.\n"
        + "Informe o número de lados do polígono (3 para triângulo, 4 para quadrado, ou 'sair' para calcular as áreas): Informe o tamanho do lado (em cm): O tamanho do lado deve ser maior que zero.\n"
        + "Informe o número de lados do polígono (3 para triângulo, 4 para quadrado, ou 'sair' para calcular as áreas): "
        + "Informe o tamanho do lado (em cm): "
        + "Informe o número de lados do polígono (3 para triângulo, 4 para quadrado, ou 'sair' para calcular as áreas): "
        + "Informe o tamanho do lado (em cm): "
        + "Informe o número de lados do polígono (3 para triângulo, 4 para quadrado, ou 'sair' para calcular as áreas): "
        + "Triângulo de lado 3.0 cm e área 3,90 cm²\n"
        + "Quadrado de lado 4.0 cm e área 16,00 cm²\n"
        + "\nÁrea total 19,90 cm²\n";
    assertEquals(expectedOutput, outContent.toString().replaceAll("\r\n", "\n"));
  }
}
