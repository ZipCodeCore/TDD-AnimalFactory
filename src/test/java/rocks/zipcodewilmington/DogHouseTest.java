package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
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
        DogHouse.clear();   // include this on each test case!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest() {
        DogHouse.clear();
        Dog dog = new Dog(null, null,null);
        DogHouse.add(dog);
        Integer actual = 1;
        Integer expected = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByIdTest() {
        DogHouse.clear();
        Dog dog = new Dog(null, null,14);
        DogHouse.add(dog);
        DogHouse.remove(14);
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByDogTest() {
        DogHouse.clear();
        Dog dog = new Dog(null, null,null);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getDogByIdTest() {
        DogHouse.clear();
        Dog dog = new Dog(null, null,69);
        DogHouse.add(dog);
        Dog expected = DogHouse.getDogById(69);
        Dog actual = dog;
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getNumberOfDogs() {
        DogHouse.clear();
        Dog dog = new Dog(null, null,null);
        DogHouse.add(dog);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;
        Assert.assertEquals(expected, actual);
    }
}
