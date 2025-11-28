package ThisKeyword;

public class Person {
    String name;
    int age;
    String gender;

    Person(String name, int age){
        this.name =name;
        this.age = age;
    }

    Person(String name, int age, String gender){
        //Construct call using this keyword.
        // First statement should be constructor caller. Then other works.
        this(name, age);
        this.gender = gender;
    }

    void displayInfo(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
        System.out.println("Gender: "+gender);
    }
}
