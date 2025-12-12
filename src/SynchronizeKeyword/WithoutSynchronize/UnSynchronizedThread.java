package SynchronizeKeyword.WithoutSynchronize;

public class UnSynchronizedThread extends Thread {
    private final Counter counter;
    public UnSynchronizedThread(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
