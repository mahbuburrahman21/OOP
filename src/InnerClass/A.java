package InnerClass;

//Outer class cannot be static. It can be only, public, abstract & final
public class A {
    String name;
    int age;

    public void display(){
        System.out.println("I'm in class A display method! ");
    }

    class B{
        public void config(){
            System.out.println("I'm in class B config method! ");
        }
    }

    //only inner classes can be static.
    static class C{
        public void Show(){
            System.out.println("I'm in static class C show method! ");
        }
    }
}
