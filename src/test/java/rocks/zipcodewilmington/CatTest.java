package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName(){
        //given
        Cat originalCat = AnimalFactory.createCat("Benjamin",new Date(2017, Calendar.OCTOBER,4));
        String expectedName = "Jonathon";
        //when
        originalCat.setName("Jonathon");
        String actualName = originalCat.getName();
        //then
        Assert.assertEquals(expectedName, actualName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //given
        Cat originalCat = AnimalFactory.createCat("Jeremiah",new Date(2016, Calendar.JUNE,2));
        String expectedSound = "meow!";
        //when
        String actualSound = originalCat.speak();
        //then
        Assert.assertEquals(expectedSound, actualSound);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        //given
        Cat originalCat = AnimalFactory.createCat("Penelope",new Date(2009, Calendar.FEBRUARY,3));
        Date expected = new Date(1919, 8,14);
        //when
        originalCat.setBirthDate(expected);
        Date actual = originalCat.getBirthDate();
        //then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //given
        Cat originalCat = AnimalFactory.createCat("Olivia",new Date(2005, Calendar.AUGUST,3));
        int expected = 1;
        //when
        originalCat.eat(new Food());
        //then
        int actual = originalCat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        //given
        Cat originalCat = new Cat("Angela",new Date(1945, Calendar.AUGUST,3),3);
        int expected = 3;
        //when
        int actual = originalCat.getId();
        //then
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        //given //when
        Cat originalCat = new Cat("Jameson",new Date(1975, Calendar.AUGUST,3),3);
        //then
        Assert.assertTrue(originalCat instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        //given //when
        Cat originalCat = new Cat("Angelo",new Date(1975, Calendar.AUGUST,3),3);
        //then
        Assert.assertTrue(originalCat instanceof Mammal);
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
