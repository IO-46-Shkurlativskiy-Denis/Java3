package View;

import Model.Shape;

public class ShapeView {
    public void printShapes(Shape[] shapes){
        System.out.println("-----------Фігури-----------");
        int i=1;
        for(Shape s: shapes){
            System.out.println(i+") "+s.toString());
            i++;
        }
    }

    public void printTotalArea(double area){
        System.out.println("Сумарна площа = "+area);
    }

    public void printTotalTypeArea(String shapeName, double area){
        System.out.println("Фігура - "+shapeName+". Сумарна площа = "+area);
    }
}
