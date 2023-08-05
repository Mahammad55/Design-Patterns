package designpatterns.creational.singleton;

public class StaticBlockInitializationSingleton {
    private static StaticBlockInitializationSingleton instance;

    private StaticBlockInitializationSingleton(){

    }
    static {
        try {
            instance=new StaticBlockInitializationSingleton();
        }catch (Exception e){
            throw new RuntimeException("Exception occurred in creating singleton instance");
        }
    }

    public static StaticBlockInitializationSingleton getInstance(){
        return instance;
    }
}
