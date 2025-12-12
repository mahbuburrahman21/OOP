package MultiThreading.ThreadCreatingByExtendThreadClass.Example2;

//Step1: Define the class that extends thread
public class PrintTask extends Thread{

    //Step2: Override the run() Method


    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++){
            System.out.printf("%d:%c", i, targetChar);
        }
        System.out.printf("\n%c Task Done\n", targetChar);
    }

    private final char targetChar;
    public PrintTask(char targetChar){
        this.targetChar = targetChar;
    }
}
