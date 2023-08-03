package designpatterns.creational.prototype.animalexample;

import java.util.HashMap;
import java.util.Map;

public class AnimalPrototypeManager {
    private Map<String,AnimalPrototype> prototypes;

    public AnimalPrototypeManager() {
        prototypes=new HashMap<>();
    }

    public void addPrototype(String key,AnimalPrototype prototype){
        prototypes.put(key, prototype);
    }
    public AnimalPrototype getPrototype(String key){
        return prototypes.get(key).clone();
    }
}
