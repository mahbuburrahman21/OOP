package CallByValueAndReference.CallByReference;

public class Test {
    static void main(String[] args) {
        NonPrimitiveValue p1 = new NonPrimitiveValue();
        p1.name = "Mahbub";
        System.out.println("Name before calling change method: "+ p1.name);

        //We can see there, pass by or call by reference can change the actual value
        p1.change(p1);
        System.out.println("Name after calling change method: "+ p1.name);
    }
}
