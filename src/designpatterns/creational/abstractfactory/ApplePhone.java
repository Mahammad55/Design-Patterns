package designpatterns.creational.abstractfactory;

public class ApplePhone implements Phone {
    String model;
    double price;

    public ApplePhone(String model, double price) {
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
