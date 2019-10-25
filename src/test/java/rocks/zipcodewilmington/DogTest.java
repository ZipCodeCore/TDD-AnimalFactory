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
    public void constructorTest() {
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
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


    @Test
    public void speakTest(){
        String givenName = "Milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog milo = new Dog("", givenBirthDate, 0);

        // given
        String expected = "bark!";

        // when
        String actual = milo.speak();

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthDateTest(){
        String givenName = "milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog milo = new Dog("", givenBirthDate, 0);
        // given
        Date expected = new Date();

        // when
        milo.setBirthDate(expected);

        // then
        Date actual = milo.getBirthDate();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest(){
        String givenName = "milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog milo = new Dog("", givenBirthDate, 0);
        // given
        Food food = new Food();
        int actual = milo.getNumberOfMealsEaten();
        int expected = actual + 1;


        // when
        milo.eat(food);
        actual = milo.getNumberOfMealsEaten();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void implementAnimalTest() {
        String givenName = "milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog milo = new Dog(givenName, givenBirthDate, givenId);

        // then
        Assert.assertTrue(milo instanceof Animal);
    }

    @Test
    public void implementMammalTest() {
        String givenName = "milo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog milo = new Dog(givenName, givenBirthDate, givenId);

        // then
        Assert.assertTrue(milo instanceof Mammal);
    }


}
