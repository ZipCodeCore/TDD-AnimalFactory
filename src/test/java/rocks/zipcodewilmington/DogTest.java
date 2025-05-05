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

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Momo";
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
    } // end of constructorTest

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

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate() {
        // Given
        String givenName = "Roscoe";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Date expectedDate = new Date(19 - 6 - 2015);

        // When
        Dog dogTest = new Dog(givenName, givenBirthDate, givenId);
        dogTest.setBirthDate(expectedDate);

        // Then
        Date actual = dogTest.getBirthDate();
        Assert.assertEquals(expectedDate, actual);
    }

    // TODO - Create tests for `speak`

    @Test
    public void speakTest() {
        //Given
        String givenName = "Kujo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expectedSpeak = "bark!";

        //When
        Dog dogTest = new Dog(givenName, givenBirthDate, givenId);
        String actualSpeak = dogTest.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);

    }

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatTest () {
        //Given
        String givenName = "Rover";
        Date givenBirthDate = new Date ();
        Integer givenId = 0;
        Integer expected = 1;
        Food food = new Food ();

        //When
        Dog dogTest = new Dog(givenName, givenBirthDate, givenId);
        dogTest.eat(food);

        //Then
        Integer actual = dogTest.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void getIdTest() {
        //Given
        String givenName = "Shotzzie";
        Date givenBirthDate = new Date ();
        Integer expected = 3;

        //When
        Dog dogTest = new Dog(givenName, givenBirthDate, 3);
        Integer actual = dogTest.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        Animal dog = new Dog ("Toto", null , null);
        Assert.assertTrue(dog instanceof Animal);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        Mammal dog = new Dog ("Eddy", null , null);
        Assert.assertTrue(dog instanceof Mammal);
    }

}//final brace