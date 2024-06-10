package Oops.Polymorphism;

public class Main {
    public static void main(String[] args) {

        Parent p = new Parent("Maha",53);
        Child c = new Child("sabari",26);
        Parent Pc = new Child("keeri",26);

        System.out.println(p);
        System.out.println(c);
//        Pc.testMethod();



//        p.testMethod();
        c.testMethod();
    }
}
