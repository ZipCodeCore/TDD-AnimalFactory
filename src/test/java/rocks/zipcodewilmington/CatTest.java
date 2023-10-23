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

    @Test
    public void getNameTest(){
        //given
        Cat testCat = new Cat("Charlotte");
        String expected = "Charlotte";

        //when
        String actual  = testCat.getName();

        //then
        Assert.assertEquals(expected,actual);

    }


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
        //given
        String givenName = "Zulu";
//        Date givenBirthDate = new Date();
//        Integer givenId = 0;
        String expectedName = "Shaq";

        //when
        Cat test = new Cat(givenName);
        test.setName(expectedName);

        //then
        String actual = test.getName();
        Assert.assertEquals(expectedName,actual);

    }

    @Test
    public void setBirthDateTest(){
        //given
        String givenName = "Zulu";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Date expectedDate = new Date(21-1-2019);

        //when
        Cat test = new Cat(givenName, givenBirthDate, givenId);
        test.setBirthDate(expectedDate);

        //then
        Date actual = test.getBirthDate();
        Assert.assertEquals(expectedDate,actual);

    }

    @Test
    public void speakTest(){
        //given
        String givenName = "McStuffins";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expected = "meow!";


        //when
        Cat test = new Cat(givenName, givenBirthDate, givenId);
        String actual = test.speak();

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest(){
        //given
        String givenName = "McStuffins";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer expected = 1;
        Food testFood = new Food("Kitty Chow", 4, "chicken", true);


        //when
        Cat test = new Cat(givenName, givenBirthDate, givenId);
        test.eat(testFood);


        //then
        Integer actual = test.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest2(){
        //given
        String givenName = "McStuffins";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer expected = 2;
        Food testFood = new Food("Kitty Chow", 4, "chicken", true);
        Food testFood2 = new Food("Purina", 2, "tuna", false);

        //when
        Cat test = new Cat(givenName, givenBirthDate, givenId);
        test.eat(testFood);
        test.eat(testFood2);


        //then
        Integer actual = test.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIdTest(){
        //given
        String givenName = "McStuffins";
        Date givenBirthDate = new Date();
        Integer givenId = 2;
        Integer expected = 2;

        //when
        Cat test = new Cat(givenName, givenBirthDate, givenId);
        Integer actual = test.getId();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Mammal cat = new Cat("Sniffles");
        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void testAnimalInheritance(){
        Animal cat = new Cat("Pegasus");
        Assert.assertTrue(cat instanceof Animal);
    }
}
