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
    @Test
    public void testSetName() {
        //given
        String expectedName = "Bo";
        //when
        Dog newDog = new Dog(expectedName);
        String actual = newDog.getName();
        //then
        Assert.assertEquals(expectedName, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        //given
        String expectedSpeak = "bark!";
        //when
        Dog newDog = new Dog(expectedSpeak);
        String actual = newDog.speak();
        //then
        Assert.assertEquals(expectedSpeak, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        //given
        Date expectedBirthDate = new Date(2019-03-15);
        //when
        Dog newDog = new Dog(expectedBirthDate);
        Date actual = newDog.getBirthDate();
        //then
        Assert.assertEquals(expectedBirthDate, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        //given
        Integer expectedValue = 1;
        Date givenBirthDate = new Date(2018-06-11);
        Dog newDog = new Dog("Penelope", givenBirthDate, 3);
        //when
        Food newFood = new Food("Blue Buffalo", "chicken", false);
        newDog.eat(newFood);
        //then
        Integer actualValue = newDog.getNumberOfMealsEaten();
        Assert.assertEquals(expectedValue, actualValue);

    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        //given
        Integer expectedValue = 4;
        Date givenBirthDate = new Date(2019-07-04);
        Dog newDog = new Dog("Turtle", givenBirthDate, 8);
        //when
        Integer actualValue = newDog.getId();
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        Dog newDog = new Dog("Rin", null, null);
        Assert.assertTrue(newDog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
        Dog newDog = new Dog("Haru", null, null);
        Assert.assertTrue(newDog instanceof Mammal);
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
}
