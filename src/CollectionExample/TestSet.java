package CollectionExample;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
    static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Mahbub"));
        System.out.println(names.add("Rafin"));
        System.out.println(names.add("Fuad"));
        System.out.println(names.add("Mahir"));
        System.out.println(names);
        Utility.print(names);
        System.out.println(names.add("Mahbub"));
        System.out.println("Size of the set: "+names.size());
        System.out.printf("The name %s is in the Set: %b\n","Fuad",names.contains("Fuad"));
        System.out.println("Name removed: "+names.remove("Fuad"));
        Utility.print(names);
        System.out.println("Size of the set: "+names.size());
        System.out.println("Name removed: "+names.remove("Fuad"));
    }
}