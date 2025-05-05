package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
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
        String givenName = "Bob";
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
        String expectedOutput = "bark!";

        // When
        Dog dog = new Dog("Allen", new Date(10), 10);
        String actualOutput = dog.speak();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        Date expectedBirthDate = new Date(10);

        // When
        Dog dog = new Dog("Allen", new Date(2), 10);
        dog.setBirthDate(expectedBirthDate);
        Date actualBirthDate = dog.getBirthDate();

        // Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }

    @Test
    public void eatTest() {
        // Given
        Food bacon = new Food();
        Food turkey = new Food();
        int expectedNumberOfMealsEaten = 2;

        // When
        Dog dog = new Dog("Allen", new Date(10), 10);
        dog.eat(bacon); dog.eat(turkey);
        int actualNumberOfMealsEaten = dog.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void getIdTest() {
        // Given
        int expectedId = 3;

        // When
        Dog dog = new Dog("Allen", new Date(10), 3);
        int actualId = dog.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void animalInheritanceTest() {
        // Given
        Dog dog = new Dog("Allen", new Date(10), 10);

        // When
        boolean doesDogInheritAnimal = dog instanceof Animal;

        // Then
        Assert.assertTrue(doesDogInheritAnimal);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given
        Dog dog = new Dog("Allen", new Date(10), 10);

        // When
        boolean doesDogInheritMammal = dog instanceof Mammal;

        // Then
        Assert.assertTrue(doesDogInheritMammal);
    }
}
