package designpatterns.creational.prototype.animalexample;

public class Cow implements AnimalPrototype{
    String name;

    public Cow(String name) {
        this.name = name;
    }

    @Override
    public AnimalPrototype clone() {
        return new Cow(this.name);
    }

    @Override
    public String toString() {
        return "Cow: "+this.name;
    }
}
