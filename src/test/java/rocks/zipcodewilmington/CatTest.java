package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void newDogTest() {
        //given
        String expectedName = "Pepper";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;

        // When
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedId);
        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();

        Integer actualId = cat.getId();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void speakTest() {
        //given
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";

        //when
        String actual = cat.speak();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthDateTest() {
        String expectedName = "Martin";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;

        // When
        Cat cat = new Cat(expectedName, expectedBirthDate, expectedId);
        Date actualBirthDate = cat.getBirthDate();


        // Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Renaldo";

        // When (a dog's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = cat.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void eatTest() {
        //given
        Cat cat = new Cat(null, null, null);
        cat.eat(new Food());
        Integer expected = 1;

        //when
        Integer actual = cat.getNumberOfMealsEaten();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        Cat cat = new Cat(null, null, 1);
        Integer expected = 1;

        //when
        Integer actual = cat.getId();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void instanceAnimalTest() {
        //given
        Cat cat = new Cat (null, null, null);

        //when
        Boolean expected = true;
        Boolean actual = cat instanceof Animal;

        //then
        Assert.assertEquals(expected, actual);

    }
    @Test
    public void instanceMammalTest() {
        //given
        Cat cat = new Cat(null, null, null);

        //when
        Boolean expected = true;
        Boolean actual = cat instanceof Mammal;

        //then
        Assert.assertEquals(expected, actual);
    }
}


