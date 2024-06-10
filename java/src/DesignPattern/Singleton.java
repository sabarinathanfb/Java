package DesignPattern;


public class Singleton {

    private static Singleton singletonInstance ;

    public synchronized static Singleton getInstance(){

        if(singletonInstance == null){
            singletonInstance = new Singleton();
        }
        return singletonInstance;

    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return singletonInstance;
    }
}
