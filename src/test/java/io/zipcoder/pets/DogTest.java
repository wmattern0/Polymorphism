package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/30/17.
 */
public class DogTest {
    @Test
    public void speakTest()  {
        Dog turbo = new Dog();
        String expected = "Woof", actual = turbo.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void speakTestPets(){
        Pet turbo = new Pet();
        String expected = "The generic pet says: grrrrrrrrr", actual = turbo.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void speakTestUpcasting(){
        Dog turbo = new Dog();
        String expected = "Woof", actual = ((Pet)turbo).speak();
        assertEquals(expected,actual);
    }
}