package DesignPattern.srp;

public class Sparrow extends Bird implements Flyable {

    FlyingBehaviour f ;


    public Sparrow(FlyingBehaviour other){

        this.f = other;
    }


    @Override
    public void makeSound() {
        System.out.println("KI KI KIIIII");
    }
    @Override
    public void eat() {
    }

    @Override
    public void fly() {
        System.out.print(this.name + "Flying Like ");
        f.makeFly();


    }
}
