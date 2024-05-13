package DesignPattern.srp;

public class Sparrow extends Bird implements Flyable {

    // Problem for Like Bank Api violate DIP
    SparrowCrowFlying scf = new SparrowCrowFlying();

    @Override
    public void makeSound() {
        System.out.println("KI KI KIIIII");
    }
    @Override
    public void eat() {
    }

    @Override
    public void fly() {

       scf.makeFly();

    }
}
