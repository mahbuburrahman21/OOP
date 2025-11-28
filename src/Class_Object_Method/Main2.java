package Class_Object_Method;

public class Main2 {
    static void main(String[] args) {
        Teacher teacher1 = new Teacher();

        teacher1.name = "Mahbub";
        teacher1.gender = "Male";
        teacher1.age = 25;
        teacher1.displayInformation();

        System.out.println();
        Teacher teacher2 = new Teacher();

        teacher2.name = "Nur";
        teacher2.gender = "Female";
        teacher2.age = 20;
        teacher2.displayInformation();
    }
}
