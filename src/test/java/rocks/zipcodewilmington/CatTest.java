package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void setNameTest1() {
        Cat cat = new Cat(null, null, null);
        cat.setName("Kitty");
        String actual = cat.getName();
        String expected = "Kitty";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest2() {
        Cat cat = new Cat(null, null, null);
        cat.setName("Brad");
        String actual = cat.getName();
        String expected = "Brad";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setNameTest3() {
        Cat cat = new Cat("John", null, null);
        cat.setName("Larry");
        String actual = cat.getName();
        String expected = "Larry";
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest1() {
        Cat cat = new Cat("Mark", null, null);
        String actual = cat.speak();
        String expected = "meow!";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest2() {
        Cat cat = new Cat("Fluffy", null, null);
        String actual = cat.speak();
        String expected = "meow!";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void speakTest3() {
        Cat cat = new Cat(null, null, null);
        String actual = cat.speak();
        String expected = "meow!";
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest1() {
        Cat cat = new Cat(null, null, null);
        Date birthdate = new Date(0);
        cat.setBirthDate(birthdate);
        Date actual = cat.getBirthDate();
        Date expected = birthdate;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBirthDateTest2() {
        Cat cat = new Cat(null, null, null);
        Date birthdate = new Date(1997,8,5);
        cat.setBirthDate(birthdate);
        Date actual = cat.getBirthDate();
        Date expected = birthdate;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void setBirthDateTest3() {
        Cat cat = new Cat(null, null, null);
        Date birthdate = new Date(2015, 2, 3);
        cat.setBirthDate(birthdate);
        Date actual = cat.getBirthDate();
        Date expected = birthdate;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest1() {
        Cat cat = new Cat(null, null, null);
        cat.eat(new Food());
        int actual = cat.getNumberOfMealsEaten();
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest2() {
        Cat cat = new Cat(null, null, null);
        for (int i = 0; i < 10; i++) {
            cat.eat(new Food());
        }
        int actual = cat.getNumberOfMealsEaten();
        int expected = 10;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void eatTest3() {
        Cat cat = new Cat(null, null, null);
        for (int i = 0; i < 100; i++) {
            cat.eat(new Food());
        }
        int actual = cat.getNumberOfMealsEaten();
        int expected = 100;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest1() {
        Cat cat = new Cat(null,null,14);
        int actual = cat.getId();
        int expected = 14;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getIdTest2() {
        Cat cat = new Cat(null,null,134);
        int actual = cat.getId();
        int expected = 134;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getIdTest3() {
        Cat cat = new Cat(null,null,45658);
        int actual = cat.getId();
        int expected = 45658;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void checkAnimalInheritanceTest() {
        Cat cat = new Cat(null,null,null);
        boolean result = cat instanceof Animal;
        Assert.assertTrue(result);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void checkMammalInheritanceTest() {
        Cat cat = new Cat(null,null,null);
        boolean result = cat instanceof Mammal;
        Assert.assertTrue(result);
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
