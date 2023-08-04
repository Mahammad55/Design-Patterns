package designpatterns.creational.factory.pizzaexample;

public class Main {
    public static void main(String[] args) {
        PizzaFactory factory=new PizzaFactory();

        Pizza cheese = factory.createPizza("cheese");
        cheese.getType();

        Pizza veggie = factory.createPizza("veggie");
        veggie.getType();

        Pizza pepperoni = factory.createPizza("pepperoni");
        pepperoni.getType();
    }
}
