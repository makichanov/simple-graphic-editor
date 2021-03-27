package model;

import javafx.scene.canvas.GraphicsContext;

import java.awt.Point;

public abstract class GeometricFigure {

    Point startPoint;
    Point endPoint;

    public GeometricFigure(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public GeometricFigure() {
    }

    public abstract void draw(GraphicsContext graphicsContext);

    public Point getStartPoint() {
        return this.startPoint;
    }

    public void setStartPoint(Point p) {
        this.startPoint = p;
    }

    public Point getEndPoint() {
        return this.endPoint;
    }

    public void setEndPoint(Point p) {
        this.endPoint = p;
    }

}
