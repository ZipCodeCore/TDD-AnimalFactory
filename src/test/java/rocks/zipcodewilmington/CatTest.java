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
    public void setNameTest() {
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat pongo = new Cat("", givenBirthDate, givenId);

        String expected = "Pongo";
        pongo.setName("Pongo");
        String actual = pongo.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest() {
        String givenName = "Pongo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat pongo = new Cat(givenName, givenBirthDate, givenId);

        String expected = "meow";
        String actual = pongo.speak();
    }

    @Test
    public void setBirthDateTest() {
        String givenName = "Pongo";
        Integer givenId = 0;
        Cat pongo = new Cat(givenName, new Date(), givenId);

        Date givenDate = new Date(50050505);
        pongo.setBirthDate(givenDate);

        String expected = givenDate.toString();
        String actual = pongo.getBirthDate().toString();

        Assert.assertEquals(expected, pongo.getBirthDate().toString());
    }

    @Test
    public void eatTest() {
        String givenName = "Pongo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat pongo = new Cat(givenName, givenBirthDate, givenId);

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
        Cat pongo = new Cat(givenName, givenBirthDate, givenId);

        int expected = givenId;
        int actual = pongo.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest() {
        String givenName = "Pongo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat pongo = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(pongo instanceof Mammal);
    }

    @Test
    public void animalImplementationTest() {
        String givenName = "Pongo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat pongo = new Cat(givenName, givenBirthDate, givenId);

        Assert.assertTrue(pongo instanceof Animal);
    }


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

}
