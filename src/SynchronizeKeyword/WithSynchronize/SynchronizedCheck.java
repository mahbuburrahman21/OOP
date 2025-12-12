package SynchronizeKeyword.WithSynchronize;

public class SynchronizedCheck {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        SynchronizedThread t1 = new SynchronizedThread(counter);
        SynchronizedThread t2 = new SynchronizedThread(counter);

        try {
            t1.start();
            t2.start();
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted: "+e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Final count is: "+counter.getCount());
        System.out.println("Total time taken: "+(endTime - startTime));
    }
}
//Now We can see this is printing perfectly the exact number we want. 