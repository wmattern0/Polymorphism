package io.zipcoder.pets;

/**
 * Created by williammattern on 1/30/17.
 */
public class Fish extends Pet{

    Fish(){}

    Fish(String name){
        super(name);
    }

    @Override
    public String speak() {
        return "Blub...Blub...";
    }
}
