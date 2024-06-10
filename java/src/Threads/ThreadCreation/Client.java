package Threads.ThreadCreation;

public class Client {
    public static void main(String[] args) throws InterruptedException {




        System.out.println(" I am From " + Thread.currentThread().getName());

        ThreadClass t = new ThreadClass();
        System.out.println(t.getState());
        System.out.println(t.getPriority());
//        t.start();
//        t.join();

//        System.out.println(Thread.currentThread().getPriority());

    }
}
