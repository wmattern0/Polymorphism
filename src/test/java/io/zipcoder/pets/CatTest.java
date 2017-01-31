package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/31/17.
 */
public class CatTest {
    Cat smokey;

    @Test
    public void speakTest(){
        smokey = new Cat("smokey");
        String expected = "Meow", actual = smokey.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void nameTest(){
        smokey = new Cat("smokey");
        String expected = "smokey", actual = smokey.getName();
        assertEquals(expected,actual);
    }
}