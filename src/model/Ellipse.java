package model;

import javafx.scene.canvas.GraphicsContext;
import java.awt.Point;

public class Ellipse extends Circle {

    long diameterVertical;

    public Ellipse(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    public Ellipse() {
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        super.diameter = (long) Math.abs(endPoint.getX() - startPoint.getX());
        this.diameterVertical = (long) Math.abs(endPoint.getY() - startPoint.getY());
        graphicsContext.fillOval(startPoint.getX(), startPoint.getY(), diameter, diameterVertical);
    }
}
