package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    @Before
    public void setUp(){

    }
    @After
    public void tearDown(){
        DogHouse.clear();
    }
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
    @Test
    public void getDogByIdTest() {
        String givenName = "sunshine";
        Date givenBirthDate = new Date();
        Integer givenId = 10;
        Dog actualDog = new Dog (givenName, givenBirthDate, givenId);
        DogHouse.add(actualDog);
        Dog expectedDog = DogHouse.getDogById(10);
        Assert.assertEquals(expectedDog , actualDog);
    }

    @Test
    public void getNumberOfDogsTest() {


        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Dog actualDog = new Dog(givenName, givenBirthDate, givenId);
        Integer actualDogs= 1;
        DogHouse.add(actualDog);

        Integer expectedDogs = DogHouse.getNumberOfDogs();
        System.out.println("num=" + expectedDogs);
        Assert.assertEquals(expectedDogs , actualDogs);
    }
    @Test
    public void removeTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 1;
        Dog actualDog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(actualDog);
        DogHouse.remove(1);
        Dog expectedDog = DogHouse.getDogById(1);
        Assert.assertNotEquals(expectedDog , actualDog);
    }

}

