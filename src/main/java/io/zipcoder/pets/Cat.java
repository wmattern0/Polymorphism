package io.zipcoder.pets;

/**
 * Created by williammattern on 1/31/17.
 */
public class Cat extends Pet{

    Cat(String name){
        super(name);
    }

    public String speak(){
        return "Meow";
    }
}
