package io.zipcoder.pets;

/**
 * Created by williammattern on 1/30/17.
 */
public class Dog extends Pet {

    Dog(){}

    Dog(String name){
        super(name);
    }

    @Override
    public String speak(){
        return "Woof";
    }
}
