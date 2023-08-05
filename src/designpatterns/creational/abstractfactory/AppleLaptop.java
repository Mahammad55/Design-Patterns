package designpatterns.creational.abstractfactory;

public class AppleLaptop implements Laptop {
    String model;
    double price;

    public AppleLaptop(String model, double price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
