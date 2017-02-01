package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 2/1/17.
 */
public class PetCheckerTest {
    PetChecker petChecker = new PetChecker();
    Pet turbo;
    Pet turbo2;

    @Test
    public void compareTestEquivalent(){
        turbo = new Pet("Turbo");
        turbo2 = new Pet("Turbo");
        int actual = petChecker.compare(turbo,turbo2), expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void compareTest1Before2(){
        turbo = new Pet("Turbo");
        turbo2 = new Pet("Turbs");
        int actual = petChecker.compare(turbo,turbo2), expected = -1;
        assertEquals(expected,actual);
    }

    @Test
    public void compareTest1After2(){
        turbo = new Pet("Turbs");
        turbo2 = new Pet("Turbo");
        int actual = petChecker.compare(turbo,turbo2), expected = 1;
        assertEquals(expected,actual);
    }
}