package DesignPrinciple.srp;

public class Client {


    public static void main(String[] args)  {


        Bird b1 = new Sparrow(new PigeonOwlFlying());
        b1.name = "Kili";
        b1.type = "sparrow";
        Bird b2 = new Penguin();
        b2.name = "Penguin";
        b2.type = "penguin";
        Bird b3 = new Peacock();
        b3.name = "Mayil";
        b3.type = "peacock";


        // Need to Cast LSP to solve
        ((Flyable) b1).fly();




    }
}
