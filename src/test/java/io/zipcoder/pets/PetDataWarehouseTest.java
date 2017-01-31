package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/31/17.
 */
public class PetDataWarehouseTest {
    PetDataWarehouse petDataWarehouse = new PetDataWarehouse();

    @Test
    public void addPetToPetsListTest(){
        petDataWarehouse.addPetToPetsList("sparky", "Dog");
        String actual = petDataWarehouse.getPet(0).speak();
        String expected = "Woof";
        assertEquals(expected, actual);
    }

    @Test
    public void addPetToPetsListTestCat(){
        petDataWarehouse.addPetToPetsList("boots", "Cat");
        String actual = petDataWarehouse.getPet(0).speak();
        String expected = "Meow";
        assertEquals(expected, actual);
    }

    @Test
    public void addPetToPetsListTestFish(){
        petDataWarehouse.addPetToPetsList("nemo", "Fish");
        String actual = petDataWarehouse.getPet(0).speak();
        String expected = "Grr";
        assertEquals(expected, actual);
    }

    @Test
    public void addALotOfPetsToTheList(){
        for (int i = 0; i < 10000000; i++) {
            petDataWarehouse.addPetToPetsList("Sparky", "Dog");
        }
        String actual = petDataWarehouse.getPet(999999).getName();
        String expected = "Sparky";
        assertEquals(expected,actual);
    }
}