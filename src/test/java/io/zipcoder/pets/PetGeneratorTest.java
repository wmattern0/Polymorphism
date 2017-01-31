package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by williammattern on 1/31/17.
 */
public class PetGeneratorTest {
    PetGenerator p = new PetGenerator();

    @Test
    public void petGeneratorNameTest(){
        Pet sparky = p.createPet("sparky","Dog");
        String actual = sparky.getName();
        String expected = "sparky";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petGeneratorDogTest(){
        Pet sparky = p.createPet("sparky","Dog");
        String actual = sparky.speak();
        String expected = "Woof";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petGeneratorCatTest(){
        Pet boots = p.createPet("Boots","Cat");
        String actual = boots.speak();
        String expected = "Meow";
        Assert.assertEquals(expected, actual);
    }


}
