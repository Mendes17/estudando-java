package model.entities;

import model.enums.Color;

public abstract class AbstractShape implements Shape {

    private Color color;

    public AbstractShape() {}

    public AbstractShape(Color color) {
        this.color = color;
    }
    // cria o objto a ser herdado e uni com o contrato
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
