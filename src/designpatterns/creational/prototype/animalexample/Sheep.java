package designpatterns.creational.prototype.animalexample;

public class Sheep implements AnimalPrototype{
    String name;

    public Sheep(String name) {
        this.name = name;
    }

    @Override
    public AnimalPrototype clone() {
        return new Sheep(this.name);
    }

    @Override
    public String toString() {
        return "Sheep: " +this.name;
    }
}
