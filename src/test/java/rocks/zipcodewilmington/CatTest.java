package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.Food;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest1() {
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
    public void setNameTest1() {

        //given data
        String givenName = "Zula";

        Cat cat = new Cat(null, null, null);

        cat.setName(givenName);

        String actualName = cat.getName();

        Assert.assertEquals(givenName, actualName);


    }

    @Test
    public void speakTest1()
    {
        String expectedSpeak = "meow!";
        Cat cat = new Cat(null, null, null);

        String actualSpeak = cat.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);


    }

    @Test
    public void setBirthDateTest1()
    {
        //given data
        Date givenBirthDate = new Date();

        Cat cat = new Cat(null, null, null);

        cat.setBirthDate(givenBirthDate);

        Date actualBirthDate = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, actualBirthDate);
    }

    @Test
    public void eatTest1()
    {
        Cat cat = new Cat("Cattest1", null, null);
        cat.eat(new Food());

        int actualFood = cat.getNumberOfMealsEaten();
        Assert.assertEquals(1, actualFood);

    }

    @Test
    public void getIdTest1()
    {

        // Given
        String expectedName = "catmeow";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;
        CatHouse.clear();

        // When
        Cat cat1 = AnimalFactory.createCat(expectedName, expectedBirthDate);

        // Then
        Integer actualid = cat1.getId();

        Assert.assertEquals(expectedId, actualid);
    }

    @Test
    public void getIdTest2()
    {

        // Given
       // String expectedName = "catmeow";
       // Date expectedBirthDate = new Date();
        Integer expectedId = 5;

        // When
        Cat cat1 = new Cat(null, null, expectedId);

        // Then
        Integer actualid = cat1.getId();

        Assert.assertEquals(expectedId, actualid);
    }



}
