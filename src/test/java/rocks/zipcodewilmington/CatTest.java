package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
    public void getNameTest(){
        //given
        String name = "";
        Date birthDate = new Date();
        Integer id = 1;

        //when
        Cat cat = new Cat(name,new Date(), id);
        cat.setName("Ricky");
        String expectedName = cat.getName();
        String actual = "Ricky";

        //then
        Assert.assertEquals(expectedName,actual);
    }
    @Test
    public void speakTest(){
        //given
        Cat cat = new Cat("Jim",new Date(), 2);
        String actual = "meow!";

        //when
        String expected = cat.speak();

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setBirthDate(){
        //given
        Cat cat = new Cat("Bob", new Date(), 3);
        Date expectedDate = new Date();
        //when
        cat.setBirthDate(expectedDate);
        Date actualDate = cat.getBirthDate();

        //then
        Assert.assertEquals(expectedDate, actualDate);
    }
    @Test
    public void eatFoodTest(){
        //given
        Cat cat = new Cat("Jimbob", new Date(), 4);
        Food chicken = new Food();
        Food fish = new Food();


        //when
        cat.eat(chicken);
        cat.eat(fish);
        Integer numberOfTimesEaten = 2;

        //then
        Assert.assertEquals(numberOfTimesEaten, cat.getNumberOfMealsEaten());
    }
    @Test
    public void getIdTest(){
        //given
        Cat cat = new Cat("Bobjim", new Date(), 5);


        //when
        Integer expected = cat.getId();
        Integer actual = 5;

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void checkAnimalInheritanceTest(){
       //given
        Cat cat = new Cat("Jimmy", new Date(), 6);

        //then
        Assert.assertTrue(cat instanceof Animal);
    }
    @Test
    public void checkMammalInheritanceTest(){
        //given
        Cat cat = new Cat("I ran out of names", new Date(), 7);

        //then
        Assert.assertTrue(cat instanceof Mammal);
    }
}
