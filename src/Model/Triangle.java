package Model;

public class Triangle extends Shape{
    private final double base;
    private final double height;

    public Triangle(String shapeColor, double base, double height){
        super(shapeColor);
        this.base = base;
        this.height = height;
    }

    public double getBase(){
        return base;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public double calcArea() {
        return 0.5 * base * height;
    }

    @Override
    public void draw() {
        System.out.printf("Малюємо (%s) трикутник(основа=%.2f, висота=%.2f, площа=%.2f%n",
                getShapeColor(), base, height, calcArea());
    }

    @Override
    public String toString(){
        return "Трикутник має "+shapeColor+
                " колір, висота="+height+
                ", основа="+base+
                ". Площа трикутника = "+String.format("%.2f",calcArea());
    }
}
