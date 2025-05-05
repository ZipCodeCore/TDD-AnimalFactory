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
    String givenName = "Sparky";
    Date givenBirthDate = new Date();
    Integer givenId = 0;
    Dog dog = new Dog(givenName, givenBirthDate, givenId);


    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogTest(){
        //Given
        String givenName = "Sparky";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        //When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();
        //Then
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);

    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        String bark = "bark!";
        Assert.assertEquals(bark, dog.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        //Given
        Date newBirthday = new Date();
        //When
        dog.setBirthDate(newBirthday);
        //Then
        Assert.assertEquals(newBirthday, dog.getBirthDate());
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Food bone = new Food();
        dog.eat(bone);
        Food lastMeal = dog.getLastMealEaten();
        Assert.assertEquals(lastMeal,bone);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Assert.assertEquals(givenId, dog.getId());
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceOfAnimalTest(){
        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceOfMammalTest(){
        Assert.assertTrue(dog instanceof Mammal);
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
