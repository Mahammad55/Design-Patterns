package designpatterns.creational.builder.houseexample;

public class House {
    private String roof; // optional
    private String door; // optional
    private String pool; // optional
    private String window; // optional
    private String ceil; // optional

    public House(String roof, String door, String pool, String window, String ceil) {
        this.roof = roof;
        this.door = door;
        this.pool = pool;
        this.window = window;
        this.ceil = ceil;
    }

    @Override
    public String toString() {
        return "House{" +
                "roof='" + roof + '\'' +
                ", door='" + door + '\'' +
                ", pool='" + pool + '\'' +
                ", window='" + window + '\'' +
                ", ceil='" + ceil + '\'' +
                '}';
    }

    // Builder class static nested class created
    public static class BuilderHouse{
        private String roof;
        private String door;
        private String pool;
        private String window;
        private String ceil;

        public BuilderHouse setRoof(String roof) {
            this.roof = roof;
            return this;
        }

        public BuilderHouse setDoor(String door) {
            this.door = door;
            return this;
        }

        public BuilderHouse setPool(String pool) {
            this.pool = pool;
            return this;
        }

        public BuilderHouse setWindow(String window) {
            this.window = window;
            return this;
        }

        public BuilderHouse setCeil(String ceil) {
            this.ceil = ceil;
            return this;
        }

        public House build(){
            return new House(this.roof,this.door,this.pool,this.window,this.ceil);
        }
    }
}
