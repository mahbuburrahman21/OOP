package Challenge52;

public class Main {
    static void main(String[] args) {
        Course course1 = new Course("Java");

        course1.enrollStudent("Mahbub");
        course1.enrollStudent("Fuad");
        course1.enrollStudent("Meghla");
        course1.enrollStudent("Mahir");
        course1.enrollStudent("Fahim");
        course1.enrollStudent("Rafin");
        course1.displayStudent();

        course1.unenrollStudent("Fuad");
        course1.unenrollStudent("Fahim");
        course1.enrollStudent("Masud");
        course1.enrollStudent("Rabbi");
        course1.enrollStudent("Maisha");
        course1.enrollStudent("Tanjina");
        course1.displayStudent();
    }
}