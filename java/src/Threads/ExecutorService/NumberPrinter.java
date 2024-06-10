package Threads.ExecutorService;

public class NumberPrinter implements Runnable{

    private int numPrint = 0;


    public NumberPrinter(int numPrint){
        this.numPrint = numPrint;
    }

    @Override
    public void run() {
        System.out.println(numPrint + " " + Thread.currentThread().getName());


    }
}
