package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    private Cat testingCat;

    @Before
    public void setup() {
         this.testingCat = new Cat("Ralph", new Date(0), 1);
        }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName() {
        // Given
      //  Date date = new Date();
     //   Cat cat = new Cat("Bob",date,1);
        String expected = "Garfield";

        // when
        testingCat.setName("Garfield");

        // then - is this testing correctly?
        String actual = testingCat.getName();
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        // Given
        String expected = "meow!";

        // when
        String actual = testingCat.speak();

        // then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate() {
        // Given
        Date expected = new Date(1);

        // when
        testingCat.setBirthDate(new Date(1));

        // then
        Date actual = testingCat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        // Given
        Food food = new Food();

        // when
        int prevVal = testingCat.getNumberOfMealsEaten();
        testingCat.eat(food);
        int actual = testingCat.getNumberOfMealsEaten();

        // then
        int expected = prevVal+1;
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()'
    @Test
    public void testGetID() {
        // Given
        Integer expected = 1; // from the constructor

        // when
        Integer actual = testingCat.getId();

        // then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // if (objectReference instanceof type)
    @Test
    public void testAnimalInstance() {

        boolean actual = false;

        //java instanceof keyword
        //if (objectReference instanceof type)
        if( testingCat instanceof Animal) {
            actual = true;
        }

        // then
        Assert.assertTrue(actual);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInstance() {
        boolean actual = false;

        if(testingCat instanceof Mammal){
            actual = true;
        }

        Assert.assertTrue(actual);

    }


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
