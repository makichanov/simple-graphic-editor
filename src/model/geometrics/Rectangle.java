package model.geometrics;

import javafx.scene.canvas.GraphicsContext;

import java.awt.Point;

public class Rectangle extends Square {

    long width;

    public Rectangle(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    public Rectangle() {
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        super.length = (long) Math.abs(endPoint.getX() - startPoint.getX());
        this.width = (long) Math.abs(endPoint.getY() - startPoint.getY());
        graphicsContext.fillRect(startPoint.getX(), startPoint.getY(), length, width);
    }
}
