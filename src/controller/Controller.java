package controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import model.*;

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

    @FXML
    void initialize() {
        assert canvas != null : "fx:id=\"canvas\" was not injected: check your FXML file 'main.fxml'.";
        assert squareButton != null : "fx:id=\"squareButton\" was not injected: check your FXML file 'main.fxml'.";
        assert rectangleButton != null : "fx:id=\"rectangleButton\" was not injected: check your FXML file 'main.fxml'.";
        assert circleButton != null : "fx:id=\"circleButton\" was not injected: check your FXML file 'main.fxml'.";
        assert ellipseButton != null : "fx:id=\"ellipseButton\" was not injected: check your FXML file 'main.fxml'.";
        assert lineButton != null : "fx:id=\"lineButton\" was not injected: check your FXML file 'main.fxml'.";
        assert listButton != null : "fx:id=\"listButton\" was not injected: check your FXML file 'main.fxml'.";

        initList();

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
        FigureList.getList().add(new Line(new Coordinates(50, 50), new Coordinates(600, 500)));
        FigureList.getList().add(new Square(new Coordinates(100, 100), 100));
        FigureList.getList().add(new Rectangle(new Coordinates(200, 200), 100, 200));
        FigureList.getList().add(new Circle(new Coordinates(300, 300), 103));
        FigureList.getList().add(new Ellipse(new Coordinates(400, 400), 50, 175));
    }
}
