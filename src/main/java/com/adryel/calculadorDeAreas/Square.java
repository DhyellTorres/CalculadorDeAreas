package com.adryel.calculadorDeAreas;

public class Square extends Polygon {

    public Square(double side) {
        super(side);
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

    @Override
    public String getType() {
        return "Quadrado";
    }
}