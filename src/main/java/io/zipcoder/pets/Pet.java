package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by williammattern on 1/31/17.
 */
public class Pet implements Comparable<Pet>{
    String name;

    Pet(){}

    Pet(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak(){
        return "Grr";
    }

    public int compareTo(Pet p){
        int z = this.getName().compareTo(p.getName());
        if(z == 0){
            int y = this.getClass().toString().compareTo(p.getClass().toString());
            return y;
        }
        return z;
    }
}