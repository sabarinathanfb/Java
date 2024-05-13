package DesignPattern.srp;

public class Peacock extends Bird implements Flyable,Dance{
    @Override
    public void makeSound() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void dance() {
        System.out.println("I am Peacock,I can Dance");

    }

    @Override
    public void fly() {

    }
}
