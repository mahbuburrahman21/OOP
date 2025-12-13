package ExecutorServices.MultiThread;

import ExecutorServices.SingleThread.PrintRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadExecutorExample {
    static void main(String[] args) {
        //create a multi thread executor======================================
        ExecutorService executor = Executors.newFixedThreadPool(2);
        //=====================================================================

        //this print runnable comes from single thread executor example. Because they are same class.
        //Define a task (a Runnable)
        PrintRunnable task1 = new PrintRunnable('$');
        PrintRunnable task2 = new PrintRunnable('@');
        PrintRunnable task3 = new PrintRunnable('#');

        //Submit the task to the executor
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3); 
        executor.shutdown();
    }
}
