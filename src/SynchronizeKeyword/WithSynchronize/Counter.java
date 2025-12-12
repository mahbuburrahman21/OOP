package SynchronizeKeyword.WithSynchronize;

public class Counter {
    private int count = 0;
    public synchronized void increment(){
        // Here we added Synchronized in this method declaration.The only change
        count++;
    }
    public int getCount(){
        return this.count;
    }
}
