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

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void checkMammalInheritance(){
        Cat cat = new Cat("Joe", new Date(), 7);

        Boolean actual = cat instanceof Mammal;

        Boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void checkAnimalInheritance(){
        Cat cat = new Cat("Vivian", new Date(), 6);

        Boolean actual = cat instanceof Animal;

        Boolean expected = true;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getIdTest(){
        Cat cat = new Cat("Borscht", new Date(), 5);

        int expected = 5;
        int actual = cat.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest(){
        Cat cat = new Cat("Sadie", new Date(), 4);
        Food food = new Food("Spaghetti", true);

        cat.eat(food);
        int actual = cat.getNumberOfMealsEaten();
        int expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void speakTest(){
        Cat cat = new Cat("Marvin", new Date(), 3);

        String actual = cat.speak();
        String expected = "meow";

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void setBirthDate(){
        Cat cat = new Cat("Johnny", new Date(), 1);

        Date expected = new GregorianCalendar(2011, Calendar.MARCH, 11).getTime();

        cat.setBirthDate(expected);

        Date actual = cat.getBirthDate();

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setNameTest(){
        Cat cat = new Cat("Tess", new Date(), 2);

        cat.setName("Beff");

        String actual = cat.getName();
        String expected = "Beff";

        Assert.assertEquals(actual, expected);
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
