package DesignPattern.srp;

public class Client {


    public static void main(String[] args)  {


        Bird b1 = new Sparrow();
        b1.name = "Kili";
        b1.type = "sparrow";
        Bird b2 = new Penguin();
        b1.name = "Penguin";
        b1.type = "penguin";
        Bird b3 = new Peacock();
        b3.name = "Mayil";
        b3.type = "peacock";


        // Need to Cast LSP to solve
        ((Flyable) b1).fly();




    }
}
