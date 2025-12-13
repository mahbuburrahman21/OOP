package ExecutorServices.SingleThread;

//Step1: Define a class that implements Runnable
public class PrintRunnable implements Runnable{

    private final char targetChar;
    public PrintRunnable(char targetChar){
        this.targetChar = targetChar;
    }

    //Step2: Override the run method
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d:%c ", i, targetChar);
        }
        System.out.printf("\n%c Task done from %s\n", targetChar, Thread.currentThread().getName());
    }


}
