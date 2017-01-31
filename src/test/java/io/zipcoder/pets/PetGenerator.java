package io.zipcoder.pets;

/**
 * Created by williammattern on 1/31/17.
 */
public class PetGenerator {

    public Pet createPet(String name, String type){
        switch(type){
            case "Dog": return new Dog(name);
            case "Cat": return new Cat(name);
            default:return new Pet(name);
        }

    }
}
