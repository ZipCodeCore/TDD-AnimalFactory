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
    private Cat cat;

    @Before
    public void setup() {
        this.cat = new Cat();
    }

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest() {
        // given
        String expected = "Nighty";

        // when
        cat.setName(expected);

        // then
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        // Given
        String expected = "meow!";

        // when
        String actual = cat.speak();

        // then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        // given
        Date expected = new Date();

        // when
        cat.setBirthDate(expected);

        // then
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        // given
        Food food = new Food();
        int initialMealsEaten = cat.getNumberOfMealsEaten();
        int expected = initialMealsEaten + 1;


        // when
        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();

        // then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void implementTest() {
        // given
        Cat cat = new Cat();

        // when
        boolean outcome = cat instanceof Animal;

        // then
        Assert.assertTrue(outcome);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void inheritanceTest() {
        // given
        Cat cat = new Cat();

        // when
        boolean outcome = cat instanceof Mammal;

        // then
        Assert.assertTrue(outcome);
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
