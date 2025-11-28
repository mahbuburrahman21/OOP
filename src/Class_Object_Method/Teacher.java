package Class_Object_Method;

public class Teacher {
    String name, gender;
    int age;

    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println();
    }

    void setInformation(String n, String g, int a){
        name = n;
        gender = g;
        age = a;
    }
}