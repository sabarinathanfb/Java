package Threads.ThreadCreation;

public class ThreadClass extends Thread{

    @Override
    public void run() {

        Thread.currentThread().setName("ThreadClass");
        System.out.println("I am From "+ Thread.currentThread().getName());

    }
}