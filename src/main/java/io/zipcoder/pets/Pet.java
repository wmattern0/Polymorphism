package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by williammattern on 1/31/17.
 */
public class Pet implements Comparable{
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
    public int compareTo(Object p) {
        return this.getName().compareTo(p.getClass().getName());
    }
}