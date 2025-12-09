package ComparatorAndComparable.ComparatorTest2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Compare implements Comparator <Students>{
    public int compare(Students s1, Students s2) {
        int nameCompare = s1.getName().compareTo(s2.getName());
        if (nameCompare != 0) return nameCompare;
        int ageCompare = s1.getAge().compareTo(s2.getAge());
        if (ageCompare != 0) return ageCompare;
        int idCompare = s1.getId().compareTo(s2.getId());
        if (idCompare != 0) return idCompare;
        return nameCompare;
    }

    static void main(String[] args) {
        List<Students> students = new ArrayList<>();

        students.add(new Students("Hasan  ", "12", "25"));
        students.add(new Students("Mahid  ", "15", "21"));
        students.add(new Students("Abul   ", "9 ", "22"));
        students.add(new Students("Mahid  ", "10", "24"));
        students.add(new Students("Tanjina", "14", "20"));
        students.add(new Students("Abul   ", "9 ", "21"));
        students.add(new Students("Abdul  ", "9 ", "23"));

        //display unsorted
        System.out.println("Original List: ");
        for (Students student : students) {
            System.out.println(student);
        }
        System.out.println();

        //sorting
        students.sort(new Compare());
        //Display sorted list
        System.out.println("Sorted List: ");
        for (Students student : students) {
            System.out.println(student);
        }
    }
}