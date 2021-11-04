package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.beans.Transient;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName(){
     //Given
     Cat cat = new Cat("Milo",new Date(), 123);
     String expectedName = "JR";
     cat.setName(expectedName);
    //When
        String actual = cat.getName();
     //Then
        Assert.assertEquals(expectedName, actual);

    }
    // TODO - Create tests for `speak`
   @Test
   public void testSpeak(){
    //Given
       Cat cat = new Cat("Milo",new Date(), 123);
       String expected = "meow!";
     //When
     String actual = cat.speak();
     //Then
       Assert.assertEquals(expected, actual);

   }


    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        //Given
        Cat cat = new Cat("Milo",new Date(), 123);
        Date expected = new Date(10-25-2021);
        cat.setBirthDate(expected);
        //When
        Date actual = cat.getBirthDate();
        //Then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
     //Given
        Cat cat = new Cat("Milo",new Date(), 123);
        Food food = new Food();
        cat.eat(food);
        Integer expected = 1;

     //When
        Integer actual = cat.getNumberOfMealsEaten();

     //Then
     Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
     //Given
        Cat cat = new Cat("Milo",new Date(), 123);
        Integer expected = 123;
     //When
        Integer actual = cat.getId();
     //Then
      Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        //Given
        Cat cat = new Cat("Milo",new Date(), 123);

        //Then
        Assert.assertTrue(cat instanceof Animal);


    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        //Given
        Cat cat = new Cat("Milo",new Date(), 123);

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
