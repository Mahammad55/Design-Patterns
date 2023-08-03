package designpatterns.creational.builder.computerexample;

public class User {
    public static void main(String[] args) {
        Computer lenovo = new Computer.ComputerBuilder("16 GB", "256 GB", true)
                .setProcessor("Intel core I7")
                .setBatterySavedTime(4)
                .setGraphicsCardEnabled(true)
                .build();

        Computer hp = new Computer.ComputerBuilder("8 GB", "256 GB", true)
                .setProcessor("Intel core I7")
                .setBatterySavedTime(9)
                .setBluetoothEnabled(true)
                .build();

        System.out.println(lenovo);
        System.out.println(hp);
    }
}
