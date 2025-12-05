package ExceptionProblemSolve;
import java.util.InputMismatchException; //specific exception
import java.util.Scanner;
//import java.util.*; // all the java utility is in this import

public class SafeDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("Please enter num1: ");
                int num1 = input.nextInt();

                System.out.print("Please enter num2: ");
                int num2 = input.nextInt();

                // Division
                int result = num1 / num2;
                System.out.println("Result: " + num1 + "/" + num2 + " = " + result);
                break;  // exit once successful

            } catch (InputMismatchException e) {
                System.out.println("\nException: " + e);
                System.out.println("You must enter integer, Please try again\n");

                input.nextLine(); // 🔥 clear bad input
                //continue;

            } catch (ArithmeticException e) {
                System.out.println("\nException: " + e);
                System.out.println("You must enter integer, Please try again\n");
                //continue;
            }
        }

        input.close();
    }
}

//Expected Output
//Please enter num1: 100
//Please enter num2: 0
//
//Exception: java.lang.ArithmeticException: / by zero
//You must enter integer, Please try again
//
//Please enter num1: 100
//Please enter num2: bye
//
//Exception: java.util.InputMismatchException
//You must enter integer, Please try again
//
//Please enter num1: 100
//Please enter num2: 100
//Result: 100/100 = 1
