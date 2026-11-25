package Controller;

import Model.*;
import View.ShapeView;

public class ShapeController {
    private final ShapeCollection collection;
    private final ShapeView view;

    public ShapeController(ShapeCollection shapeCollection, ShapeView shapeView) {
        this.collection = shapeCollection;
        this.view = shapeView;
    }

    public void run(){
        Shape[] initialShapes = collection.getShapes();

        view.printShapes(initialShapes);
        System.out.println("==============================");

        view.printTotalArea(collection.getTotalArea());
        System.out.println("=============================");

        view.printTotalTypeArea("Прямокутник", collection.getTotalTypeArea(Rectangle.class));
        view.printTotalTypeArea("Трикутник", collection.getTotalTypeArea(Triangle.class));
        view.printTotalTypeArea("Коло", collection.getTotalTypeArea(Circle.class));
        System.out.println("=============================");

        Shape[] sortedByArea=collection.sortByArea();
        System.out.println("Сортування за площею");
        view.printShapes(sortedByArea);
        System.out.println("=============================");

        Shape[] sortedByColor=collection.sortByColor();
        System.out.println("Сортування за кольором");
        view.printShapes(sortedByColor);
        System.out.println("=============================");
    }
}
