package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
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
        Dog pongo = new Dog(null, null, null);
        String givenName = "Pongo";

        // When (a dog's name is set to the given name)
        pongo.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = pongo.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void speakTest() {
        String givenName = "Pongo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog pongo = new Dog(givenName, givenBirthDate, givenId);

        String expected = "meow";
        String actual = pongo.speak();
    }

    @Test
    public void setBirthDateTest() {
        String givenName = "Pongo";
        Integer givenId = 0;
        Dog pongo = new Dog(givenName, new Date(), givenId);

        Date givenDate = new Date(50050505);
        pongo.setBirthDate(givenDate);

        String expected = givenDate.toString();
        String actual = pongo.getBirthDate().toString();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest() {
        String givenName = "Pongo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog pongo = new Dog(givenName, givenBirthDate, givenId);

        Food food = new Food();
        pongo.eat(food);

        int expected = 1;
        int actual = pongo.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest() {
        String givenName = "Pongo";
        Integer givenId = 42;
        Date givenBirthDate = new Date();
        Dog pongo = new Dog(givenName, givenBirthDate, givenId);

        int expected = givenId;
        int actual = pongo.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest() {
        String givenName = "Pongo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog pongo = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(pongo instanceof Mammal);
    }

    @Test
    public void animalImplementationTest() {
        String givenName = "Pongo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog pongo = new Dog(givenName, givenBirthDate, givenId);

        Assert.assertTrue(pongo instanceof Animal);
    }


    @Test
    public void constructorTest() {
        // Given (Dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a Dog is constructed)
        Dog pongo = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the Dog)
        String retrievedName = pongo.getName();
        Date retrievedBirthDate = pongo.getBirthDate();
        Integer retrievedId = pongo.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
}
