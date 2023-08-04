package designpatterns.creational.factory.carexample;

public abstract class Car {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }
    public int getSpeed(){
        return this.speed;
    }

    public abstract void drive();
}
