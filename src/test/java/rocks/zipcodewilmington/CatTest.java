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
    public void setNameTest(){
        //given ( we have a cat who exist and we have a name who exist)
        Cat cat = new Cat("Kitty",null,null);
        String expected = "Kitty";
        //when
        String actual = cat.getName();
        //then
        Assert.assertEquals(actual,expected);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
    //given ( that we have a cat who exist and a speak which exist)
        Cat cat = new Cat(null,null,null);
        String expected = "meow!";
    //when ( a dog is set to speak )
        String actual = cat.speak();
    //then ( the expected and actual speak should match)
        Assert.assertEquals(actual,expected);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        //given (we have a cat who exist and a date who exist)
        Cat cat = new Cat(null,new Date(12345),null);
        Date expected = new Date(12345);
        //when ( the cat date is set)
        Date actual = cat.getBirthDate();
        //then ( the expected and the actual should match)
        Assert.assertEquals(actual,expected);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Cat cat = new Cat(null, null, null);
        int givenMeals = cat.getNumberOfMealsEaten();
        cat.eat(new Food());
        int expectedMeals = cat.getNumberOfMealsEaten();

        Assert.assertEquals(givenMeals + 1, expectedMeals);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        //given (We have a cat who exist and a ID who exists)

        //when the cat retrieves there ID

        //then we expect that given ID is matching the actual
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfAnimal(){
        boolean expected = true;
        Cat cat = new Cat(null,null,null);
        boolean actual = cat instanceof Animal;
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfMammalTest(){
        boolean expected = true;
        Cat cat = new Cat(null,null,null);
        boolean actual = cat instanceof Mammal;
        Assert.assertEquals(expected, actual);

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
