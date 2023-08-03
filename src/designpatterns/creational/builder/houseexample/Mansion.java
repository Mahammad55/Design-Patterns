package designpatterns.creational.builder.houseexample;

public class Mansion {
    public static void main(String[] args) {
        House mansion=new House.BuilderHouse()
                .setDoor("door")
                .setRoof("roof")
                .setPool("pool")
                .setCeil("ceil")
                .setWindow("window")
                .build();

        System.out.println(mansion);
    }
}
