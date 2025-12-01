package SuperKeyword.Example2;

public class B extends A{
    int x = 10;



    B(){
        //super class constructor should be the first statement.
        super();// this is how super class constructor are being called
        // if super class constructor have any parameter, then user have to pass by the parameter when calling.
        System.out.println("B's constructor");
    }


    void display(){
        //super class method call
        super.display();
        System.out.println("in B class");
    }

    void xValueDisplay(){
        //super class variable call
        System.out.println("Value of x form super class: "+ super.x);
    }
}
