package DesignPattern.srp;

public class Penguin extends Bird{
    @Override
    public void fly() {
        try {
            throw new FlyException("Penguins cannot fly!");
        } catch (FlyException e) {
            // Handle the exception (or ignore it)
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void dance() {

    }
}
