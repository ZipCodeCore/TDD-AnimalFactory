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
    // Done TODO - Create tests for `void setName(String name)`
    // Done TODO - Create tests for `speak`
    // Done TODO - Create tests for `setBirthDate(Date birthDate)`
    // Done TODO - Create tests for `void eat(Food food)`
    // Done TODO - Create tests for `Integer getId()`
    // Done TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // Done TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void checkInheritance2(){
        //Given
        Cat cat = new Cat(null, null, null);

        //Then
        Assert.assertTrue(cat instanceof Mammal);

    }

    @Test
    public void checkInheritance(){
        //Given
        Cat cat = new Cat(null, null, null);

        //Then
        Assert.assertTrue(cat instanceof Animal);

    }

    @Test
    public void getId(){
        //Given
        Cat cat = new Cat(null, null, 5);
        Integer expected = 5;

        //When
        cat.getId();

        //Then
        Integer actual = cat.getId();
        Assert.assertEquals(expected, actual);

    }



    @Test
    public void setBirthDate(){

        //Given
        Date expected = new Date();
        Cat cat = new Cat(null, expected , null);


        //When
        cat.setBirthDate(expected);


        //Then
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);


    }

    @Test
    public void eat(){
        //Given
        Cat cat = new Cat(null, null , null);

        //When
       cat.eat(new Food());

        //Then
        Integer expected = 1;
        Integer actual = cat.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void speak(){

        // Given
        Cat cat = new Cat(null, null, null);
        String expected = "meow!";

        // When
        cat.speak();

        // Then
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void setName(){

        //Given
        Cat cat = new Cat("Momo" , null, null);
        String expected = "Momo";


        //When
        cat.setName(expected);
        String actual = cat.getName();

        //Then
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
