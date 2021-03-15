package model;

import javafx.scene.canvas.GraphicsContext;

public class Rectangle extends Square {

    long width;

    public Rectangle(Coordinates startPoint, long length, long width) {
        super(startPoint, length);
        this.width = width;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.fillRect(startPoint.getX(), startPoint.getY(), width, length);
    }
}
