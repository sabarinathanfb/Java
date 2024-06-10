package Threads.Callable.CustomTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) {

        ExecutorService es = Executors.newCachedThreadPool();

        SampleTesting st = new SampleTesting();

        Future<Integer> future = es.submit(st);

        try{
            Integer result = future.get();
            System.out.println(result);
        }catch (Exception e ){
            System.out.println(e);
        }

        es.shutdown();

    }
}
