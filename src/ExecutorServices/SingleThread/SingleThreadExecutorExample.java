package ExecutorServices.SingleThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorExample {
    static void main(String[] args) {
        //create a single thread executor======================================
        ExecutorService executor = Executors.newSingleThreadExecutor();
        //=====================================================================

        //Define a task (a Runnable)
        Runnable task1 = new PrintRunnable('$');
        Runnable task2 = new PrintRunnable('&');
        Runnable task3 = new PrintRunnable('*');

        //Submit the task to the executor
        executor.submit(task1);
        executor.submit(task2);
        executor.submit(task3);
        executor.shutdown();
    }
}
