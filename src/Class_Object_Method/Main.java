package Class_Object_Method;

public class Main {
    static void main(String [] args){
        Teacher teacher1 = new Teacher();
        teacher1.name = "Mahbub";
        teacher1.gender = "Male";
        teacher1.age = 25;

        System.out.println("Name: "+teacher1.name);
        System.out.println("Gender: "+teacher1.gender);
        System.out.println("Age: "+teacher1.age);

        System.out.println();

        Teacher teacher2 = new Teacher();
        teacher2.name = "Nur";
        teacher2.gender = "Female";
        teacher2.age = 20;

        System.out.println("Name: "+teacher2.name);
        System.out.println("Gender: "+teacher2.gender);
        System.out.println("Age: "+teacher2.age);
    }
}
