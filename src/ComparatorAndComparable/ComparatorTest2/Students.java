package ComparatorAndComparable.ComparatorTest2;

public class Students {
    private final String name;
    private final String id;
    private final String age;
    public Students(String name, String id, String age){
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Name:"+ name + "  id:"+id+"  age:"+age;
    }
}