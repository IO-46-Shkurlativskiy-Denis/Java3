package Model;

public abstract class Shape implements Drawable{
    String shapeColor;

    Shape(String shapeColor){
        this.shapeColor = shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString(){
        return "Фігура має "+shapeColor+" колір. Площа фігури = "+String.format("%.2f",calcArea());
    }
}
