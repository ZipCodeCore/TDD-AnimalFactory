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
    public void testSetName() {
        // Given (cat data)
        String givenName = "Bill";
        Date givenBirthDate = new Date();
        Integer givenId = 44;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String expected = "Bill";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void testBirthDate() {
        // Given (cat data)
        String givenName = "Sally";
        Date givenBirthDate = new Date();
        Integer givenId = 2;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Date retrievedDate = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, retrievedDate);
    }

    @Test
    public void testSpeak() {
        // Given (cat data)
        String givenName = "Will";
        Date givenBirthDate = new Date();
        Integer givenId = 7;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        String retrievedSpeak = cat.speak();

        Assert.assertEquals("meow!", retrievedSpeak);
    }

    @Test
    public void testEatFood() {
        // Given (cat data)
        String givenName = "Monkey";
        Date givenBirthDate = new Date();
        Integer givenId = 1;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        cat.eat(new Food());
        int expected = 1;
        int actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetId() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        int retrievedId = cat.getId();
        int actual = 0;
        Assert.assertEquals(actual, retrievedId);
    }
    @Test
    public void testInstanceAnimal() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat instanceof Animal);
    }
    @Test
    public void testInstanceMammal() {
        // Given (cat data)
        String givenName = "Apple";
        Date givenBirthDate = new Date();
        Integer givenId = 2;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(cat instanceof Mammal);
    }


}
