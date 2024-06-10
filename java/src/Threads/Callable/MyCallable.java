package Threads.Callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Integer> {
    private int number;

    public MyCallable(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        // Simulate some computation
        int result = 0;
        for (int i = 1; i <= number; i++) {
            result += i;
            Thread.sleep(100); // Simulating time-consuming task
        }
        return result;
    }
}

