package io.zipcoder.pets;

import java.util.ArrayList;

/**
 * Created by williammattern on 1/31/17.
 */
public class PetDataWarehouse {
    ArrayList<Pet> petsList = new ArrayList<>();
    int numberOfPets;
    PetGenerator petGen = new PetGenerator();

    public void addPetToPetsList(String name, String type){
        petsList.add(petGen.createPet(name, type));
    }

    public Pet getPet(int index){
        return petsList.get(index);
    }
}
