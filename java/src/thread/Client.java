package thread;

public class Client {
    public static void main(String[] args) {


        for (int i = 0; i <= 100; i++) {
            HelloWorldPrinter P = new HelloWorldPrinter(i);
            Thread t = new Thread(P);
            t.start();


        }






    }



}
