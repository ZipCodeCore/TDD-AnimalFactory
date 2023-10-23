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
    public void speakTest() {
        //given
        String dogName = "Milo";
        Date birthDay = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(dogName,birthDay,0);

        //when
        String dogSpeak = dog.speak();

        //then

        Assert.assertEquals("bark!", dogSpeak);

    }

    @Test
    public void setBirthDate(){
        //given
        String dogName = "Milo";
        Date birthDay = new Date(1993, 8, 2);
        Integer givenId = 0;
        Dog dog = new Dog(dogName,birthDay,0);


        //when
        dog.setBirthDate(birthDay);

        //then
        Assert.assertEquals(birthDay, birthDay);

    }

    @Test
    public void eatTest(){
        //given
        String dogName = "Milo";
        Date birthDay = new Date();
        Integer givenId = 0;
        Food actualFood = new Food();
        Dog dog = new Dog(dogName,birthDay,0);

        //when
        dog.eat(actualFood);
        int mealsEaten = dog.getNumberOfMealsEaten();

        //then
        Assert.assertEquals(1, mealsEaten);

    }

    @Test
    public void getIdTest() {
        //given
        String dogName = "Milo";
        Date birthDay = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(dogName,birthDay,0);

        //when
        int id = dog.getId();

        //then
        Assert.assertEquals(givenId, dog.getId());
    }

    @Test
    public void animalInheritanceTest() {
        //given
        String dogName = "Milo";
        Date birthDay = new Date();
        Integer givenId = 0;


        //when
        Dog dog = new Dog(dogName,birthDay,0);

        //then
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest() {
        //given
        String dogName = "Mil0";
        Date birthDay = new Date();
        Integer givenId = 0;


        //when
        Dog dog = new Dog(dogName,birthDay,0);

        //then
        Assert.assertTrue(dog instanceof Mammal);
    }
}
