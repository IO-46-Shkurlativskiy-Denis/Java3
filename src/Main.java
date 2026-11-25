import Controller.ShapeController;
import Model.*;
import View.ShapeView;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes=new Shape[]{
                new Rectangle("червоний", 2.0, 4.0),
                new Triangle("Жовтий",1.5,6.0),
                new Rectangle("Помаранчевий",3.0,7.0),
                new Circle("синій",10.0),
                new Circle("зелений",7.0),
                new Rectangle("Зелений",4.5,5.0),
                new Triangle("синій",5.0,9.0),
                new Triangle("білий",2.0,1.0),
                new Circle("голубий",3.0),
                new Rectangle("фіолетовий",8.0,8.0)
        };

        ShapeCollection collection=new ShapeCollection(shapes);
        ShapeView view=new ShapeView();
        ShapeController controller=new ShapeController(collection,view);

        controller.run();
    }
}