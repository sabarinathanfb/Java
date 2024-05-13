package DesignPattern.srp;

public class Sparrow extends Bird implements Flyable {

    @Override
    public void makeSound() {
        System.out.println("KI KI KIIIII");
    }
    @Override
    public void eat() {
    }

    @Override
    public void fly() {

        System.out.println("I Am sparrow I can Fly");

    }
} 
