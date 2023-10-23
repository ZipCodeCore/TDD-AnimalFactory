package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
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
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @After
    public void tearDown() {
        DogHouse dogHouse = new DogHouse();
        dogHouse.clear();
    }

    @Test
    public void addTest() {
        // Given
        int expectedNumberOfDogs = 1;

        // When
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(new Dog(null, null, null));
        int actualNumberOfDogs = dogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void removeByIdTest() {
        // Given
        int expectedNumberOfDogs = 1;

        // When
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(new Dog(null, null, 1));
        dogHouse.add(new Dog(null, null, 2));
        dogHouse.remove(1);
        int actualNumberOfDogs = dogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void removeByDogTest() {
        // Given
        int expectedNumberOfDogs = 1;

        // When
        DogHouse dogHouse = new DogHouse();
        Dog george = new Dog(null, null, null);
        Dog allen = new Dog(null, null, null);
        dogHouse.add(george);
        dogHouse.add(allen);
        dogHouse.remove(allen);
        int actualNumberOfDogs = dogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void getDogByIdTest() {
        // Given
        Dog expectedDog = new Dog(null, null, 6);

        // When
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(expectedDog);
        Dog actualDog = dogHouse.getDogById(6);
        // Then
        Assert.assertEquals(expectedDog, actualDog);
    }

    @Test
    public void getNumberOfDogsTest() {
        // Given
        int expectedNumberOfDogs = 5;

        // When
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(new Dog(null, null, null));
        dogHouse.add(new Dog(null, null, null));
        dogHouse.add(new Dog(null, null, null));
        dogHouse.add(new Dog(null, null, null));
        dogHouse.add(new Dog(null, null, null));
        int actualNumberOfDogs = dogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(expectedNumberOfDogs, actualNumberOfDogs);
    }
}
