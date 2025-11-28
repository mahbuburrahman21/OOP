package Constructor;

public class Teacher {
    String name, gender;
    int age;


    //Default Constructor
    Teacher(){
    }


    //Parametrized Constructor
    Teacher(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }


    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println();
    }
}
