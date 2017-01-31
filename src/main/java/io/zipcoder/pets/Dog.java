package io.zipcoder.pets;

/**
 * Created by williammattern on 1/31/17.
 */
public class Dog extends Pet{

    Dog(String name){
        super(name);
    }

    public String speak(){
        return "Woof";
    }
}
