package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/31/17.
 */
public class PetTest {
    Pet turbo;


    @Test
    public void speakTest(){
        turbo = new Pet();
        String expected = "Grr";
        String actual = turbo.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void noArgsConstructorTest(){
        turbo = new Pet();
        String expected = null;
        String actual = turbo.getName();
        assertEquals(expected,actual);
    }

    @Test
    public void nameConstructorTest(){
        turbo = new Pet("turbo");
        String expected = "turbo";
        String actual = turbo.getName();
        assertEquals(expected,actual);
    }

    @Test
    public void petComparatorTest(){
        turbo = new Pet("Turbo");
        Pet turbs = new Pet("Turbs");
        int expected = -1, actual = turbo.compareTo(turbs);
        assertEquals(expected,actual);
    }

    @Test
    public void petComparatorTestAgain(){
        turbo = new Pet("Turbo");
        Pet turbs = new Pet("Turbs");
        int expected = 1, actual = turbs.compareTo(turbo);
        assertEquals(expected,actual);
    }

    @Test
    public void petComparatorTestEquivalent(){
        turbo = new Pet("Turbo");
        Pet turbs = new Pet("Turbo");
        int expected = 0, actual = turbs.compareTo(turbo);
        assertEquals(expected,actual);
    }

}