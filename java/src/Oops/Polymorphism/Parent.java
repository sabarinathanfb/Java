package Oops.Polymorphism;

public class Parent {

    public String name;
    public int age;

    Parent(String name,int age){
        this.age = age;
        this.name = name;
    }

    private static void testMethod(){
        System.out.println("I Am Your Mom");
    }

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
