package CallByValueAndReference.CallByValue;

public class Test {
    static void main(String[] args) {
        PrimitiveValue obj = new PrimitiveValue();
        int x = 10;
        System.out.println("Value of 'x' Before calling change method: "+x);

        obj.change(x);
        System.out.println("Value of 'x' After calling change method: "+x);
        //so we can see call by value don't change the actual value
    }
}
