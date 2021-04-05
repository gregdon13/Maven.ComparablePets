package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;


public class ApplicationTest {
    Application app = new Application();
    Pet pet = new Pet();
    Dog dog = new Dog("Fido");
    Cat cat = new Cat("Leon", "Cat");
    Hedgehog hedgehog = new Hedgehog("Ellie");

    @Test
    public void numberOfPets() {
        //Given
        app.addPet(dog);
        app.addPet(cat);
        app.addPet(hedgehog);
        Integer expected = 3;

        //When
        Integer actual = app.getNumberOfPets();

        //Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petName() {
        //Given
        app.addPet(cat);
        String expected = "Leon";

        //When
        String actual = app.getUserPets().get(0).getPetName();

        //Actual
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petType() {
        //Given
        app.addPet(cat);
        String expected = "Cat";

        //When
        String actual = app.getUserPets().get(0).getPetType();

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

    @Test
    public void sameList() {
        //Given
        app.addPet(dog);
        app.addPet(cat);
        app.addPet(hedgehog);

        //When
        ArrayList<Pet> expected = app.petList;
        ArrayList<Pet> actual = app.getUserPets();

        //Then
        Assert.assertEquals(expected, actual);
    }
}
