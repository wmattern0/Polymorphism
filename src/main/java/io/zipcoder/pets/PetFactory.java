package io.zipcoder.pets;

/**
 * Created by williammattern on 1/30/17.
 */
public class PetFactory {

    public Pet setPet(String type, String name){
        switch(type.toLowerCase()){
            case "dog":return new Dog(name);
            case "cat":return new Cat(name);
            case "fish":return new Fish(name);
            default: return new Pet(name);
        }
    }
}
