package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle extends GeometricFigure {

    long diameter;

    public Circle(Coordinates startPoint, long diameter) {
        super(startPoint);
        this.diameter = diameter;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.fillOval(startPoint.getX(), startPoint.getY(), diameter, diameter);
    }
}
