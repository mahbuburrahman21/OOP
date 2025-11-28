package Constructor;

public class Main {
    static void main(String[] args) {
        Teacher teacher1 = new Teacher("Mahbub", "Male", 25);
        teacher1.displayInformation();

        Teacher teacher2 = new Teacher("Nur", "Female", 20);
        teacher2.displayInformation();

        Teacher teacher3 = new Teacher();
        teacher3.displayInformation();
    }
}
