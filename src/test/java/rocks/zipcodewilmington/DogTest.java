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
    public void getNameTest(){
        //given
        String name = "";
        Date birthDate = new Date();
        Integer id = 1;

        //when
        Dog dog = new Dog("Dogname", new Date(), 1);
        dog.setName("Ricky");
        String expectedName = dog.getName();
        String actual = "Ricky";

        //then
        Assert.assertEquals(expectedName,actual);
    }
    @Test
    public void speakTest(){
        //given
        Dog dog = new Dog("Jim", new Date(), 2);
        String actual = "bark!";

        //when
        String expected = dog.speak();

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void setBirthDate(){
        //given
        Dog dog = new Dog("Bob", new Date(),3);
        Date expectedDate = new Date();
        //when
        dog.setBirthDate(expectedDate);
        Date actualDate = dog.getBirthDate();

        //then
        Assert.assertEquals(expectedDate, actualDate);
    }
    @Test
    public void eatFoodTest(){
        //given
        Dog dog = new Dog("Bob", new Date(),5);
        Food chicken = new Food();
        Food fish = new Food();


        //when
        dog.eat(chicken);
        dog.eat(fish);
        Integer numberOfTimesEaten = 2;

        //then
        Assert.assertEquals(numberOfTimesEaten, dog.getNumberOfMealsEaten());
    }
    @Test
    public void getIdTest(){
        //given
        Dog dog = new Dog("Bob", new Date(),6);


        //when
        Integer expected = dog.getId();
        Integer actual = 6;

        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void checkAnimalInheritanceTest(){
        //given
        Dog dog = new Dog("Bob", new Date(),7);

        //then
        Assert.assertTrue(dog instanceof Animal);
    }
    @Test
    public void checkMammalInheritanceTest(){
        //given
        Dog dog = new Dog("Bob", new Date(),8);

        //then
        Assert.assertTrue(dog instanceof Mammal);
    }
}
