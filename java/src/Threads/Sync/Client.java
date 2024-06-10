package Threads.Sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {


        Lock L = new ReentrantLock();
        Counter c = new Counter();
        c.val = 0;

        Adder ad = new Adder(c,L);

        Subtractor sb = new Subtractor(c,L);

        Thread t1 = new Thread(ad);
        t1.start();

        Thread t2 = new Thread(sb);
        t2.start();
        t1.join();
        t2.join();

        System.out.println(c.val);
    }
}
