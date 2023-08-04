package designpatterns.creational.factory.carexample;

public class Tesla extends Car{
    public Tesla(int speed) {
        super(speed);
    }

    @Override
    public void drive() {
        System.out.println("Tesla is driving with speed: " + getSpeed());
    }
}
