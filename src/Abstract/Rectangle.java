package Abstract;

public class Rectangle extends Shape {
    @Override
    void areaCalculator() {
        System.out.println("Area of the rectangle: "+height*base);
    }
}
