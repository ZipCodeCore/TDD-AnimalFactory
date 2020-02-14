package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void testSetBirthDate() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        Date givenBD = new Date(2000, 11, 21);

        // When (a dog's name is set to the given name)
        dog.setBirthDate(givenBD);

        // Then (we expect to get the given name from the dog)
        Date actual = dog.getBirthDate();
        Assert.assertEquals(givenBD, actual);
    }
    @Test
    public void testSpeak() {
        Dog dog = new Dog(null, null, null);



        String retrievedSpeak = dog.speak();

        Assert.assertEquals("bark!", retrievedSpeak);
    }
    @Test
    public void testEatFood() {

        Dog dog = new Dog(null, null, null);
        dog.eat(new Food());
        int expected = 1;
        int actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testGetId() {
        Dog dog = new Dog(null, null, 0);

        int retrievedId = dog.getId();
        int actual = 0;
        Assert.assertEquals(actual, retrievedId);
    }
    @Test
    public void testInstanceAnimal() {
        Dog dog = new Dog(null, null, null);

        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void testInstanceMammal() {
        Dog dog = new Dog(null, null, null);

        Assert.assertTrue(dog instanceof Mammal);
    }
}
