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
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testNewDog(){
        //Given
        String name = "Mocha";
        Date birthDate = new Date();
        Integer id = 1;
        //When
        Dog actualDog = new Dog(name,birthDate,1);
        //Then
        Assert.assertEquals(name,actualDog.getName());
        Assert.assertEquals(birthDate,actualDog.getBirthDate());
        Assert.assertEquals(id,actualDog.getId());
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //Given
        Dog dog = new Dog("aa", new Date(), 1);
        String expectedNoise = "bark!";

        //When
        String actualNoise = dog.speak();

        //Then
        Assert.assertEquals(expectedNoise, actualNoise);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testBirthDate(){
        //Given - setup data
        Dog dog = new Dog("aa", new Date(), 1);
        //type Date is from the Mammal class
        Date expectedBirthDate = new Date();

        //When
        dog.setBirthDate(expectedBirthDate);

        //Then
        Date actualBirthDate = dog.getBirthDate();
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //Given
        Dog dog = new Dog("aa", new Date(),1);
        Integer expectedMeal = 1;

        //When
        dog.eat(new Food());

        Integer actualMeal = dog.getNumberOfMealsEaten();

        //Then
        Assert.assertEquals(expectedMeal,actualMeal);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testId(){
        //Given
        Integer expectedId = 1;
        Dog dog = new Dog("aa", new Date(), expectedId);


        //When
        Integer actualId = dog.getId();

        //Then
        Assert.assertEquals(expectedId, actualId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        //Given
        Dog dog = new Dog("aa", new Date(), 1);
        boolean expected = true;
        //When
        boolean actual = dog instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        //Given
        Dog dog = new Dog("aa", new Date(),1);
        boolean expected = true;
        //When
        boolean actual = dog instanceof Mammal;
        //Then
        Assert.assertEquals(expected,actual);
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
