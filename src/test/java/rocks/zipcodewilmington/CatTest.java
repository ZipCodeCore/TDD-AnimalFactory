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
        // Given (a name exists and a dog exists)
        Cat cat = new Cat(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        cat.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String catName = cat.getName();
        Assert.assertEquals(catName, givenName);
    }

    @Test
    public void speakTest () {
        String speakTest = "meow!";
        Cat cat = new Cat(null, null, null);

        Assert.assertEquals(speakTest, cat.speak());
    }

    @Test
    public void setBirthDateTest () {
        Date birthDate = new Date();
        Cat cat = new Cat(null, birthDate, null);
        Date actualBirthDate = cat.getBirthDate();

        Assert.assertEquals(birthDate, actualBirthDate);
    }

    @Test
    public void eatTest() {
        Food food = new Food();
        Cat cat = new Cat(null,null,null);
        cat.eat(food);

        Food lastMealEaten = cat.getLastMealEaten();
        Assert.assertEquals(lastMealEaten, food);
    }

    @Test
    public void getIdTest () {
        Cat cat = new Cat(null, new Date(), 10);
        Integer actualId = cat.getId();
        Assert.assertEquals(actualId, 10, 0);
    }

    @Test
    public void checkInheritanceAnimal () {
        Cat cat = new Cat("Nathanial", new Date(), 13);
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void checkInheritanceMammal () {
        Cat cat = new Cat("Trash", new Date(), 69);
        Assert.assertTrue(cat instanceof Mammal);
    }
}
