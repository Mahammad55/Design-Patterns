package designpatterns.creational.factory.pizzaexample;

public class CheesePizza implements Pizza{
    @Override
    public void getType() {
        System.out.println("You ordered Cheese pizza.");
    }
}
