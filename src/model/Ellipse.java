package model;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Ellipse extends Circle {

    long diameterVertical;

    public Ellipse(Coordinates startPoint, long diameterHorizontal, long diameterVertical) {
        super(startPoint, diameterHorizontal);
        this.diameterVertical = diameterVertical;
    }

    @Override
    public void draw(GraphicsContext graphicsContext) {
        graphicsContext.fillOval(startPoint.getX(), startPoint.getY(), diameter, diameterVertical);
    }
}
