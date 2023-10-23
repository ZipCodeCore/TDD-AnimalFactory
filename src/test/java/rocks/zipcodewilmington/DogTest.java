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
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)` //
    // TODO - Create tests for `speak` //
    // TODO - Create tests for `setBirthDate(Date birthDate)`//
    // TODO - Create tests for `void eat(Food food)`//
    // TODO - Create tests for `Integer getId()`//
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
   /* @Test
    public void setname() {
        // Given (a name exists and a dog exists)

        // When (a dog's name is set to the given name)

        // Then (we expect to get the given name from the dog)

    }*/

    @Test
    public void constructor (){

        // Given (cat data)
        String givenName = "CARROTS";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);

    }


    @Test
    public void setNameTest() {

        String expected = "Firulais";

        Dog dog = new Dog("Firulais", null, 0);
        //cat.setName(expected);
        String actual = dog.getName();

        Assert.assertEquals(expected, actual);       //actual es el given
    }


    @Test
    public void speakTest() {
        String expected = "bark!";

        Dog dog = new Dog(null, null, null);
        dog.speak();

        String actual = dog.speak();
        //THEN
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDate() {
        Date expBirthDate = new Date(21 - 2 - 2001); // still pass if nada adentro en los parameters.

        Dog dog = new Dog("doggo", expBirthDate, 0); // still pass if pu null for all 3.
        dog.setBirthDate(expBirthDate);

        Date actualBirthDate = dog.getBirthDate();
        Assert.assertEquals(expBirthDate, actualBirthDate);


    }


    @Test
    public void eatTest() {
        int expected = 0;


        Dog dog = new Dog(null, null, null);
        Food food = new Food();
        int actual = dog.getNumberOfMealsEaten();
        dog.eat(food);

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void getIntegerId() {
        int expected = 0;

        Dog dog = new Dog(null, null, 0);
        int actual = dog.getId();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void animalInheritanceTest (){
        //given
        String givenName = "CARROTS";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //when
        Dog dog = new Dog(null, null, 0);
         boolean expected = true;
         boolean actual = dog instanceof Animal;
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest(){
        String givenName = "CARROTS";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //when
        Cat cat = new Cat(null, null, 0);
        boolean expected = true;
        boolean actual = cat instanceof Mammal;
        //then
        Assert.assertEquals(expected, actual);
    }
}
