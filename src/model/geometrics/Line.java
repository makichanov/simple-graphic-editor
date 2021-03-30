package model.geometrics;

import javafx.scene.canvas.GraphicsContext;
import java.awt.Point;

public class Line extends GeometricFigure {

    public Line(Point startPoint, Point endPoint) {
        super(startPoint, endPoint);
    }

    public Line() {
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {

        graphicsContext.strokeLine(startPoint.getX(), startPoint.getY(), endPoint.getX(), endPoint.getY());
    }
}
