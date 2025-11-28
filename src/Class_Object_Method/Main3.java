package Class_Object_Method;

public class Main3 {
    static void main(String[] args) {
        Teacher teacher1 = new Teacher();
        teacher1.setInformation("Mahbub", "Male", 25);
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher();
        teacher2.setInformation("Nur", "Female", 20);
        teacher2.displayInformation();
    }
}
