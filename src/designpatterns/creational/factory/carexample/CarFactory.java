package designpatterns.creational.factory.carexample;

public class CarFactory {
    public Car getObject(String reason) {
        switch (reason) {
            case "to work" -> {
                return new Audi(45);
            }
            case "to travel" -> {
                return new Tesla(100);
            }
            case "to city" -> {
                return new Bmw(90);
            }
            default -> throw new IllegalArgumentException("Invalid reason " + reason);
        }
    }
}
