package Threads.Callable.CustomTest;

import java.util.concurrent.Callable;

public class SampleTesting implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        return 999;
    }
}
