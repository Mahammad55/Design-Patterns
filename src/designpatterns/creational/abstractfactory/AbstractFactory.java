package designpatterns.creational.abstractfactory;

public interface AbstractFactory {
    Phone createPhone(String model,double price);
    Laptop createLaptop(String model,double price);
}
