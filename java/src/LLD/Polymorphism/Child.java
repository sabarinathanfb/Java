package LLD.Polymorphism;

public class Child extends Parent{


    int b ;

    Child(int b){
        super(b);
        this.b = b;
        System.out.println(b);
    }

//    public void name(){
//
//        System.out.println("I am Child class");
//    }
}
