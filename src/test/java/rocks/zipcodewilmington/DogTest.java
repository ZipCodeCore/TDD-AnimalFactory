package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void testDogConstructor3Parameters(){
        //given
        String givenName = "Harrison";
        Date givenDate = new Date();
        int givenId = 1;
        //when
        Dog dog = new Dog (givenName,givenDate,givenId);
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        int actualId = dog.getId();
        //then
        Assert.assertEquals(givenName,actualName);
        Assert.assertEquals(givenDate,actualDate);
        Assert.assertEquals(givenId,actualId);
    }
    @Test
    public void testDogConstructor3Parameters2(){
        //given
        String givenName = "Arrison";
        Date givenDate = new Date(1, Calendar.JUNE,6);
        int givenId = 2;
        //when
        Dog dog = new Dog (givenName,givenDate,givenId);
        String actualName = dog.getName();
        Date actualDate = dog.getBirthDate();
        int actualId = dog.getId();
        //then
        Assert.assertEquals(givenName,actualName);
        Assert.assertEquals(givenDate,actualDate);
        Assert.assertEquals(givenId,actualId);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //given
        Dog dog = new Dog ("Maryanne",new Date(),2);
        String givenSound = "bark!";
        //when
        String actualSound = dog.speak();
        //then
        Assert.assertEquals(givenSound,actualSound);

    }
    @Test
    public void testSpeak2(){
        //given
        Dog dog = new Dog ("Aryanne",new Date(1, Calendar.APRIL,2),5);
        String givenSound = "bark!";
        //when
        String actualSound = dog.speak();
        //then
        Assert.assertEquals(givenSound,actualSound);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        //given
        Dog dog = new Dog ("Angelina",new Date(),2);
        Date givenDate = new Date(2008, Calendar.JUNE,10);
        //when
        dog.setBirthDate(givenDate);
        Date actualDate = dog.getBirthDate();
        //then
        Assert.assertEquals(givenDate,actualDate);

    }
    @Test
    public void testSetBirthDate2(){
        //given
        Dog dog = new Dog ("Ngelina",new Date(2, Calendar.APRIL,4),2);
        Date givenDate = new Date(2012, Calendar.DECEMBER,1);
        //when
        dog.setBirthDate(givenDate);
        Date actualDate = dog.getBirthDate();
        //then
        Assert.assertEquals(givenDate,actualDate);

    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //given
        Dog dog = new Dog ("Bartholomew",new Date(),2);
        int expected = 1;
        //when
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testEat2(){
        //given
        Dog dog = new Dog ("Artholomew",new Date(2, Calendar.APRIL,6),8);
        int expected = 2;
        //when
        dog.eat(new Food());
        dog.eat(new Food());
        int actual = dog.getNumberOfMealsEaten();
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        //given
        Dog dog = new Dog ("Magdalene",new Date(),5);
        int expected = 5;
        //when
        int actual = dog.getId();
        //then
        Assert.assertEquals(expected,actual);

    }
    public void testGetId2(){
        //given
        Dog dog = new Dog ("Agdalene",new Date(2, Calendar.APRIL,5),99);
        int expected = 99;
        //when
        int actual = dog.getId();
        //then
        Assert.assertEquals(expected,actual);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
        //given //when
        Dog dog = new Dog ("Mercurio",new Date(),5);
        //then
        Assert.assertTrue(dog instanceof Animal);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        //given //when
        Dog dog = new Dog ("Alexandria",new Date(),5);
        //then
        Assert.assertTrue(dog instanceof Mammal);
    }
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
