package SuperKeyword.Example;

public class Car extends Vehicle{
    //color, weight, attribute()
    int speed;
    Car(String color, double weight, int speed){
        super(color,weight); // Calling the constructor of vehicle class.
        this.speed = speed;
    }

    @Override
    void attribute() {
        super.attribute();
        System.out.println("Speed: "+ speed+" Km/h");
    }
}
