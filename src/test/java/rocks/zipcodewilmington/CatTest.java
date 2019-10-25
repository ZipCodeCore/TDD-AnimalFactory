package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.Animal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`



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

    @Test
    public void setNameTest(){
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat phelix = new Cat("", givenBirthDate, 0);

        // given
        String givenName = "Phelix";

        // when
        String expected = givenName;
        phelix.setName("Phelix");
        String actual = phelix.getName();

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void speakTest(){
        String givenName = "Phelix";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat phelix = new Cat("", givenBirthDate, 0);

        // given
        String expected = "meow!";

        // when
        String actual = phelix.speak();

        // then
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void setBirthDateTest(){
        String givenName = "Phelix";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat phelix = new Cat("", givenBirthDate, 0);
        // given
        Date expected = new Date();

        // when
        phelix.setBirthDate(expected);

        // then
        Date actual = phelix.getBirthDate();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void eatTest(){
        String givenName = "Phelix";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat phelix = new Cat("", givenBirthDate, 0);
        // given
        Food food = new Food();
        int actual = phelix.getNumberOfMealsEaten();
        int expected = actual + 1;


        // when
        phelix.eat(food);
        actual = phelix.getNumberOfMealsEaten();

        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void implementAnimalTest() {
        String givenName = "Phelix";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat phelix = new Cat(givenName, givenBirthDate, givenId);

        // then
        Assert.assertTrue(phelix instanceof Animal);
    }

    @Test
    public void implementMammalTest() {
        String givenName = "Phelix";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat phelix = new Cat(givenName, givenBirthDate, givenId);

        // then
        Assert.assertTrue(phelix instanceof Mammal);
    }



}
