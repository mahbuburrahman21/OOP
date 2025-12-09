package ComparatorAndComparable.ComparatorTest;

public class Employee implements Comparable{
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    //Here, we will compare the objects. And implement our own logic.
    //in this compareTo method, there are a return type int, it can be either positive, negative or zero.
    // if e1.compareTo(e2) returns +ve --> then e1 > e2
    // if e1.compareTo(e2) returns 0 --> then e1 = e2
    // if e1.compareTo(e2) returns -ve --> then e1 < e2

    @Override
    public int compareTo(Object o) {
        Employee e = (Employee) o;
        if (this.getId() == e.getId()){
            return 0;
        } else if (this.getId() > e.getId()) {
            return -1;
        } else {
            return 1;
        }
        //this whole if logic can be replaced with this one line:
        //return Integer.compare(this.getId(), e.getId());
    }
}
