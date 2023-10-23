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
    @Test
    public void testNewDog(){
     //Given
    String expectedName = "Fluffy";
    Date expectedBirthDate = new Date(05-05-2020);
    Integer expectedId = 456;

    //When Dog is constructed
        Dog dog = new Dog(expectedName, expectedBirthDate, expectedId);
     //When data from dog is retrieved
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        Integer actualId = dog.getId();
    //Then
       Assert.assertEquals(expectedName, actualName);
       Assert.assertEquals(expectedBirthDate, actualBirthDate);
       Assert.assertEquals(expectedId, actualId);

    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
      //Given
      Dog dog = new Dog("Fluffy", new Date(05-05-2020), 456);
        String expected = "bark!" ;
      //When
        String actual = dog.speak();

      //Then
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testBirthDate(){
     //Given
        Dog dog = new Dog("Fluffy", new Date(05-05-2020), 456);
        Date expectedDate = new Date(05-02-2019);
        dog.setBirthDate(expectedDate);
     //When
        Date actualDate = dog.getBirthDate();
     //Then
        Assert.assertEquals(expectedDate, actualDate);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
      //Given
        Dog dog = new Dog("Fluffy", new Date(05-05-2020), 456);
        Food food = new Food();
        dog.eat(food);
        Integer expected = 1;
      //When
         Integer actual = dog.getNumberOfMealsEaten();
      //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
     //Given
        Dog dog = new Dog("Fluffy", new Date(05-05-2020), 456);
        Integer expected = 456;
     //When
       Integer actual = dog.getId();

     //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testAnimalInheritance(){
      //Given
        Dog dog = new Dog("Fluffy", new Date(05-05-2020), 456);

      //Then
        Assert.assertTrue(dog instanceof  Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
    //Given
        Dog dog = new Dog("Fluffy", new Date(05-05-2020), 456);

    //Then
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
