package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    @Before
    public void setup(){}

    @After
    public void tearDown() {}

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog testDog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        testDog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = testDog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void testSetName(){
        Dog testDog = new Dog("Scully", new Date(),1);
        String expected = "Scully";
        String actual = testDog.getName();

        testDog.setName(expected);


        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`

    @Test
    public void testSpeak(){
        Dog testDog = new Dog("Scully", new Date(),1);
        String expected = "bark!";
        String actual = testDog.speak();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void testSetBirthDate(){
        Dog testDog = new Dog("Scully", new Date(),1);
        Date expected = new Date();
        Date actual = testDog.getBirthDate();

        testDog.setBirthDate(expected);


        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void testEat(){
        Dog testDog = new Dog("Scully", new Date(),1);
        Integer expected = 1;

        Food dogFood = new Food();
        testDog.eat(dogFood);

        Integer actual = testDog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void testGetID(){
        Dog testDog = new Dog("Scully", new Date(),5);
        Integer expected = 5;
        Integer actual = testDog.getId();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testInstanceOfA(){
        Dog testDog = new Dog("Scully", new Date(),1);
        boolean actual = testDog instanceof Animal;

        Assert.assertEquals(true, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test public void testInstanceOfM(){
        Dog testDog = new Dog("Scully", new Date(),1);
        boolean actual = testDog instanceof Mammal;

        Assert.assertEquals(true, actual);
    }

}
