package Threads.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());


        ExecutorService es = Executors.newCachedThreadPool();


        for (int i = 1; i <= 100; i++) {
            NumberPrinter np = new NumberPrinter(i);
            es.submit(np);
        }

        es.shutdown();


    }
}
