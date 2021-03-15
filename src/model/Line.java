package model;

import javafx.scene.canvas.GraphicsContext;

public class Line extends GeometricFigure {

    Coordinates finishPoint;

    public Line(Coordinates startPoint, Coordinates finishPoint) {
        super(startPoint);
        this.finishPoint = finishPoint;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.strokeLine(startPoint.getX(), startPoint.getY(), finishPoint.getX(), finishPoint.getY());
    }
}
