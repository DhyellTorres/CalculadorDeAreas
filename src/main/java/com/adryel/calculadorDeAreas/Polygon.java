package com.adryel.calculadorDeAreas;

public abstract class Polygon {
    protected double side;

    public Polygon(double side) {
        this.side = side;
    }

    public abstract double calculateArea();

    public abstract String getType();

    @Override
    public String toString() {
        return getType() + " de lado " + side + " cm e área " + String.format("%.2f", calculateArea()) + " cm²";
    }
}
