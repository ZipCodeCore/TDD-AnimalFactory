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
    public void setNameTest() {
        // Given
        String expectedName = "Bob";

        // When
        Cat cat = new Cat("Allen", new Date(10), 10);
        cat.setName(expectedName);
        String actualName = cat.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void speakTest() {
        // Given
        String expectedOutput = "meow!";

        // When
        Cat cat = new Cat("Allen", new Date(10), 10);
        String actualOutput = cat.speak();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        Date expectedBirthDate = new Date(10);

        // When
        Cat cat = new Cat("Allen", new Date(2), 10);
        cat.setBirthDate(expectedBirthDate);
        Date actualBirthDate = cat.getBirthDate();

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
        Cat cat = new Cat("Allen", new Date(10), 10);
        cat.eat(bacon); cat.eat(turkey);
        int actualNumberOfMealsEaten = cat.getNumberOfMealsEaten();

        // Then
        Assert.assertEquals(expectedNumberOfMealsEaten, actualNumberOfMealsEaten);
    }

    @Test
    public void getIdTest() {
        // Given
        int expectedId = 3;

        // When
        Cat cat = new Cat("Allen", new Date(10), 3);
        int actualId = cat.getId();

        // Then
        Assert.assertEquals(expectedId, actualId);
    }

    @Test
    public void animalInheritanceTest() {
        // Given
        Cat cat = new Cat("Allen", new Date(10), 10);

        // When
        boolean doesCatInheritAnimal = cat instanceof Animal;

        // Then
        Assert.assertTrue(doesCatInheritAnimal);
    }

    @Test
    public void mammalInheritanceTest() {
        // Given
        Cat cat = new Cat("Allen", new Date(10), 10);

        // When
        boolean doesCatInheritMammal = cat instanceof Mammal;

        // Then
        Assert.assertTrue(doesCatInheritMammal);
    }

}
