package com.adryel.calculadorDeAreas;

public class Triangle extends Polygon {

    public Triangle(double side) {
        super(side);
    }

    @Override
    public double calculateArea() {
        return (Math.sqrt(3) / 4) * (side * side);
    }

    @Override
    public String getType() {
        return "Triângulo";
    }
}