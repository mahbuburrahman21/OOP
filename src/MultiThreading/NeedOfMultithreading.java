package MultiThreading;

public class NeedOfMultithreading {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //first task
        for (int i = 1; i <= 1000; i++){
            System.out.printf("%d* ", i);
        }
        System.out.println("\nFirst task done.");

        //Second task
        for (int i = 1; i <= 1000; i++){
            System.out.printf("%d# ", i);
        }
        System.out.println("\nSecond task done.");

        //third task
        for (int i = 1; i <= 1000; i++){
            System.out.printf("%d$ ", i);
        }
        System.out.println("\nThird task done.");


        long endTime = System.currentTimeMillis();

        System.out.printf("\nTotal time taken: %d", endTime - startTime);
    }
}
