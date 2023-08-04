package designpatterns.creational.factory.carexample;

public class Audi extends Car {
    public Audi(int speed) {
        super(speed);
    }

    @Override
    public void drive() {
        System.out.println("Audi is driving with speed: " + getSpeed());
    }
}
