package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void newDogTest(){
        //given
        String expectedName = "Oppa";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;

        // When
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();

        Integer actualId = dog.getId();

        // Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedId, actualId);
    }
    @Test
    public void speakTest() {
        //given
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";

        //when
        String actual = dog.speak();

        //then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthDateTest(){
        String expectedName = "Otis";
        Date expectedBirthDate = new Date();
        Integer expectedId = 0;

        // When
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
        Date actualBirthDate = dog.getBirthDate();

        Integer actualId = dog.getId();

        // Then
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
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
