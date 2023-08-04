package designpatterns.creational.factory.pizzaexample;

public class VeggiePizza implements Pizza{
    @Override
    public void getType() {
        System.out.println("You ordered Veggie pizza.");
    }
}
