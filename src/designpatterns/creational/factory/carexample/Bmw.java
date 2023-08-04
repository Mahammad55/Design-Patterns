package designpatterns.creational.factory.carexample;

public class Bmw extends Car{
    public Bmw(int speed) {
        super(speed);
    }

    @Override
    public void drive() {
        System.out.println("Bmw is driving with speed: " + getSpeed());
    }
}
