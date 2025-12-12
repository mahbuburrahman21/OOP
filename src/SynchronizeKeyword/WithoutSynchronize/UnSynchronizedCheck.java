package SynchronizeKeyword.WithoutSynchronize;

public class UnSynchronizedCheck {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UnSynchronizedThread t1 = new UnSynchronizedThread(counter);
        UnSynchronizedThread t2 = new UnSynchronizedThread(counter);

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
//We can see this is printing random values. It should print 20000.
//but it's printing randomly between 10000 -20000. Synchronize can solve this.