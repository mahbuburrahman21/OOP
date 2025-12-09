package QueueTest;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PQWMI { //PQWMI ----> Priority Queue With Multiple Instance
    private final String name;
    private final int age;

    public PQWMI(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " : " + age +"\n";
    }

    static void main(String[] args) {
        PriorityQueue<PQWMI> queue = new PriorityQueue<>(new Comparator<PQWMI>() {
            @Override
            public int compare(PQWMI o1, PQWMI o2) {
                int nameCompare = o1.getName().compareTo(o2.getName());
                if (nameCompare == 0) {
                    return o2.getAge() - o1.getAge();
                    //return Integer.compare(o1.getAge(), o2.getAge());
                }
                return nameCompare;
            }
        });

        queue.add(new PQWMI("Mahbub", 25));
        queue.add(new PQWMI("Hasan", 25));
        queue.add(new PQWMI("Mahid", 24));
        queue.add(new PQWMI("Hasib", 25));
        queue.add(new PQWMI("Mahbubur", 20));
        queue.add(new PQWMI("Maisha", 21));
        queue.add(new PQWMI("Abdullah", 21));
        queue.add(new PQWMI("Abdullah", 25));
        queue.add(new PQWMI("Abdullah", 18));

        while (!queue.isEmpty()) {
            System.out.print(queue.poll());
        }
    }
}
