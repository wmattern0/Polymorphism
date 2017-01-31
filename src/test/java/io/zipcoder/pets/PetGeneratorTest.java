package io.zipcoder.pets;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by williammattern on 1/31/17.
 */
public class PetGeneratorTest {
    PetGenerator petGenerator = new PetGenerator();

    @Test
    public void petGeneratorNameTest(){
        Pet sparky = petGenerator.createPet("sparky","Dog");
        String actual = sparky.getName();
        String expected = "sparky";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petGeneratorDogTest(){
        Pet sparky = petGenerator.createPet("sparky","Dog");
        String actual = sparky.speak();
        String expected = "Woof";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petGeneratorCatTest(){
        Pet boots = petGenerator.createPet("Boots","Cat");
        String actual = boots.speak();
        String expected = "Meow";
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void petGeneratorDinoTest(){
        Pet denver = petGenerator.createPet("Denver","Dino");
        String actual = denver.speak();
        String expected = "Roar";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petGeneratorFishTest(){
        Pet nemo = petGenerator.createPet("Nemo","Fish");
        String actual = nemo.speak();
        String expected = "Grr";
        Assert.assertEquals(expected, actual);
    }
}
