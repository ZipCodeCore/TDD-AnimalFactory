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
    public void newDogTest(){
        //given (that a Dog exists)
        Dog dog = new Dog("Milo",new Date(0),12345);
        //when (a new dog is created)

        //then (we expect that the dog has been instantiated?)
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        //given (That speaks method exist and a dog exist)
        Dog dog = new Dog(null,null,null);
        String expected = "bark!";
        //when (a dog is set to speaking)
        String actual = dog.speak();
        //then (a dog should bark)
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        //given (we have a dog and we have a Date)
        Dog dog = new Dog(null,new Date(1336313), null);
        Date expected = new Date(1336313);
        //when (a dog birthday is set to birthDate)
        Date actual = dog.getBirthDate();
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        //given ( we have a dog who exists and we have a eat that exist)
        Dog dog = new Dog(null,null,null);
        //when
        int actualMeals = dog.getNumberOfMealsEaten();
        dog.eat(new Food());
        int expectedMeals = dog.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(actualMeals + 1,expectedMeals);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        //given ( that we have a ID that exist and dog that exist)
        Dog dog = new Dog(null,null,12345);

        //when ( the actual dog is compared to the expected dog)
        Integer expected = 12345;
        Integer actual = dog.getId();

        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfAnimalTest(){
        boolean expected = true;
        Dog dog = new Dog(null,null,null);
        boolean actual = dog instanceof Animal;
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfMammalTest(){
        boolean expected = true;
        Dog dog = new Dog(null,null,null);
        boolean actual = dog instanceof Mammal;
        Assert.assertEquals(expected, actual);

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
