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
    } // end of constructorTest

    // TODO - Create tests for `void setName(String name)`

    @Test
    public void setNameTest() {
        //Given
        String givenName = "Zula";
        String expectedName = "Binx";

        //When
        Cat catTest = new Cat(givenName);
        catTest.setName(expectedName);

        //Then
        String actualName = catTest.getName();
        Assert.assertEquals(expectedName, actualName);

    } // end of setNameTest

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date ();
        Integer givenId = 0;
        String expectedSpeak = "meow!";

        //When
        Cat catTest = new Cat(givenName, givenBirthDate, givenId);
        String actualSpeak = catTest.speak();

        //Then
        Assert.assertEquals(expectedSpeak, actualSpeak);

    } // end of speakTest

    // TODO - Create tests for `setBirthDate(Date birthDate)`

    @Test
    public void setBirthDateTest() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date ();
        Date expectedDate = new Date(27-0-1992);
        Integer givenId = 0;

        //When
        Cat catTest = new Cat(givenName, givenBirthDate,givenId);
        catTest.setBirthDate(expectedDate);

        //Then
        Date actualBirthDate = catTest.getBirthDate();
        Assert.assertEquals(expectedDate, actualBirthDate);
    } //end of birthdate test

    // TODO - Create tests for `void eat(Food food)`

    @Test
    public void eatTest () {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date ();
        Integer givenId = 0;
        Integer expected = 1;
        Food food = new Food ();

        //When
        Cat catTest = new Cat(givenName, givenBirthDate, givenId);
        catTest.eat(food);

        //Then
        Integer actual = catTest.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`

    @Test
    public void getIdTest() {
        //Given
        String givenName = "Zula";
        Date givenBirthDate = new Date ();
        Integer expected = 7;

        //When
        Cat catTest = new Cat(givenName, givenBirthDate, 7);
        Integer actual = catTest.getId();

        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void animalInheritanceTest() {
        Animal cat = new Cat ("Salem");
        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void mammalInheritanceTest() {
        Mammal cat = new Cat ("Fluffy");
        Assert.assertTrue(cat instanceof Mammal);
    }








} //final brace
