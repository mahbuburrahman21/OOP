package toStringMethod;

public class Car {
    int noOfWheel;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    //constructor
    public Car(int noOfWheel, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheel = noOfWheel;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

//    @Override
//    public String toString() {
//        //return super.toString(); // this is the full string call.
//        //if we want customized string,
//        return "My Car name is: "+name;
//    }
    //toString method can be generated also


    //Details description of an object.
    @Override
    public String toString() {
        return "Car{" +          // it's doing String concatenation
                "noOfWheel=" + noOfWheel +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    static void main(String[] args) {
        Car Cullinan = new Car(4,4,120, "Cullinan", "ab123","RR" );
        //System.out.println(Cullinan.toString()); // this is the output: toStringMethod.Car@27716f4
        //It is not important to write toString in the system out, toString is implicit. It called automatically.
        System.out.println(Cullinan);
    }
}