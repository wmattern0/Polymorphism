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
}