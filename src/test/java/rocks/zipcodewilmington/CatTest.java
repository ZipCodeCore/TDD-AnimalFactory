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
        String givenName = "Charlie";
        //Date givenBirthDate = new Date();
        //Integer givenId = 0;
        String expectedName = "Garfield";

        // When
        Cat test = new Cat(givenName, null, null);
        test.setName(expectedName);

        // Then
        String actual = test.getName();
        Assert.assertEquals(expectedName, actual);
    }

    @Test
    public void speakTest() {
        // Given
        String givenName = "Garfield";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expectedSpeak = "meow!";

        // When
        Cat test = new Cat(givenName, givenBirthDate, givenId);
        String actual = test.speak();

        // Then
        Assert.assertEquals(expectedSpeak,actual);
    }

    @Test
    public void setBirthDateTest() {
        // Given
        Date givenBirthDate = new Date();
        Date expectedBirthDate = new Date(19-7-1978);

        // When
        Cat test = new Cat(null, givenBirthDate, null);
        test.setBirthDate(expectedBirthDate);

        // Then
        Date actual = test.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actual);
    }

    @Test
    public void eatTest() {
        // Given
        Integer expectedNumOfMeals = 1; // ate food 1 times
        Food eatFood = new Food("Fancy Feast", 3, true);

        // When
        Cat test = new Cat(null, null, null);
        test.eat(eatFood); // ate food 1 times

        // Then
        Integer actual = test.getNumberOfMealsEaten();
        Assert.assertEquals(expectedNumOfMeals, actual);
    }

    @Test
    public void getIdTest() {
        // Given
        String givenName = "Garfield";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        // String expectedSpeak = "meow!";

        // When
        Cat test = new Cat(givenName, givenBirthDate, givenId);
        Integer actual = test.getId();

        // Then
        Assert.assertEquals(givenId,actual);
    }

    @Test
    public void testInheritanceMammal() {
        Mammal cat = new Cat ("Garfield");
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void testInheritanceAnimal() {
        Animal cat = new Cat("Garfield Junior");
        Assert.assertTrue(cat instanceof Animal);

    }
}
