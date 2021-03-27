package model;

import javafx.scene.canvas.GraphicsContext;
import java.awt.Point;

public class Circle extends GeometricFigure {

    long diameter;

    public Circle(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    public Circle() {
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        this.diameter = Math.max((long) Math.abs(endPoint.getX() - startPoint.getX()),
                (long) Math.abs(endPoint.getY() - startPoint.getY()));
        graphicsContext.fillOval(startPoint.getX(), startPoint.getY(), diameter, diameter);
    }
}
