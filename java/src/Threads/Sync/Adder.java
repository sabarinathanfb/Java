package Threads.Sync;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {


    Counter count;
    Lock lock;

    public Adder(Counter count,Lock lock){

        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            lock.lock();
            count.val += i;
            lock.unlock();

        }
    }
}
