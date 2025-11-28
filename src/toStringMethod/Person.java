package toStringMethod;

public class Person {
    private String name;
    private int age;
    private int salary;

    //setter methods
    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }

    //getter methods
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
//    public int getSalary(){
//        return salary;
//    }



    Person(String name, int age, int salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

//    public void display(){
//        System.out.println("Person name: "+name);
//        System.out.println("Person age: "+age);
//        System.out.println("Person salary: "+salary);
//        System.out.println("------------------------");
//    }

//    public String toString(){
//        return "{ \n   name: "+name+"\n   age: "+age+"\n}\n";
//    }





    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }
}



class Main{
    static void main(String[] args) {
        Person p1 = new Person("Mahbub", 25, 1200000);
        //p1.display();
        Person p2 = new Person("Mahdi", 24, 100000);
        //p2.display();

//        p1.setName("Mahbubur Rahman");
//        p1.display();
//        System.out.println("The person name is: "+p1.getName());
//
        //salary cannot be accessed.
        //System.out.println("The person salary is: "+p2.getSalary());
        System.out.println(p1);
        System.out.println(p2);

        StringBuilder str = new StringBuilder("Mahbub");
        str.append(" is a software engineer!\n").append(" He is graduated ");
        str.append("From DIU ").append(2026);
        System.out.println(str);
    }
}
