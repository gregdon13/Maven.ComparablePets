package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApplicationTest {
    Application app = new Application();
    Pet pet = new Pet();
    Dog dog = new Dog();
    Cat cat = new Cat();
    Hedgehog hedgehog = new Hedgehog();

    @Test
    public void numberOfPets() {
        //Given
        app.setNumberOfPets(3);
        Integer expected = 3;

        //When
        Integer actual = app.getNumberOfPets();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petNameAndType() {
        //Given
        app.setPetNameType("Fluffy", "cat");
        String expected = "{Fluffy=cat}";

        //When
        String actual = app.getUserPets().toString();

        //Actual
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSpeak() {
        //Given
        String expected = "noise";

        //When
        String actual = pet.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setGetPetName() {
        //Given
        pet.setPetName("Fido");
        String expected = "Fido";

        //When
        String actual = pet.getPetName();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSpeak() {
        //Given
        String expected = "woof";

        //When
        String actual = dog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeak() {
        //Given
        String expected = "meow";

        //When
        String actual = cat.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void hedgehogSpeak() {
        //Given
        String expected = "huff";

        //When
        String actual = hedgehog.speak();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
