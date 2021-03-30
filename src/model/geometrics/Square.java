package model.geometrics;

import javafx.scene.canvas.GraphicsContext;
import java.awt.Point;

public class Square extends GeometricFigure {

    long length;

    public Square(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    public Square() {
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        this.length = Math.max((long) Math.abs(endPoint.getX() - startPoint.getX()),
                (long) Math.abs(endPoint.getY() - startPoint.getY()));
        graphicsContext.fillRect(startPoint.getX(), startPoint.getY(), length, length);
    }
}
