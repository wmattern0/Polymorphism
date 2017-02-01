package io.zipcoder.pets;

import static io.zipcoder.pets.UserInputOutput.*;

/**
 * Created by williammattern on 1/31/17.
 */
public class Engine {

    UserInputOutput inputOutput = new UserInputOutput();
    PetDataWarehouse petDataWarehouse = new PetDataWarehouse();

    public void run(){
        petDataWarehouse.numberOfPets = askHowManyPets();
        for (int i = 0; i < petDataWarehouse.numberOfPets; i++){
            petDataWarehouse.addPetToPetsList(askNameOfPet(i + 1),askTypeOfPet(i + 1));
        }
        printListOfPets(petDataWarehouse.petsList);
    }
}
