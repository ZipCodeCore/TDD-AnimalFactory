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
    // TODO - Create tests for `void add(Dog dog)`        V
    // TODO - Create tests for `void remove(Integer id)`   V
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`    V

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
    public void addDogTest() {
        String dogName = "Barf";
        Date birthDate = new Date();
        Dog testDog = AnimalFactory.createDog(dogName,birthDate);

        int expectedNumberOfDogs = 1;
        int actualNumberOfDogs = 0;

        // reset
        DogHouse.clear();
        DogHouse.add(testDog);

        actualNumberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumberOfDogs,actualNumberOfDogs);

    }

    @Test
    public void removeIdTest() {
        String dogName = "Barf";
        Date birthDate = new Date();
        Dog testDog = AnimalFactory.createDog(dogName,birthDate);

        int expectedNumberOfDogs = 0;
        int actualNumberOfDogs = 9;
        int dogId = 9;

        // reset
        DogHouse.clear();
        // add the newly created dog
        DogHouse.add(testDog);

        dogId = testDog.getId();

        // remove added dog
        DogHouse.remove(dogId);
        actualNumberOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNumberOfDogs,actualNumberOfDogs);

    }


}
