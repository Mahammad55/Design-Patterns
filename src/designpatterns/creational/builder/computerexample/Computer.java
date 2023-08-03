package designpatterns.creational.builder.computerexample;

public class Computer {

    // required parameters
    private String ram;
    private String memory;
    private boolean isWiFiEnabled;

    // optional parameters
    private String processor;
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    private int batterySavedTime;

    public Computer(ComputerBuilder builder) {
        this.ram = builder.ram;
        this.memory = builder.memory;
        this.isWiFiEnabled = builder.isWiFiEnabled;
        this.processor = builder.processor;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.batterySavedTime = builder.batterySavedTime;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "ram='" + ram + '\'' +
                ", memory='" + memory + '\'' +
                ", isWiFiEnabled=" + isWiFiEnabled +
                ", processor='" + processor + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                ", batterySavedTime=" + batterySavedTime +
                '}';
    }

    public static class ComputerBuilder {
        private String ram;
        private String memory;
        private boolean isWiFiEnabled;
        private String processor;
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
        private int batterySavedTime;

        public ComputerBuilder(String ram, String memory, boolean isWiFiEnabled) {
            this.ram = ram;
            this.memory = memory;
            this.isWiFiEnabled = isWiFiEnabled;
        }

        public ComputerBuilder setProcessor(String processor) {
            this.processor = processor;
            return this;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean graphicsCardEnabled) {
            isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public ComputerBuilder setBatterySavedTime(int batterySavedTime) {
            this.batterySavedTime = batterySavedTime;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}

