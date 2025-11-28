package Recursion;
import java.util.Scanner;
public class Factorial {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate the factorial: ");
        int number = input.nextInt();
        if (number == 0){
            System.out.println("Factorial of 0 is: 1");
            return;
        } else if (number == 1) {
            System.out.println("Factorial of 1 is: 1");
            return;
        }

        long fact = factorialUsingIteration(number);
        System.out.println("Factorial (using iteration) of the number is: "+ fact);

        long fact2 = factorialUsingRecursion(number);
        System.out.println("Factorial (using recursion) of the number is: "+ fact2);
    }

    public static long factorialUsingIteration(int number){
        long factorial = 1;
        int i = 1;
        while (i<=number){
            factorial *= i;
            i++;
        }
        return factorial;
    }

    public static long factorialUsingRecursion(int number){
        if (number ==1){
            return 1;
        }
        return number * factorialUsingRecursion(number-1);
    }
}
