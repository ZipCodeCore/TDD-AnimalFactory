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


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Tucker";
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
    // TODO - Create tests for `speak`

    @Test
    public void speakTest1() {
        Dog dog = new Dog("Jerry", null, null);
        String actual = dog.speak();
        String expected = "bark!";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest2() {
        Dog dog = new Dog("Bob", null, null);
        String actual = dog.speak();
        String expected = "bark!";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest3() {
        Dog dog = new Dog("Tucker", null, null);
        String actual = dog.speak();
        String expected = "bark!";
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest1() {
        Dog dog = new Dog("Tucker", null, null);
        Date birthdate = new Date(0);
        dog.setBirthDate(birthdate);
        Date actual = dog.getBirthDate();
        Date expected = birthdate;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBirthDateTest2() {
        Dog dog = new Dog("Tucker", null, null);
        Date birthdate = new Date(1997,8,5);
        dog.setBirthDate(birthdate);
        Date actual = dog.getBirthDate();
        Date expected = birthdate;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBirthDateTest3() {
        Dog dog = new Dog("Tucker", null, null);
        Date birthdate = new Date(2015, 2, 3);
        dog.setBirthDate(birthdate);
        Date actual = dog.getBirthDate();
        Date expected = birthdate;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest1() {
        Dog dog = new Dog("Tucker", null, null);
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest2() {
        Dog dog = new Dog("Tucker", null, null);
        for (int i = 0; i < 10; i++) {
            dog.eat(new Food());
        }
        int actual = dog.getNumberOfMealsEaten();
        int expected = 10;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest3() {
        Dog dog = new Dog("Tucker", null, null);
        for (int i = 0; i < 100; i++) {
            dog.eat(new Food());
        }
        int actual = dog.getNumberOfMealsEaten();
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest1() {
        Dog dog = new Dog(null,null,14);
        int actual = dog.getId();
        int expected = 14;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getIdTest2() {
        Dog dog = new Dog(null,null,134);
        int actual = dog.getId();
        int expected = 134;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getIdTest3() {
        Dog dog = new Dog(null,null,45658);
        int actual = dog.getId();
        int expected = 45658;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkAnimalInheritanceTest() {
        Dog dog = new Dog(null,null,null);
        boolean result = dog instanceof Animal;
        Assert.assertTrue(result);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void checkMammalInheritanceTest() {
        Dog dog = new Dog(null,null,null);
        boolean result = dog instanceof Mammal;
        Assert.assertTrue(result);
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
