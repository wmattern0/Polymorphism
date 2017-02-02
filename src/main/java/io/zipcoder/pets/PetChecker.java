package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by williammattern on 2/1/17.
 */
public class PetChecker implements Comparator<Pet>{

    public int compare(Pet pet1, Pet pet2){
        if (pet1.getClass().toString().compareTo(pet2.getClass().toString()) > 0){
            return 1;
        } else if (pet1.getClass().toString().compareTo(pet2.getClass().toString()) < 0){
            return -1;
        } else {
            if (pet1.getName().compareTo(pet2.getName()) > 0){
                return 1;
            } else if (pet1.getName().compareTo(pet2.getName()) < 0){
                return -1;
            }
            return 0;
        }
    }
}
