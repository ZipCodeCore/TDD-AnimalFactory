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
    public void setNameTest(){
        String givenName = "Taco";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate,givenId);
        cat.setName(givenName);
        String expected = cat.getName();

        Assert.assertEquals(givenName,expected);
    }

    @Test
    public void setBirthDateTest(){
            String givenName = "Taco";
            Date givenBirthDate = new Date();
            Integer givenId = 0;

            Cat cat = new Cat(givenName, givenBirthDate,givenId);
             Date retrivedBirthDate = cat.getBirthDate();

            Assert.assertEquals(givenBirthDate,retrivedBirthDate);
    }
    @Test
    public void speakTest(){
            String givenName = "Taco";
            Date givenBirthDate = new Date();
            Integer givenId = 0;

            Cat cat = new Cat(givenName, givenBirthDate,givenId);
            String expected = "meow!";
            String actual = cat.speak();
            Assert.assertEquals(expected,actual);
    }
    @Test
    public void eatTest() {
        String givenName = "Taco";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        int expected = cat.getNumberOfMealsEaten() ;
        cat.eat(new Food());
        int actual = cat.getNumberOfMealsEaten()    ;
        Assert.assertEquals(expected + 1, actual );
    }
    @Test
    public void getIdTest() {
        String givenName = "Taco";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Integer retrieveId = cat.getId();
        Assert.assertEquals(givenId, retrieveId);
    }

}
