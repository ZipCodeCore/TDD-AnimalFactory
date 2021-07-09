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
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Mochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest() {
        // Given
        String givenName = "Mochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expectedSpeak = "bark!";

        // When
        Dog test = new Dog(givenName, givenBirthDate, givenId);
        String actual = test.speak();

        // Then
        Assert.assertEquals(expectedSpeak,actual);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        Date givenBirthDate = new Date();
        Date expectedBirthDate = new Date(20-6-2021);

        // When
        Dog test = new Dog(null, givenBirthDate, null);
        test.setBirthDate(expectedBirthDate);

        // Then
        Date actual = test.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actual);
    }

    @Test
    public void eatTest() {
        // Given
        Integer expectedNumOfMeals = 1; // ate food 1 times
        Food eatFood = new Food("Hungry Hippo", 5, true);

        // When
        Dog test = new Dog(null, null, null);
        test.eat(eatFood); // ate food 1 times

        // Then
        Integer actual = test.getNumberOfMealsEaten();
        Assert.assertEquals(expectedNumOfMeals, actual);
    }

    @Test
    public void getIdTest() {
        // Given
        String givenName = "Mochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // String expectedSpeak = "bark!";

        // When
        Dog test = new Dog(givenName, givenBirthDate, givenId);
        Integer actual = test.getId();

        // Then
        Assert.assertEquals(givenId,actual);
    }

    @Test
    public void testInheritanceMammal() {
        Mammal dog = new Dog ("Mochi");
        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void testInheritanceAnimal() {
        Animal dog = new Dog("Mochi Junior");
        Assert.assertTrue(dog instanceof Animal);
    }
}
