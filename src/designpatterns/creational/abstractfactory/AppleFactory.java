package designpatterns.creational.abstractfactory;

public class AppleFactory implements AbstractFactory {
    @Override
    public Phone createPhone(String model,double price) {
        return new ApplePhone(model, price);
    }

    @Override
    public Laptop createLaptop(String model,double price) {
        return new AppleLaptop(model, price);
    }
}
