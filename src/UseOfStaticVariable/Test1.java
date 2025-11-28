package UseOfStaticVariable;

public class Test1 {
    static void main(String[] args) {
        StudentWithoutStatic s1 = new StudentWithoutStatic();
        s1.totalStudent();

        StudentWithoutStatic s2 = new StudentWithoutStatic();
        s2.totalStudent();

        StudentWithoutStatic s3 = new StudentWithoutStatic();
        s3.totalStudent();
    }
}
