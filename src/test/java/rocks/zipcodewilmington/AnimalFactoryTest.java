package rocks.zipcodewilmington;

import rocks.zipcodewilmington.animals.*;


import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;
import java.util.Calendar;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest
{
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest()
    {
        // Given
        String expectedName = "Doggy1";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;


        // When

        Dog dog1 = AnimalFactory.createDog(expectedName, expectedBirthDate);

        // Then
        String actualName = dog1.getName();
        Date actualbirthDate = dog1.getBirthDate();
        Integer actualid = dog1.getId();

       Assert.assertEquals(expectedName, actualName);
       Assert.assertEquals(expectedBirthDate, actualbirthDate);
       Assert.assertEquals(expectedId, actualid);

    }

    @Test
    public void createCatTest()
    {
        // Given
        String expectedName = "catmeow";
        Date expectedBirthDate = new Date();
       Integer expectedId = 0;

        // When
        Cat cat1 = AnimalFactory.createCat(expectedName, expectedBirthDate);

        // Then
        String actualName = cat1.getName();
        Date actualbirthDate = cat1.getBirthDate();
        Integer actualid = cat1.getId();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualbirthDate);
        Assert.assertEquals(expectedId, actualid);

    }


}
