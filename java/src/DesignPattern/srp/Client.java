package DesignPattern.srp;

public class Client {
    public static void main(String[] args) {

        Bird b1 = new Bird();
        b1.type = "crow";
        b1.name = "kaaka";

        Bird b2 = new Bird();

        b2.type = "sparrow";
        b2.name = "kili";

        b1.makeSound();
        b2.makeSound();

    }
}
