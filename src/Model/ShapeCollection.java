package Model;

import java.util.Arrays;
import java.util.Comparator;

public class ShapeCollection{
    private final Shape[] shapes;

    public ShapeCollection(Shape[] shapes){
        this.shapes = Arrays.copyOf(shapes, shapes.length);
    }

    public Shape[] getShapes(){
        return Arrays.copyOf(shapes, shapes.length);
    }

    public double getTotalArea(){
        double totalArea = 0.0;
        for (Shape shape:shapes){
            totalArea+=shape.calcArea();
        }
        return totalArea;
    }

    public double getTotalTypeArea(Class<? extends Shape> shapeClass){
        double totalTypeArea = 0.0;
        for (Shape shape:shapes){
            if (shapeClass.isInstance(shape)){
                totalTypeArea+=shape.calcArea();
            }
        }
        return totalTypeArea;
    }

    public Shape[] sortByArea(){
        Shape[] sortedShapes = Arrays.copyOf(shapes, shapes.length);
        Comparator<Shape> areaComparator = Comparator.comparingDouble(Shape::calcArea);
        Arrays.sort(sortedShapes, areaComparator);
        return sortedShapes;
    }

    public Shape[] sortByColor(){
        Shape[] sortedShapes = Arrays.copyOf(shapes, shapes.length);
        Comparator<Shape> colorComparator = Comparator.comparing(Shape::getShapeColor, String.CASE_INSENSITIVE_ORDER);
        Arrays.sort(sortedShapes, colorComparator);
        return sortedShapes;
    }
}
