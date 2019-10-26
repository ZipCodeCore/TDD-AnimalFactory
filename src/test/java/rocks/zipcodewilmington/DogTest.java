package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {

    @Before
    public void setup() {
    }

    @After
    public void teardown()  {
    }
    @Test
    public void testNewDog() {
        Dog dog1 = new Dog("Ralph", new Date(), 3);
        String expected = "Ralph";
        String actual = dog1.getName();
        Assert.assertEquals(expected, actual);
    }

     @Test
     public void testSpeak()    {
         Dog dog1 = new Dog("bob", new Date(), 3);
         String expected = "bark!";
         String actual = dog1.speak();
         Assert.assertEquals(expected, actual);
     }

     @Test
    public void testSetBirthDate()  {
        Dog dog1 = new Dog("Phil", new Date(), 5);
        Date expected = new Date();
        Date actual = new Date();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testEatFood()   {
        Dog dog2 = new Dog("Tom", new Date(), 4);
        Food dogChow = new Food();
        Integer expected = 1;
        dog2.eat(dogChow);
        Integer actual = dog2.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetId() {
        Dog dog2 = new Dog("ted", new Date(), 0);
        Integer expected = 0;
        Integer actual = dog2.getId();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAnimalInheritance() {
        Dog hank = new Dog("hank", new Date(), 4);
        boolean expected = true;
        boolean actual = hank instanceof Animal;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMammalInheritance() {
        Dog tim = new Dog("tim", new Date(), 4);
        boolean expected = true;
        boolean actual = tim instanceof Mammal;
        Assert.assertEquals(expected, actual);
    }


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
}
