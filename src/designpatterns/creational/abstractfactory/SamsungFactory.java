package designpatterns.creational.abstractfactory;

public class SamsungFactory implements AbstractFactory {
    @Override
    public Phone createPhone(String model,double price) {
        return new SamsungPhone(model, price);
    }

    @Override
    public Laptop createLaptop(String model,double price) {
        return new SamsungLaptop(model, price);
    }
}
