package StaticKeyword;

public class Student {
    String name;
    int id;
    static String universityName;

    Student (String Name, int ID, String UniName){
        name = Name;
        id = ID;
        universityName = UniName;
    }

    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("University Name: "+universityName);
        System.out.println();
    }
}
