package DesignPattern.srp;

public class Client {
    public static void main(String[] args) throws FlyException {

        Bird b1 = new Crow();
        b1.type = "crow";
        b1.name = "kaaka";

        Bird b2 = new Sparrow();

        b2.type = "sparrow";
        b2.name = "kili";

        b1.makeSound();
        b2.makeSound();
        Bird b3 = new Penguin();
        b3.fly();
        b2.fly();

    }
}
