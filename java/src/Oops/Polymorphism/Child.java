package Oops.Polymorphism;

public class Child extends Parent{

    public String name ;
    public int age;


    Child(String name, int age) {
        super(name,age);


    }
    public void testMethod(){
        System.out.println("I Am Your Son");
    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
