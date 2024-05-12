package LLD.Polymorphism;

public class Parent {


    int a ;

    Parent(int a){
        this.a = a;
        System.out.println(a);
    }

    public static void name(){

        System.out.println("I am Parent Class");
    }

    public static void name(String name){
        System.out.println(name);
    }
}
