package Challenge52;

public class Course {

    static int maxCapacity = 100;
    String courseName;
    int enrollments;

    String[] enrolledStudent;
    Course(String courseName){
        this.courseName = courseName;
        this.enrollments = 0;
        this.enrolledStudent = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        //We can use this keyword when name conflict happen (Using instance variable in a method)
        //But when there are name conflict of static variable, then we can't use this keyword.
        //To solve this we will use class name. Because Static variable is related to Class.
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrolledStudent[enrollments] = studentName;
        enrollments++;
    }

    void unenrollStudent(String studentName){
        int i= 0;
        while (i<enrollments){
            if (enrolledStudent[i].equals(studentName)){
                while (i<enrollments){
                    enrolledStudent[i] = enrolledStudent[i+1];
                    i++;
                }
            }
            i++;
        }
        System.out.println(studentName+" removed from the course.");
        enrollments--;
    }

    void displayStudent(){
        System.out.println("Students in the "+this.courseName +" course now are: ");
        int i=0;
        while (i<enrollments){
            System.out.print(enrolledStudent[i]+" ");
            i++;
        }
        System.out.println();
    }
}