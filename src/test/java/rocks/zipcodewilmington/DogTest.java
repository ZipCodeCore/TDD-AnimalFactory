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
    public void testBirthDate(){
        // Given name, birthDate, Id
        String givenName = "Pancho";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When Dog is created
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Then expect to get birthDate  given to dog
        Date dogBirthDate = dog.getBirthDate();
        Assert.assertEquals(dogBirthDate, givenBirthDate);
    }

    @Test
    public void speakTest(){
        // Given name, birthDate, Id
        String givenName = "Pancho";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When Dog is created
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Then expect to get birthDate  given to dog
        String expected = dog.speak();
        Assert.assertEquals(expected, dog.speak());
    }

    @Test
    public void eatTest(){
        // Given name, birthDate, Id
        String givenName = "Pancho";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When Dog is created
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // Action
        dog.eat(new Food());

        // Then expect to get birthDate  given to dog
        Integer expected = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, dog.getNumberOfMealsEaten());
    }

    @Test
    public void getIdTest(){
        // Given name, birthDate, Id
        String givenName = "Pancho";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When Dog is created
        Dog dog = new Dog(givenName, givenBirthDate, givenId);


        // Then expect to get birthDate  given to dog
        Integer expected = dog.getId();
        Assert.assertEquals(expected, dog.getId());
    }

    @Test
    public void dogInstanceOfAnimal(){
        // Given name, birthDate, Id
        String givenName = "Pancho";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When Dog is created
        Dog dog = new Dog(givenName, givenBirthDate, givenId);


        // Then expect to get birthDate  given to dog
        Assert.assertTrue(dog instanceof Animal);
    }

    @Test
    public void dogInstanceOfMammal(){
        // Given name, birthDate, Id
        String givenName = "Pancho";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        //When Dog is created
        Dog dog = new Dog(givenName, givenBirthDate, givenId);


        // Then expect to get birthDate  given to dog
        Assert.assertTrue(dog instanceof Mammal);
    }
}
