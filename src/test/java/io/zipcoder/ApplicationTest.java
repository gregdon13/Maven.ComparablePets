package io.zipcoder;


import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ApplicationTest {
    Application app = new Application();

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
}
