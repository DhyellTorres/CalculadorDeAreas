package com.adryel.calculadorDeAreas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Polygon> polygons = new ArrayList<>();
            String input;

            while (true) {
                System.out.print(
                        "Informe o número de lados do polígono (3 para triângulo, 4 para quadrado, ou 'sair' para calcular as áreas): ");
                input = scanner.nextLine();

                if (input.equalsIgnoreCase("sair")) {
                    break;
                }

                int numberOfSides;
                try {
                    numberOfSides = Integer.parseInt(input);
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido. Por favor, insira um número válido de lados.");
                    continue;
                }

                if (numberOfSides != 3 && numberOfSides != 4) {
                    System.out.println("Somente triângulos (3 lados) e quadrados (4 lados) são permitidos.");
                    continue;
                }

                System.out.print("Informe o tamanho do lado (em cm): ");
                input = scanner.nextLine();
                double side;
                try {
                    side = Double.parseDouble(input);
                } catch (NumberFormatException e) {
                    System.out.println("Valor inválido. Por favor, insira um número válido para o tamanho do lado.");
                    continue;
                }

                if (side <= 0) {
                    System.out.println("O tamanho do lado deve ser maior que zero.");
                    continue;
                }

                Polygon polygon = null;
                if (numberOfSides == 3) {
                    polygon = new Triangle(side);
                } else if (numberOfSides == 4) {
                    polygon = new Square(side);
                }

                polygons.add(polygon);
            }

            double totalArea = 0;
            for (Polygon polygon : polygons) {
                System.out.println(polygon);
                totalArea += polygon.calculateArea();
            }

            System.out.println("\nÁrea total " + String.format("%.2f", totalArea) + " cm²");
        }
    }
}
