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
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName(){
        //Given - setup the data
        //Create a new cat
        Cat cat = new Cat("aa", new Date(), 1);

        String expectedName = "bbb";

        //When - call the method you want to test
        cat.setName(expectedName);

        //Then - verify the result
        String actualName = cat.getName();
        Assert.assertEquals(expectedName, actualName);
    }


    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //Given
        Cat cat = new Cat("aa", new Date(), 1);
        String expectedNoise = "meow!";

        //When
        String actualNoise = cat.speak();

        //Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testBirthDate(){
        //Given - setup data
        Cat cat = new Cat("aa", new Date(), 1);
        //type Date is from the Mammal class
        Date expectedBirthDate = new Date();

        //When
        cat.setBirthDate(expectedBirthDate);

        //Then
        Date actualBirthDate = cat.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }


    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //Given
        Cat cat = new Cat("aa", new Date(),1);
        Integer expectedMeal = 1;

        //When
        cat.eat(new Food());

        Integer actualMeal = cat.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expectedMeal,actualMeal);
    }


    // TODO - Create tests for `Integer getId()`
    @Test
    public void testId(){
        //Given
        Integer expectedId = 1;
        Cat cat = new Cat("aa", new Date(), expectedId);


        //When
        Integer actualId = cat.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        //Given
        Cat cat = new Cat("aa", new Date(), 1);
        boolean expected = true;
        //When
        boolean actual = cat instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        //Given
        Cat cat = new Cat("aa", new Date(),1);
        boolean expected = true;
        //When
        boolean actual = cat instanceof Mammal;
        //Then
        Assert.assertEquals(expected,actual);
    }


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

}
