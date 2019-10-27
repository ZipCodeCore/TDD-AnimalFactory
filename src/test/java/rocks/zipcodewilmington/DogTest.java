package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
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
    @Test
    public void setBirthDateTest(){
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog=new Dog(givenName, givenBirthDate, givenId);
        dog.setBirthDate(givenBirthDate);
        Date actualDate = dog.getBirthDate();
        Assert.assertEquals(actualDate, givenBirthDate);

    }
    @Test
    public void speakTest(){
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog =new Dog(givenName, givenBirthDate, givenId);
        String expectedSpeak="bark!";
        String actualSpeak=dog.speak();
        Assert.assertEquals(actualSpeak, expectedSpeak);
    }
    @Test
    public void eatTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Food pedigree=new Food();
        Integer expected=1;
        dog.eat(pedigree);
        Integer actual=dog.getNumberOfMealsEaten();
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void idTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer expected = 12;
        Dog dog = new Dog(givenName, givenBirthDate, expected);
        Integer actual=dog.getId();
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void animalInstanceTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Boolean expected=true;
        Boolean actual=dog instanceof Animal;
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void mammalInstanceTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        Boolean expected=true;
        Boolean actual=dog instanceof Mammal;
        Assert.assertEquals(actual, expected);
    }

}
