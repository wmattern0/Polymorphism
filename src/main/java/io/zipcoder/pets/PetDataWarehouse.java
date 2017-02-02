package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by williammattern on 1/31/17.
 */
public class PetDataWarehouse {
    ArrayList<Pet> petsList = new ArrayList<>();
    int numberOfPets;
    PetGenerator petGen = new PetGenerator();
    PetChecker petChecker = new PetChecker();

    public void addPetToPetsList(String name, String type){
        petsList.add(petGen.createPet(name, type));
        Collections.sort(petsList);
    }

    public Pet getPet(int index){
        return petsList.get(index);
    }

    public ArrayList<Pet> sortListOfPetsByName(ArrayList<Pet> petArrayList){
        Collections.sort(petArrayList);
        return petArrayList;
    }

    public ArrayList<Pet> sortListOfPetsByType(ArrayList<Pet> petArrayList){
        Collections.sort(petArrayList,petChecker);
        return petArrayList;
    }
}
