package AbstractPractice;

public class Test {
    static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.height = 10;
        r1.base = 20;
        r1.areaCalculator();

        Circle c1 = new Circle();
        c1.radius = 6.5;
        c1.areaCalculator();

        Triangle t1 = new Triangle();
        t1.base = 7;
        t1.height = 4;
        t1.areaCalculator();
    }
}
