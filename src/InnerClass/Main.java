package InnerClass;

public class Main {
    static void main(String[] args) {
        A obj1 = new A();
        obj1.display();

        //But if try to create object of Inner class B
        //B obj2 = new B(); // error -> it cannot find B
        //Because B is the part of A
        //To access B, we need to write A.B

        //A.B obj2 = new B(); //error again.
        //Because we need the object of A to access B.

        //A.B obj2 = new A.B(); // error again
        //this is not the proper syntax to access object of A
        //So, the final annotation will be
        A.B obj2 = obj1.new B();
        obj2.config();
        //Because if we want to create an object of B then we must need the object of A.
        //As like other non-static methods and variables.
        //All non-static method needs object to access.

        //If we make static class like C.....
        //Then the object of A is not required.
        A.C obj3 = new A.C(); // A.C will access the C.
        obj3.Show();
    }
}
