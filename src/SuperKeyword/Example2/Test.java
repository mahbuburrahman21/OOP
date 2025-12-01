package SuperKeyword.Example2;

public class Test extends A {
    static void main(String[] args) {
        B obj =  new B();
        // output will be A's constructor, B's constructor.
        System.out.println("Value of x from base class: "+obj.x);

        obj.display();
        obj.xValueDisplay();
    }
}
//this is how instance variables and method can be access using super keyword.
//When same name variables and methods are declared in both class.