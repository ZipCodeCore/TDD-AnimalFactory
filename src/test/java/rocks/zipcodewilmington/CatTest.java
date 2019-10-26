package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    @Before
    public void setup(){}

    @After
    public void tearDown() {}


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

    // TODO - Create tests for `void setName(String name)`

    @Test
    public void testSetName(){
        Cat testCat = new Cat("Francis", new Date(), 1);
        String expected = "Francis";

        testCat.setName(expected);
        String actual = testCat.getName();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`

    @Test
    public void testSpeak(){
        Cat testCat = new Cat("Francis", new Date(), 1);
        String expected = "meow!";

        String actual = testCat.speak();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void testSetBirthDate(){
        Cat testCat = new Cat("Francis", new Date(), 1);
        Date expected = new Date();
        Date actual = testCat.getBirthDate();

        testCat.setBirthDate(expected);

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testEat(){
        Cat testCat = new Cat("Francis", new Date(), 1);
        Integer expected = 1;

        Food catFood = new Food();
        testCat.eat(catFood);

        Integer actual = testCat.getNumberOfMealsEaten();


        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void testGetID(){
        Cat cat = new Cat("Francis", new Date(), 5);
        Integer expected = 5;
        Integer actual = cat.getId();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testInstanceOfA(){
        Cat cat = new Cat("Francis", new Date(), 5);
        boolean actual = cat instanceof Animal;

        Assert.assertEquals(true, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test public void testInstanceOfM(){
        Cat cat = new Cat("Francis", new Date(), 5);
        boolean actual = cat instanceof Mammal;

        Assert.assertEquals(true, actual);
    }

}
