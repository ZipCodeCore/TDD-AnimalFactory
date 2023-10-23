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
    public void setNameTest() {
        //given
        String catName = "Zula";
        Date birthDay = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(catName, birthDay, 0);

        //when
        cat.setName(catName);


        //then
        catName = cat.getName();
        Assert.assertEquals("Zula", catName);


    }


    @Test
    public void speakTest() {
        String catName = "Zula";
        Date birthDay = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(catName,birthDay,0);

        //when
        String catSpeak = cat.speak();

        //then

        Assert.assertEquals("meow!", catSpeak);

    }

    @Test
    public void setBirthDate(){
        //given
        String catName = "Zula";
        Date birthDay = new Date(1993, 8, 2);
        Integer givenId = 0;
        Cat cat = new Cat(catName,birthDay,0);


        //when
        cat.setBirthDate(birthDay);

        //then
        Assert.assertEquals(birthDay, birthDay);

    }

    @Test
    public void eatTest(){
        //given
        String catName = "Zula";
        Date birthDay = new Date();
        Integer givenId = 0;
        Food actualFood = new Food();
        Cat cat = new Cat(catName,birthDay,0);

        //when
        cat.eat(actualFood);
        int mealsEaten = cat.getNumberOfMealsEaten();

        //then
        Assert.assertEquals(1, mealsEaten);

    }

    @Test
    public void getIdTest() {
        //given
        String catName = "Zula";
        Date birthDay = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(catName,birthDay,0);

        //when
        int id = cat.getId();

        //then
        Assert.assertEquals(givenId, cat.getId());
    }

    @Test
    public void animalInheritanceTest() {
        //given
        String catName = "Zula";
        Date birthDay = new Date();
        Integer givenId = 0;


        //when
        Cat cat = new Cat(catName,birthDay,0);

        //then
        Assert.assertTrue(cat instanceof Animal);
    }

    @Test
    public void mammalInheritanceTest() {
        //given
        String catName = "Zula";
        Date birthDay = new Date();
        Integer givenId = 0;


        //when
        Cat cat = new Cat(catName,birthDay,0);

        //then
        Assert.assertTrue(cat instanceof Mammal);
    }

}
