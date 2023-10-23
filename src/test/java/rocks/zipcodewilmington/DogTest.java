package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
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
    public void constructorTest(){
        //given
        String name = "Orenthal";
        Date givenBirthDate = new Date();
        Integer id = 0;

        //when
        Dog testDog = new Dog(name, givenBirthDate, id);
        String retrievedName = testDog.getName();
        Date retrievedBirthDate = testDog.getBirthDate();
        Integer retrievedId = testDog.getId();

        //then
        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(id, retrievedId);

    }

    @Test
    public void setBirthDateTest(){
        //given
        String givenName = "Zulu";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Date expectedDate = new Date(21-1-2019);

        //when
        Dog test = new Dog(givenName, givenBirthDate, givenId);
        test.setBirthDate(expectedDate);

        //then
        Date actual = test.getBirthDate();
        Assert.assertEquals(expectedDate,actual);

    }

    @Test
    public void speakTest(){
        //given
        String givenName = "Bromley";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        String expected = "bark!";


        //when
        Dog test = new Dog(givenName, givenBirthDate, givenId);
        String actual = test.speak();

        //then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void eatTest(){
        //given
        String givenName = "Mojo Jojo";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Integer expected = 1;
        Food testFood = new Food("Puppy Chow", 6, "beef", true);


        //when
        Dog test = new Dog(givenName, givenBirthDate, givenId);
        test.eat(testFood);


        //then
        Integer actual = test.getNumberOfMealsEaten();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getIdTest(){
        //given
        String givenName = "Juice";
        Date givenBirthDate = new Date();
        Integer givenId = 2;
        Integer expected = 2;

        //when
        Dog test = new Dog(givenName, givenBirthDate, givenId);
        Integer actual = test.getId();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testInheritance() {
        Mammal dog = new Dog("Snickers", null, null);
        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void testAnimalInheritance(){
        Animal dog = new Dog("Hercules", null, null);
        Assert.assertTrue(dog instanceof Animal);
    }
}
