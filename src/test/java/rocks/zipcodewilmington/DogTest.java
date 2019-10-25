package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

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
    public void setBirthDateTest(){
        String givenName = "Taco";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Dog dog = new Dog(null, givenBirthDate,null);
        Date retrivedBirthDate = dog.getBirthDate();

        Assert.assertEquals(givenBirthDate,retrivedBirthDate);
    }
    @Test
    public void speakTest(){
        Dog dog = new Dog(null, null, null);


        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void eatTest() {
        Dog dog = new Dog(null, null, null);

        int expected = dog.getNumberOfMealsEaten() ;
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten()    ;
        Assert.assertEquals(expected + 1, actual );
    }
    @Test
    public void getIdTest() {
        Integer givenId = 0;

        Dog dog = new Dog(null, null, givenId);

        Integer retrieveId = dog.getId();
        Assert.assertEquals(givenId, retrieveId);
    }
}
