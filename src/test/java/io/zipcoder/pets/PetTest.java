package io.zipcoder.pets;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/31/17.
 */
public class PetTest {
    Pet turbo = new Pet();


    @Test
    public void speakTest(){
        String expected = "Grr";
        String actual = turbo.speak();
        assertEquals(expected,actual);
    }

}