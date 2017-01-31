package io.zipcoder.pets;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by williammattern on 1/30/17.
 */
public class FishTest {
    @Test
    public void fishSpeakTest(){
        Fish nemo = new Fish();
        String expected = "Blub...\nBlub...", actual = nemo.speak();
        assertEquals(expected,actual);
    }

    @Test
    public void fishSpeakTestUpcast(){
        Pet nemo = new Fish();
        String expected = "Blub...\nBlub...", actual = nemo.speak();
        assertEquals(expected,actual);
    }

}