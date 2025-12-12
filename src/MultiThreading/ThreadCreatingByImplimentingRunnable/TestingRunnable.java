package MultiThreading.ThreadCreatingByImplimentingRunnable;

public class TestingRunnable {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        PrintTask pt1 = new PrintTask('*');
        PrintTask pt2 = new PrintTask('&');
        PrintTask pt3 = new PrintTask('#');

        Thread t1 = new Thread(pt1);
        Thread t2 = new Thread(pt2);
        Thread t3 = new Thread(pt3);

        System.out.print("\nT1 task started\n");
        t1.start();
        System.out.print("\nT2 task started\n");
        t2.start();
        System.out.print("\nT3 task started\n");
        t3.start();

        long endTime = System.currentTimeMillis();
        System.out.printf("\n%s Total Time taken: %d\n",
                Thread.currentThread().getName(), (endTime-startTime));



    }
}
