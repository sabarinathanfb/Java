package Threads.Callable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        // Create an instance of MyCallable
        MyCallable callableTask = new MyCallable(10);

        // Submit the callable task to the executor
        Future<Integer> future = executor.submit(callableTask);

        try {
            // Wait for the result and print it
            Integer result = future.get();
            System.out.println("Result of the callable task: " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();

    }
}
