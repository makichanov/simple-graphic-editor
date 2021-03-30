package controller;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import model.FigureList;
import model.geometrics.*;
import model.geometrics.Rectangle;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Canvas canvas;

    @FXML
    private Button squareButton;

    @FXML
    private Button rectangleButton;

    @FXML
    private Button circleButton;

    @FXML
    private Button ellipseButton;

    @FXML
    private Button lineButton;

    @FXML
    private Button listButton;

    private GeometricFigure currentFigure;

    private boolean isLine;

    @FXML
    void initialize() {
        assert canvas != null : "fx:id=\"canvas\" was not injected: check your FXML file 'main.fxml'.";
        assert squareButton != null : "fx:id=\"squareButton\" was not injected: check your FXML file 'main.fxml'.";
        assert rectangleButton != null : "fx:id=\"rectangleButton\" was not injected: check your FXML file 'main.fxml'.";
        assert circleButton != null : "fx:id=\"circleButton\" was not injected: check your FXML file 'main.fxml'.";
        assert ellipseButton != null : "fx:id=\"ellipseButton\" was not injected: check your FXML file 'main.fxml'.";
        assert lineButton != null : "fx:id=\"lineButton\" was not injected: check your FXML file 'main.fxml'.";
        assert listButton != null : "fx:id=\"listButton\" was not injected: check your FXML file 'main.fxml'.";

        currentFigure = new Square();

        initList();

        canvas.setOnMousePressed(mouseEvent -> {
            currentFigure.setStartPoint(new Point((int) mouseEvent.getX(), (int) mouseEvent.getY()));
        });

        canvas.setOnMouseReleased(mouseEvent -> {
            currentFigure.setEndPoint(new Point((int) mouseEvent.getX(), (int) mouseEvent.getY()));

            if (!isLine)
                fixPoints(currentFigure);
            GraphicsContext context = canvas.getGraphicsContext2D();
            context.setFill(Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            currentFigure.draw(context);
        });

    }

    @FXML
    private void drawListAction() {
        GraphicsContext context = canvas.getGraphicsContext2D();
        for (GeometricFigure figure : FigureList.getList()) {
            context.setFill(Color.rgb((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            figure.draw(context);
        }
    }

    private void initList() {
        FigureList.getList().add(new Line(new Point(0, 0), new Point(600, 500)));
        FigureList.getList().add(new Square(new Point(50, 50), new Point(100, 100)));
        FigureList.getList().add(new Rectangle(new Point(100, 100), new Point(200, 200)));
        FigureList.getList().add(new Circle(new Point(200, 200), new Point(300, 300)));
        FigureList.getList().add(new Ellipse(new Point(300, 300), new Point(350, 500)));
    }

    @FXML
    private void handleLine() {
        currentFigure = new Line();
        isLine = true;
    }

    @FXML
    private void handleSquare() {
        currentFigure = new Square();
        isLine = false;
    }

    @FXML
    private void handleRectangle() {
        currentFigure = new Rectangle();
        isLine = false;
    }

    @FXML
    private void handleCircle() {
        currentFigure = new Circle();
        isLine = false;
    }

    @FXML
    private void handleEllipse() {
        currentFigure = new Ellipse();
        isLine = false;
    }

    private void fixPoints(GeometricFigure figure) {
        if (figure.getEndPoint().y < figure.getStartPoint().y) {
            int temp = figure.getEndPoint().y;
            figure.getEndPoint().y = figure.getStartPoint().y;
            figure.getStartPoint().y = temp;
        }
        if (figure.getEndPoint().x < figure.getStartPoint().x) {
            int temp = figure.getEndPoint().x;
            figure.getEndPoint().x = figure.getStartPoint().x;
            figure.getStartPoint().x = temp;
        }
    }
}
