package Abstract;

public class Circle extends Shape{
    @Override
    void areaCalculator() {
        System.out.println("Area of the rectangle: "+Math.PI*Math.pow(radius, 2));
    }
}
