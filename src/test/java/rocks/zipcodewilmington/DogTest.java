package rocks.zipcodewilmington;

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

    private Dog testingDog;

    @Before
    public void setup() {
        this.testingDog = new Dog("Bob", new Date(0), 1);
    }

    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Fido";
        Date givenBirthDate = new Date(3);
        Integer givenId = 2;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
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
    public void testSpeak() {
        // Given
        String expected = "bark!";

        // when
        String actual = testingDog.speak();

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        // Given
        Date expected = new Date(1);

        // when
        testingDog.setBirthDate(new Date(1));

        // then
        Date actual = testingDog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        // Given
        Food food = new Food();

        // when
        int prevVal = testingDog.getNumberOfMealsEaten();
        testingDog.eat(food);
        int actual = testingDog.getNumberOfMealsEaten();

        // then
        int expected = prevVal+1;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetID() {
        // Given
        Integer expected = 1; // from the constructor

        // when
        Integer actual = testingDog.getId();

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInstance() {

        boolean actual = false;

        //java instanceof keyword
        //if (objectReference instanceof type)
        if( testingDog instanceof Animal) {
            actual = true;
        }

        // then
        Assert.assertTrue(actual);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInstance() {
        boolean actual = false;

        if(testingDog instanceof Mammal) {
            actual = true;
        }

        Assert.assertTrue(actual ) ;
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
