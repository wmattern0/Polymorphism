package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by williammattern on 1/31/17.
 */
public class DinoTest {

    Dino denver;

    @Test
    public void dinoSpeakTest(){
        denver = new Dino("Denver");
        String actual = denver.speak(), expected = "Roar";
        assertEquals(expected,actual);
    }

    @Test
    public void dinoNameTest(){
        denver = new Dino("Denver");
        String actual = denver.getName(), expected = "Denver";
        assertEquals(expected,actual);
    }
}
