package MultiThreading.Join;

import MultiThreading.WithPrioritySettings.PrintTask;

public class TestingJoin {
    static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();

        PrintTask pt1 = new PrintTask('*');
        PrintTask pt2 = new PrintTask('&');
        PrintTask pt3 = new PrintTask('#');

        Thread t1 = new Thread(pt1);
        Thread t2 = new Thread(pt2);
        Thread t3 = new Thread(pt3);

        //Priority Can be set 1 - 10. ! 1 is the MIN priority and 10 is the highest priority.
        //It can be also declare like, object.setPriority(number); // this number is your priority.
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        System.out.print("\n\nT1 * task started\n");

        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        System.out.print("\n\nT2 & task started\n");

        t1.join();
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
        System.out.print("\n\nT3 # task started\n");

        long endTime = System.currentTimeMillis();
        System.out.printf("\n%s Total Time taken: %d\n",
                Thread.currentThread().getName(), (endTime-startTime));
    }
}
