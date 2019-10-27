package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.SimpleDateFormat;
import java.util.Calendar;
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
   public void setNameTest(){
       String givenName = "";
       Date givenBirthDate = new Date();
       Integer givenId = 0;
        Cat cat=new Cat(givenName, givenBirthDate, givenId);
        String expectedName = "Tommy";
        cat.setName(expectedName);
        String actualName = cat.getName();
        Assert.assertEquals(actualName , expectedName);
   }

   @Test
   public void setBirthDateTest(){
        String givenName = "";
       Date givenBirthDate = new Date();
       Integer givenId = 0;
       Cat cat =new Cat(givenName, givenBirthDate, givenId);
       cat.setBirthDate(givenBirthDate);
       Date actualDate = cat.getBirthDate();
       Assert.assertEquals(actualDate, givenBirthDate);

   }
   @Test
    public void speakTest(){
       String givenName = "";
       Date givenBirthDate = new Date();
       Integer givenId = 0;
       Cat cat =new Cat(givenName, givenBirthDate, givenId);
       String expectedSpeak="meow!";
       String actualSpeak=cat.speak();
       Assert.assertEquals(actualSpeak, expectedSpeak);
   }
    @Test
    public void eatTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Food pedigree=new Food();
        Integer expected=1;
        cat.eat(pedigree);
        Integer actual=cat.getNumberOfMealsEaten();
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void idTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer expected = 12;
        Cat cat = new Cat(givenName, givenBirthDate, expected);
        Integer actual=cat.getId();
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void animalInstanceTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Boolean expected=true;
        Boolean actual=cat instanceof Animal;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void mammalInstanceTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        Boolean expected=true;
        Boolean actual=cat instanceof Mammal;
        Assert.assertEquals(actual, expected);
    }

}
