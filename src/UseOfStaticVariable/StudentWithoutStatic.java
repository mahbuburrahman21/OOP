package UseOfStaticVariable;

import StaticKeyword.Student;

public class StudentWithoutStatic {
    int count = 0;

    StudentWithoutStatic(){
        count++;
    }

    void totalStudent(){
        System.out.println("Total student = "+count);
    }
}
