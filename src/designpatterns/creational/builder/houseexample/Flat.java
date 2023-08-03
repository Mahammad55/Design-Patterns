package designpatterns.creational.builder.houseexample;

public class Flat {
    public static void main(String[] args) {
        House flat=new House.BuilderHouse()
                .setCeil("ceil")
                .setRoof("roof")
                .setWindow("window")
                .setDoor("door")
                .build();

        System.out.println(flat);
    }
}
