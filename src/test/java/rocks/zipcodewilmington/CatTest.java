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
    public void setNameTest() {
        Cat cat = new Cat(null, null, null);
        String expected = "dude";
        cat.setName(expected);
        Assert.assertEquals(expected, cat.getName());

    }

    @Test
    public void setBirthDateTest() {
        Cat cat = new Cat(null, null, null);
        Date expected = new Date();
        cat.setBirthDate(expected);
        Assert.assertEquals(expected, cat.getBirthDate());
    }

    @Test
    public void speakTest() {
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";
        Assert.assertEquals(expected, cat.speak());
    }

    @Test
    public void eatTest() {

        //given data
        Cat cat = new Cat(null, null, null);
        //cat.getNumberOfMealsEaten();

        //when
        Integer expected = cat.getNumberOfMealsEaten()+1;

        //action
        cat.eat(new Food());

        Assert.assertEquals(expected, cat.getNumberOfMealsEaten());
    }

    @Test
    public void getIDTest(){
        Integer expected = 25;
        Cat cat = new Cat(null, null, expected);

        Assert.assertEquals(expected, cat.getId());
    }
    @Test
    public void isAMammalTest(){
        Cat cat = new Cat(null, null, null);
        Boolean expected = true;
        Assert.assertEquals(cat instanceof Mammal, expected);
    }
    @Test
    public void isAnAnimalTest(){
        Cat cat = new Cat(null, null, null);
        Boolean expected = true;
        Assert.assertEquals(cat instanceof Animal, expected);

    }
}
