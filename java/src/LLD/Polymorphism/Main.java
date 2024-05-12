package LLD.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Parent obj = new Parent(3);
        Child obj2 = new Child(2);

        Parent obj3 = new Child(5);

        obj.name("Sabari");
        obj2.name();
        obj3.name();


    }
}
