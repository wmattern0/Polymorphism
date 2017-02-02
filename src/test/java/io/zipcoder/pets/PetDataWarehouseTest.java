package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/31/17.
 */
public class PetDataWarehouseTest {
    PetDataWarehouse petDataWarehouse = new PetDataWarehouse();
    PetChecker petChecker;
    ArrayList<String> namesInOrder;
    ArrayList<Pet> petArrayList;
    ArrayList<String> typesInOrder;



    @Before
    public void setUp() {
        petChecker = new PetChecker();
        Pet ari = new Pet("Ari");
        Pet boots = new Pet("Boots");
        Pet chris = new Pet("Chris");
        petArrayList = new ArrayList<>();
        namesInOrder = new ArrayList<>();
        typesInOrder = new ArrayList<>();
        namesInOrder.add("Ari");
        namesInOrder.add("Boots");
        namesInOrder.add("Chris");
        typesInOrder.add("Cat");
        typesInOrder.add("Dog");
        typesInOrder.add("Pet");
        petDataWarehouse.addPetToPetsList("Chris","Fish");
        petDataWarehouse.addPetToPetsList("Boots","Cat");
        petDataWarehouse.addPetToPetsList("Ari","Dog");
    }

    @Test
    public void addPetToPetsListTest(){
        String actual = petDataWarehouse.getPet(0).speak();
        String expected = "Woof";
        assertEquals(expected, actual);
    }

    @Test
    public void addPetToPetsListTestCat(){
        String actual = petDataWarehouse.getPet(1).speak();
        String expected = "Meow";
        assertEquals(expected, actual);
    }

    @Test
    public void addPetToPetsListTestFish(){
        String actual = petDataWarehouse.getPet(2).speak();
        String expected = "Grr";
        assertEquals(expected, actual);
    }

    @Test
    public void nameSortTestSpot0(){
        String expected = namesInOrder.get(0);
        String actual = petDataWarehouse.petsList.get(0).getName();
        assertEquals(expected,actual);
    }

    @Test
    public void nameSortTestSpot1(){
        String expected = namesInOrder.get(1);
        String actual = petDataWarehouse.petsList.get(1).getName();
        assertEquals(expected,actual);
    }

    @Test
    public void nameSortTestSpot2(){
        String expected = namesInOrder.get(2);
        String actual = petDataWarehouse.petsList.get(2).getName();
        assertEquals(expected,actual);
    }

    @Test
    public void typeSortTestSpot0(){
        String expected = typesInOrder.get(0);
        String actual = petDataWarehouse.sortListOfPetsByType(petDataWarehouse.petsList).get(0).getClass().getSimpleName();
        assertEquals("The first expected type is Cat",expected,actual);
    }

    @Test
    public void typeSortTestSpot1(){
        String expected = typesInOrder.get(1);
        String actual = petDataWarehouse.sortListOfPetsByType(petDataWarehouse.petsList).get(1).getClass().getSimpleName();
        assertEquals("The seconded expected type is Dog",expected,actual);
    }

    @Test
    public void typeSortTestSpot2(){
        String expected = typesInOrder.get(2);
        String actual = petDataWarehouse.sortListOfPetsByType(petDataWarehouse.petsList).get(2).getClass().getSimpleName();
        assertEquals("The third expected type is Pet",expected,actual);
    }


}