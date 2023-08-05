package designpatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        EagerInitializationSingleton eager = EagerInitializationSingleton.getInstance();

        LazyInitializedSingleton lazy = LazyInitializedSingleton.getInstance();

        DoubleCheckedLockingSingleton doubleChecked = DoubleCheckedLockingSingleton.getInstance();
    }
}
