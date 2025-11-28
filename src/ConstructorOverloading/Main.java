package ConstructorOverloading;

public class Main {
    static void main(String[] args) {
        Teacher teacher1= new Teacher();
        teacher1.displayInformation();

        Teacher teacher2= new Teacher("Mahbub", "Male");
        teacher2.displayInformation();

        Teacher teacher3= new Teacher("Nur", "Female", 20);
        teacher3.displayInformation();
    }
}
