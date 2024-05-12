package DesignPattern.srp;

public class Bird {
    String name;
    String color;
    double weight;
    String type;

    public void fly(){}

    // Violate Srp Principle
    public void makeSound(){
        if(this.type == "crow"){
            //Srp solution System.out.println("ka ka kaaa");
            crowSound();
        }
        else if(this.type == "sparrow"){
            sparrowSound();
        }
    }

    private void sparrowSound() {
        System.out.println("ki ki kii");
        return ;
    }

    private void crowSound() {
        System.out.println("ka ka kaaa");
        return ;
    }

    public void eat(){}
    public void dance(){}

}
