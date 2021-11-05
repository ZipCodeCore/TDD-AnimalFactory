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
    @Test
    public void testAddDog() {
        //Given
        DogHouse.clear();
        Dog dog = new Dog("Fluffy", new Date(05 - 05 - 2021), 123);
        DogHouse.add(dog);
        Integer expected = 1;
        //When
        Integer actual = DogHouse.getNumberOfDogs();
        // Then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId() {
        //Given
        DogHouse.clear();
        Dog dog = new Dog("Fluffy", new Date(05 - 05 - 2021), 123);
        DogHouse.add(dog);
        Integer expected = null;
        //When
        DogHouse.removeId(123);
        Dog actual = DogHouse.getDogById(123);
        //Then
       Assert.assertEquals(expected, actual);

    }


    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void testRemoveDog() {
        //Given

        Dog dog = new Dog("Fluffy", new Date(05 - 05 - 2021), 123);
        Integer expected = 1;
        //When
        DogHouse.remove(dog);
        Integer actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expected, actual);

    }


    // TODO - Create tests for `Dog getDogById(Integer id)`


    @Test
    public void testGetDogById() {
//Given
        DogHouse.clear();
        Dog dog = new Dog("Fluffy", new Date(05 - 05 - 2021), 123);
        Dog expected = dog; // ID 123

        //When
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(123);
        //The
        Assert.assertEquals(expected, actual);

    }
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
}
