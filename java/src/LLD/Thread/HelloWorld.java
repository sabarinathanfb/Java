package LLD.Thread;

public class HelloWorld implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World ! " + Thread.currentThread().getName());

    }
}
