package model;
import java.util.ArrayList;
import java.util.List;

public class FigureList {

    private static List<GeometricFigure> list = new ArrayList<>();

    public static List<GeometricFigure> getList() {
        return list;
    }

    public static void setList(List<GeometricFigure> list) {
        FigureList.list = list;
    }
}
