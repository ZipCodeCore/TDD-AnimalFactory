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
        //Given
        String expectedName = "Loki";
        Date expectedDate = new Date();
        int expectedId = 1;
        Cat newCat = new Cat(expectedName, expectedDate, expectedId);
        //When
        newCat.setName(expectedName);
        String actualName = newCat.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        //Given
        String expectedName = "Loki";
        Date expectedDate = new Date();
        int expectedId = 1;
        Cat newCat = new Cat(expectedName, expectedDate, expectedId);
        String expectedSpeak = "meow!";
        //When
        String actualSpeak = newCat.speak();
        //Then
        Assert.assertEquals(actualSpeak,expectedSpeak);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest(){
        //Given
        String expectedName = "Loki";
        Date expectedDate = new Date();
        int expectedId = 1;
        Cat newCat = new Cat(expectedName, expectedDate, expectedId);
        Date newBirthday = new Date();
        //When
        newCat.setBirthDate(newBirthday);
        //Then
        Assert.assertEquals(newCat.getBirthDate(), newBirthday);

    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        //Given
        String expectedName = "Loki";
        Date expectedDate = new Date();
        int expectedId = 1;
        Cat newCat = new Cat(expectedName, expectedDate, expectedId);
        //When
        Food tuna = new Food();
        Food salmon = new Food();
        newCat.eat(tuna);
        newCat.eat(salmon);
        Food actualFoodEaten = newCat.getLastMealEaten();
        //Then
        Assert.assertEquals(salmon, actualFoodEaten);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        //Given
        String givenName = "Loki";
        Date givenDate = new Date();
        int givenId = 0;
        Cat cat = new Cat(givenName, givenDate, givenId);
        //When
        int retrievedId = cat.getId();
        //Then
        Assert.assertEquals(givenId, retrievedId);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritanceTest() {
        //Given
        String givenName = "Loki";
        Date givenDate = new Date();
        int givenId = 0;
        //When
        Cat cat = new Cat(givenName, givenDate, givenId);
        //Then
        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritanceTest() {
        //Given
        String givenName = "Loki";
        Date givenDate = new Date();
        int givenId = 0;
        //When
        Cat cat = new Cat(givenName, givenDate, givenId);
        //Then
        Assert.assertTrue(cat instanceof Mammal);
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
