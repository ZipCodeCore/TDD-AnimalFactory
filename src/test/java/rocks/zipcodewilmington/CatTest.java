package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {


    @Before
    public void setup() {
    }

    @After
    public void tearDown()  {
    };

    @Test
    public void testSetName() {
        Cat cat = new Cat("Fluffy the Marshmallow", new Date(4), 2);
        String expected = "Mr. Cat";
        cat.setName(expected);
        String actual = cat.getName();
        Assert.assertEquals(expected,actual);
        }

    @Test
    public void testSetBirthDate() {
        Cat cat = new Cat("Fluffy the Marshmallow", new Date(4), 2);
        Date expected = new Date();
        cat.setBirthDate(new Date());
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSpeak() {
        Cat cat = new Cat("Fluffy the Marshmallow", new Date(4), 2);
        String expected = "meow!";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testEat() {
        Cat cat = new Cat("Fluffy the Marshmallow", new Date(4), 2);
        Food kittyChow = new Food();
        Integer expected = 1;
        cat.eat(kittyChow);
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetId() {
        Cat cat = new Cat("Maira", new Date(4), 1);
        int actual = cat.getId();
        Assert.assertEquals(1, actual);
    }

    @Test
    public void testIsInstanceOfAnimal()   {
        Cat cat = new Cat("Maira", new Date(4), 1);
        boolean actual = cat instanceof Animal;
        Assert.assertEquals(true, actual);
    }

    @Test
    public void testIsInstanceOfMammal()    {
        Cat cat = new Cat("Maira", new Date(4), 1);
        boolean actual = cat instanceof Mammal;
        Assert.assertEquals(true, actual);
    }




       /* @Test
    public void testEat()   {
        Cat cat = new Cat() {
        Food expected =
        }*/


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


    }


