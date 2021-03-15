package model;

import javafx.scene.canvas.GraphicsContext;

public class Square extends GeometricFigure {

    long length;

    public Square(Coordinates startPoint, long length) {
        super(startPoint);
        this.length = length;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.fillRect(startPoint.getX(), startPoint.getY(), length, length);
    }
}
