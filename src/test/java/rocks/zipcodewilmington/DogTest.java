package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

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
    public void setNameTest()
    {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    //new dog test
    @Test
    public void constructorTest1() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        DogHouse.clear();
        Dog dog1 = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog1.getName();
        Date retrievedBirthDate = dog1.getBirthDate();
        Integer retrievedId = dog1.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void speakTest1()
    {
        String expectedSpeak = "bark!";
        Dog dog1 = new Dog(null, null, null);

        String actualSpeak = dog1.speak();

        Assert.assertEquals(expectedSpeak, actualSpeak);


    }

    @Test
    public void setBirthDateTest1()
    {
        //given data
        Date givenBirthDate = new Date();

        Dog dog1 = new Dog(null, null, null);

        dog1.setBirthDate(givenBirthDate);

        Date actualBirthDate = dog1.getBirthDate();

        Assert.assertEquals(givenBirthDate, actualBirthDate);
    }

    @Test
    public void eatTest1()
    {
        Dog dog1 = new Dog("Dogtest1", null, null);
        dog1.eat(new Food());

        int actualFood = dog1.getNumberOfMealsEaten();
        Assert.assertEquals(1, actualFood);

    }

    @Test
    public void getIdTest1()
    {

        // Given
        String expectedName = "catmeow";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;

        // When
        DogHouse.clear();
        Dog dog1 = AnimalFactory.createDog(expectedName, expectedBirthDate);

        // Then
        Integer actualid = dog1.getId();

        Assert.assertEquals(expectedId, actualid);
    }

    @Test
    public void getIdTest2()
    {

        // Given
        // String expectedName = "catmeow";
        // Date expectedBirthDate = new Date();
        Integer expectedId = 5;

        // When
        Dog dog1= new Dog(null, null, expectedId);

        // Then
        Integer actualid = dog1.getId();

        Assert.assertEquals(expectedId, actualid);
    }



}
