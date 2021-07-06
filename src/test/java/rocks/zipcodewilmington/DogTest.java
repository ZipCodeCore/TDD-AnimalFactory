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
    public void newDogTest() {
        String givenName = "Chad";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog (givenName, givenBirthDate, givenId);
        String actualDogName = dog.getName();
        Date actualDate = dog.getBirthDate();
        Integer actualId = dog.getId();

        Assert.assertEquals(givenName, actualDogName);
        Assert.assertEquals(givenBirthDate, actualDate);
        Assert.assertEquals(givenId, actualId);
    }

    @Test
    public void speakTest() {
        String speakTest = "bark!";
        Dog dog = new Dog ("Spanky", new Date(), 5);

        Assert.assertEquals(speakTest, dog.speak());
    }

    @Test
    public void setBirthDateTest() {
       Date birthDate = new Date();
        Dog dog = new Dog("Alice" , birthDate, 24   );
        Date actualBirthDate = dog.getBirthDate();

        Assert.assertEquals(birthDate, actualBirthDate);
    }

    @Test
    public void eatTest() {
        Food food = new Food();
        Dog dog = new Dog ("Edwin", new Date(), 15);
        dog.eat(food);

        Food lastMealEaten = dog.getLastMealEaten();

        Assert.assertEquals(lastMealEaten, food);
    }

    @Test
    public void getIdTest() {

        Dog dog = new Dog ("Nathan", new Date(), 10);
        Integer theNewId = dog.getId();

        Assert.assertEquals(theNewId, 10,0);
    }

    @Test
    public void checkInheritanceAnimal () {
        Dog dog = new Dog("Nathanial", new Date(), 13);
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void checkInheritanceMammal () {
        Dog dog = new Dog("Trash", new Date(), 69);
        Assert.assertTrue(dog instanceof Mammal);
    }
}
