package MultiThreading.WithPrioritySettings;

//Step1: Define the class that extends thread
public class PrintTask implements Runnable{

    //Step2: Override the run() Method
    @Override
    public void run() {
        //Print task
        for (int i = 1; i <= 1000; i++){
            System.out.printf("%d:%c ", i, targetChar);
        }
        System.out.printf("\n%s %c Task Done\n", Thread.currentThread().getName(), targetChar);
    }

    private final char targetChar;
    public PrintTask(char targetChar){
        this.targetChar = targetChar;
    }
}