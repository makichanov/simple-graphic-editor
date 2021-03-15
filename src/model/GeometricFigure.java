package model;

import javafx.scene.canvas.GraphicsContext;

public abstract class GeometricFigure {

    Coordinates startPoint;

    public GeometricFigure(Coordinates startPoint) {
        this.startPoint = startPoint;
    }

    public abstract void draw(GraphicsContext graphicsContext);

}
