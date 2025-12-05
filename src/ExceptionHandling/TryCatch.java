package ExceptionHandling;
import java.util.Scanner;

public class TryCatch {

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number a: ");
        int a = input.nextInt();
        System.out.print("Enter number b: ");
        int b = input.nextInt();

        //this can be an approach
        try{
            int result = a/b;
            System.out.println("Result of the division: "+result);
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception");
        }

        //another approach
        try{
            try{
                int result = a/b;
                System.out.println("Result of the division: "+result);
            } catch (Exception e){
                System.out.println("Something Caught");
            } finally {
                System.out.println("Finally not quit");
            }
        } catch (ArithmeticException e){
            System.out.println("Arithmetic exception caught.");
        } finally {
            System.out.println("Finally exit");
        }
    }
}
