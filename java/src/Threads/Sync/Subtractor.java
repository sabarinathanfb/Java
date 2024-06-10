package Threads.Sync;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {

    Counter count;
    Lock lock;

    public Subtractor(Counter count, Lock lock){

        this.lock = lock;

        this.count = count;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10000 ; i++) {

            lock.lock();
            count.val -=i;
            lock.unlock();

        }
    }
}
