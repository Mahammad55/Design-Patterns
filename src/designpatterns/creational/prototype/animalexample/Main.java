package designpatterns.creational.prototype.animalexample;

public class Main {
    public static void main(String[] args) {
        AnimalPrototypeManager manager=new AnimalPrototypeManager();

        // give name to the animals
        Cow originCow=new Cow("Our cow");
        Sheep originSheep=new Sheep("Our sheep");

        manager.addPrototype("cow",originCow);
        manager.addPrototype("sheep",originSheep);

        AnimalPrototype cloneCow= manager.getPrototype("cow");
        AnimalPrototype cloneSheep= manager.getPrototype("sheep");

        System.out.println(cloneCow);
        System.out.println(cloneSheep);
    }
}
