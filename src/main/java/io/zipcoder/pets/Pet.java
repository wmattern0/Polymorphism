package io.zipcoder.pets;

/**
 * Created by williammattern on 1/30/17.
 */
public class Pet {
    String name;

    Pet(){}

    Pet(String name){
        this.name = name;
    }

    public String speak(){
        return "A generic pet says grrrr";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}