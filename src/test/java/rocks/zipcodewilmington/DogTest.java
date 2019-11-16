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
    public void testNewDog() {
        Dog dog = new Dog(null, null, null) {

        };
    }

    @Test
    public void testSpeak() {
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";
        Assert.assertEquals(expected, dog.speak());

    }

    @Test
    public void testSetBirthDate() {
        Dog dog = new Dog(null, null, null);
        Date expected = new Date();
        dog.setBirthDate(expected);
        Assert.assertEquals(expected, dog.getBirthDate());
    }

    @Test
    public void testEat() {
        Dog dog = new Dog(null, null, null);
        Integer expected = dog.getNumberOfMealsEaten() + 1;
        dog.eat(new Food());
        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());

    }

    @Test
    public void testID() {
        Integer expected = 25;
        Dog dog = new Dog(null, null, expected);
        Assert.assertEquals(expected, dog.getId());


    }

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
    public void isAMammalTest() {
        Dog dog = new Dog(null, null, null);
        Boolean expected = true;
        Assert.assertEquals(dog instanceof Mammal, expected);
    }

    @Test
    public void isAnAnimalTest() {
        Dog dog = new Dog(null, null, null);
        Boolean expected = true;
        Assert.assertEquals(dog instanceof Animal, expected);

    }
}
