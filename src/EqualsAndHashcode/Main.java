package EqualsAndHashcode;

import java.util.HashSet;

public class Main {
    static void main(String[] args) {
        Person p1 =  new Person();
        p1.setName("Hasan");
        p1.setAge(23);

        Person p2 = new Person();
        p2.setName("Hasan Sabah");
        p2.setAge(23);

        //System.out.println(p1.equals(p2));

        HashSet<Person> set =  new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println(set.size());
    }
}
