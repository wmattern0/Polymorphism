package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by williammattern on 1/31/17.
 */
public class DogTest {

    Dog turbo;

    @Test
    public void dogSpeakTest(){
        turbo = new Dog("Turbo");
        String expected = "Woof", actual = turbo.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void dogNameTest(){
        turbo = new Dog("Turbo");
        String expected = "Turbo", actual = turbo.getName();
        assertEquals(expected,actual);
    }

}
