package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        Cat cat = AnimalFactory.createCat("Ayy", new Date());

        String expected = "Ayy";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        Cat cat = AnimalFactory.createCat("Bee", new Date());
        Cat catdog =  new Cat("Cee", new Date(), 3);
        catdog.speak();

        String expected = "meow!";
        String actual = catdog.speak();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
    Cat cat = AnimalFactory.createCat("Dee", new Date(01-1-2001));
    Date actual = cat.getBirthDate();
    Date expected = new Date(01-1-2001);

    Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        Cat cat = new Cat("Eee", new Date(), 9);
        Food food = new Food();

        cat.eat(food);
        Integer actual = cat.getNumberOfMealsEaten();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
    Cat cat = new Cat("Eff", new Date(), 5);

    Integer expected = 5;
    Integer actual = cat.getId();

    Assert.assertEquals(expected, actual);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        Cat cat = new Cat("Gee", new Date(), 13);

        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
    Cat mammalCat = AnimalFactory.createCat("Ayche", new Date());

    Assert.assertTrue(mammalCat instanceof Mammal);
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
