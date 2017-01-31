package io.zipcoder.pets;

/**
 * Created by williammattern on 1/30/17.
 */
public class Cat extends Pet {

    Cat(){}

    Cat(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Meow";
    }
}
