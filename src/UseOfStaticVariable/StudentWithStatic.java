package UseOfStaticVariable;

public class StudentWithStatic {
    static int count = 0; //======================static declared===========================

    StudentWithStatic(){
        count++;
    }

    void totalStudent(){
        System.out.println("Total student = "+count);
    }
}
