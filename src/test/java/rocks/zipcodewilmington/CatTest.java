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
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


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
    public void testSetName(){
        //Given name
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // new name
        String newName = "Nina";

        // change name
        cat.setName(newName);

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(newName, cat.getName());
    }
    @Test
    public void testSetBirthDate(){
        //Given date
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When new cat is constructed
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // new birthDate
        Date newDate = new Date(1993,11,2);

        // changes birthDate
        cat.setBirthDate(newDate);

        // Then (Given data is to match retrieved data
        Assert.assertEquals(newDate, cat.getBirthDate());
    }

    @Test
    public void testSpeak(){
        //Given name birthDate and Id
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When new cat is constructed
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //expected
        String expected = "meow!";

        //Then (Given data is to match retrieved data
        Assert.assertEquals(expected, cat.speak());
    }

    @Test
    public void testEat(){
        //Given name birthDate and Id
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When new cat is constructed
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //expected
        Integer expected = cat.getNumberOfMealsEaten() + 1;

        //action
        cat.eat(new Food());

        //Then (Given data is to match retrieved data
        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }

    @Test
    public void testGetId(){
        //Given name birthDate and Id
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // when a cat is constructed
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // expected
        Integer expected = givenId;

        //Then (Given data is to match retrieved data
        Assert.assertEquals(expected, cat.getId());
    }
    
    @Test
    public void testInstanceOfAnimal(){
        //Given name birthDate and Id
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // when a cat is constructed
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //Then (Given data is to match retrieved data
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void testInstanceOfMammal(){
        //Given name birthDate and Id
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // when a cat is constructed
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        //Then (Given data is to match retrieved data
        Assert.assertTrue(cat instanceof Mammal);

    }
}
