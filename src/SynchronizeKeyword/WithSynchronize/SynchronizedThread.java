package SynchronizeKeyword.WithSynchronize;

public class SynchronizedThread extends Thread {
    private final Counter counter;
    public SynchronizedThread(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
