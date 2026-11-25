package Model;

public class Circle extends Shape{
    private final double radius;

    public Circle(String shapeColor,double radius){
        super(shapeColor);
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double calcArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public void draw() {
        System.out.printf("Малюємо (%s) коло(радіус=%.2f, площа=%.2f%n",
                getShapeColor(), radius, calcArea());
    }

    @Override
    public String toString(){
        return "Коло має "+shapeColor+
                " колір, радіус="+radius+
                ". Площа кола = "+String.format("%.2f",calcArea());
    }
}
