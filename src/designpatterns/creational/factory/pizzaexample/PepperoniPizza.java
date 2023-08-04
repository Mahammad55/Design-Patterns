package designpatterns.creational.factory.pizzaexample;

public class PepperoniPizza implements Pizza {
    @Override
    public void getType() {
        System.out.println("You ordered Pepperoni pizza.");
    }
}
