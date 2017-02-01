package io.zipcoder.pets;

import java.util.Comparator;

/**
 * Created by williammattern on 2/1/17.
 */
public class PetChecker implements Comparator<Pet>{

    @Override
    public int compare(Pet pet1, Pet pet2) {
        return pet1.compareTo(pet2);
    }
}
