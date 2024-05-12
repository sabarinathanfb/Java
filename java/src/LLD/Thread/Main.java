package LLD.Thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {


//        Executor ex = Executors.newFixedThreadPool(2);
        ExecutorService es = Executors.newCachedThreadPool();
        for (int i = 1; i < 10; i++) {

            es.execute(new HelloWorld());

        }
        es.shutdown();




    }
}
