package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/30/17.
 */
public class CatTest {

    @Test
    public void CatSpeakTest(){
        Cat smokey = new Cat();
        String expected = "Meow", actual = smokey.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void CatPetSpeakTest(){
        Pet smokey = new Pet();
        String expected = "The generic pet says: grrrrrrrrr", actual = smokey.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void CatSpeakTestUpcasting(){
        Pet smokey = new Cat();
        String expected = "Meow", actual = smokey.speak();
        assertEquals(expected,actual);
    }

}