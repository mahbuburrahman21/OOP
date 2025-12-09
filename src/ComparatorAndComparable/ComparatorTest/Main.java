package ComparatorAndComparable.ComparatorTest;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Employee e1 = new Employee(3,"Mahbub", 24);
        Employee e2 = new Employee(5,"Rasel", 21);
        Employee e3 = new Employee(1,"Abul", 23);
        Employee e4 = new Employee(2,"Rabbi", 26);
        Employee e5 = new Employee(4,"Mahid", 19);

//        System.out.println(e2.compareTo(e1));
//        System.out.println(e2.compareTo(e3));
//        System.out.println(e2.compareTo(e4));
//        System.out.println(e3.compareTo(e4));

        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        Collections.sort(employees);
        print(employees);
    }

    public static void print(List<Employee> employeeList){
        for (Employee employee : employeeList) {
            System.out.println("Id: "+employee.getId()+", Name: "+employee.getName()+", Age: "+employee.getAge());
        }
    }
}
