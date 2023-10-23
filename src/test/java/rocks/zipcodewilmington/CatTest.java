package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName() {
        //given
        String expectedName = "Ony";
        //when
        Cat newCat = new Cat(expectedName);
        String actual = newCat.getName();
        //then
        Assert.assertEquals(expectedName, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak() {
        //given
        String expectedSpeak = "meow!";
        //when
        Cat newCat = new Cat(expectedSpeak);
        String actual = newCat.speak();
        //then
        Assert.assertEquals(expectedSpeak, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        //given
        Date expectedBirthDate = new Date(2019-03-15);
        //when
        Cat newCat = new Cat(expectedBirthDate);
        Date actual = newCat.getBirthDate();
        //then
        Assert.assertEquals(expectedBirthDate, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat() {
        //given
        Integer expectedValue = 1;
        Date givenBirthDate = new Date(2020-01-22);
        Cat newCat = new Cat("Tipsy", givenBirthDate, 5);
        //when
        Food newFood = new Food("Blue Buffalo", "tuna", false);
        newCat.eat(newFood);
        //then
        Integer actualValue = newCat.getNumberOfMealsEaten();
        Assert.assertEquals(expectedValue, actualValue);

    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId() {
        //given
        Integer expectedValue = 4;
        Date givenBirthDate = new Date(2018-07-04);
        Cat newCat = new Cat("Felix", givenBirthDate, 4);
        //when
        Integer actualValue = newCat.getId();
        //then
        Assert.assertEquals(expectedValue, actualValue);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance() {
        Cat newCat = new Cat("Frederick-Sama", null, null);
        Assert.assertTrue(newCat instanceof Animal);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance() {
        Cat newCat = new Cat("Binks", null, null);
        Assert.assertTrue(newCat instanceof Mammal);
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
