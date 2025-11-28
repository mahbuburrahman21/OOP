package StaticKeyword;

public class Student2 {
    String name;
    int id;
    static String universityName = "DIU";//Static-----------------

    Student2 (String Name, int ID){
        name = Name;
        id = ID;
    }

    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University Name: "+universityName);
        System.out.println();
    }
}