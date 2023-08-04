package designpatterns.creational.factory.carexample;

public class Main {
    public static void main(String[] args) {
        CarFactory factory=new CarFactory();

        Car audi = factory.getObject("to work");
        audi.drive();

        Car bmw=factory.getObject("to city");
        bmw.drive();

        Car tesla= factory.getObject("to travel");
        tesla.drive();
    }
}
