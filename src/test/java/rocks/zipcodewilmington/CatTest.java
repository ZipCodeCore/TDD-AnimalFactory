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
    public void nameTest(){
        String expectedName = "Milo";
        Cat cat = new Cat("Frank", new Date(), 20);
        cat.setName(expectedName);
        String actualName = cat.getName();
        Assert.assertEquals(expectedName, actualName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        String expectSpeak = "meow!";
        Cat cat = new Cat("", new Date(), 10);
        Assert.assertEquals(expectSpeak, cat.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void birthDateTest(){
        Date expectedDay = new Date();
        Cat cat = new Cat("", null, 1);
        cat.setBirthDate(expectedDay);
        Assert.assertEquals(expectedDay, cat.getBirthDate());
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){
        Integer expectEat = 1;
        Cat cat = new Cat("", null, 24);
        cat.eat(new Food());
        Assert.assertEquals(expectEat, cat.getNumberOfMealsEaten());
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest(){
        Integer expectedId = 80;
        Cat cat = new Cat("", null, expectedId);
        Integer actualId = cat.getId();
        Assert.assertEquals(expectedId, actualId);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalInheritance(){
        Cat cat = new Cat("", null, 35);
        Assert.assertTrue(cat instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalInheritance(){
        Cat cat = new Cat("", null, 99);
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
