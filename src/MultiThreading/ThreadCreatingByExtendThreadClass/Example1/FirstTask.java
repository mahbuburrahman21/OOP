package MultiThreading.ThreadCreatingByExtendThreadClass.Example1;

public class FirstTask extends Thread{
    @Override
    public void run() {
        //first task
        for (int i = 1; i <= 1000; i++){
            System.out.printf("%d* ", i);
        }
        System.out.println("\nFirst task done.");
    }
}
