package thread;

public class HelloWorldPrinter implements Runnable {
    private int num;

    public HelloWorldPrinter(int n){

        num = n;
    }

    @Override
    public void run() {
        System.out.println("Printing hello World From:" +
                num +
                Thread.currentThread().getName());

    }
}
