package FinalKeyword;

public class University {
    final String name = "DIU"; //Final variable (cannot be changed)
    final int fees; // blank final variable
    static final int semesterFees; // static blank final variable

    //blank final variable can be initialized in only using constructor.
    University(){
        fees = 850000;
    }

    //static blank final variable can be initialized in only using static block.
    static {
        semesterFees = 100000;
    }

    // final method cannot be overridden.
    //But it can be inherited.
    final void display(){
        System.out.println("University Information.");
    }
}
