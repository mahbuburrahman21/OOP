package MultiThreading.ThreadCreatingByExtendThreadClass.Example1;

public class ThirdTask extends Thread{
    @Override
    public void run() {
        //third task
        for (int i = 1; i <= 1000; i++){
            System.out.printf("%d$ ", i);
        }
        System.out.println("\nThird task done.");
    }
}
