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

    @Override
    public int compareTo(Pet p) {
        if(this.getName().compareTo(p.getName()) == 0){
            return 0;
        } else if (this.getName().compareTo(p.getName()) > 0){
            return 1;
        } else {
            return -1;
        }
    }
}