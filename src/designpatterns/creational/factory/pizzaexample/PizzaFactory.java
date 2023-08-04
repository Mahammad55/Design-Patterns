package designpatterns.creational.factory.pizzaexample;

public class PizzaFactory {
    public Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("cheese")) {
            return new CheesePizza();
        } else if (type.equalsIgnoreCase("veggie")) {
            return new VeggiePizza();
        } else if (type.equalsIgnoreCase("pepperoni")) {
            return new PepperoniPizza();
        } else {
            return null;
        }
    }
}
