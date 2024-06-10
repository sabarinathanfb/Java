package Threads.Run;

public class Client {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName());

        NumberPrinter np = new NumberPrinter();
        for (int i = 1; i <= 100; i++) {

            Thread t =new Thread(np);

            t.start();

        }


    }
}
