package model.entities;

import model.enums.Color;

public class Circle extends AbstractShape {
    // herda o objeto color e o contrato a ser cumprido
    private double radius;

    public Circle(double radius) {
       super();
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}
