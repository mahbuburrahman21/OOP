package CustomExceptionAndThrowThrows;

import java.util.Scanner;

public class CustomException {
    static void main(String[] args) throws NegativeRadiusException{
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = input.nextInt();

//        NegativeRadiusException nre = new NegativeRadiusException();

        System.out.println(calculateAreaOfCircle(radius));
//        try {
//            System.out.println(calculateAreaOfCircle(radius));
//        } catch (NegativeRadiusException e){
//            System.out.println("Invalid area if the radius is negative.");
//            System.out.println(nre.getMessage());
//        }
    }

    private static double calculateAreaOfCircle(int radius) throws NegativeRadiusException{
        if ( radius < 0){
            throw new NegativeRadiusException("Please re-enter the radius.");
        }
        return Math.PI*Math.pow(radius, 2);
    }
}
