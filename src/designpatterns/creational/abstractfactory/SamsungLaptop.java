package designpatterns.creational.abstractfactory;

public class SamsungLaptop implements Laptop {
    String model;
    double price;

    public SamsungLaptop(String model, double price) {
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
