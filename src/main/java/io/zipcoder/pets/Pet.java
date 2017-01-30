package io.zipcoder.pets;

/**
 * Created by williammattern on 1/30/17.
 */
public class Pet {

    String name;

    public void speak(){
        System.out.println("The generic pet says: grrrrrrrrr");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
