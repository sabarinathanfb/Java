package Threads.Run;

public class NumberPrinter implements Runnable{

    private int numPrint = 0;


    @Override
    public void run() {
        numPrint++;
        System.out.println(numPrint + " " + Thread.currentThread().getName());


    }
}
