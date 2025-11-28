package ConstructorOverloading;

public class Teacher {
    String name, gender;
    int age;

    Teacher(){
        System.out.println("No info.");
    }
    Teacher(String n, String g){
        name = n;
        gender = g;
    }
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
