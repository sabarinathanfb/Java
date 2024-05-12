package DesignPattern.srp;

public abstract class Bird {
    public String name;
    public String color;
    public double weight;
    public String type;

    public abstract void fly() throws FlyException ;
    public abstract void makeSound();
    public abstract void eat();
    public abstract void dance();

}
