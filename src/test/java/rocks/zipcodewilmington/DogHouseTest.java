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
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testadd() {
        // Given (some
        String name = "Milano";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog("Milano", null);
        Dog animal1 = AnimalFactory.createDog("crany", null);
        Dog animal2 = AnimalFactory.createDog("coony", null);
        Integer expectedNoOfDogs = 3;

        // When
        DogHouse.clear();
        DogHouse.add(animal);
        DogHouse.add(animal1);
        DogHouse.add(animal2);

        // Then
        Integer noOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNoOfDogs,noOfDogs);

    }

    @Test
    public void testremovebyId1() {
        // Given (some
        String name = "Milano";
        Date birthDate = new Date();
        DogHouse.clear();
        for (int i=0 ; i<10 ; i++) {
            Dog animal = AnimalFactory.createDog("Milano", null);
            DogHouse.add(animal);
        }

        Integer expectedNoOfDogs = 8;

        DogHouse.remove(5);
        DogHouse.remove(2);

        Integer noOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNoOfDogs,noOfDogs);

    }

    @Test
    public void testremove() {
        // Given (some
        String name = "Milcky";
        Date birthDate = new Date();
        DogHouse.clear();
        for (int i=0 ; i<10 ; i++) {
            Dog animal = AnimalFactory.createDog("Milcky", null);
            DogHouse.add(animal);
        }

        Integer expectedNoOfDogs = 8;

        DogHouse.remove(6);
        DogHouse.remove(2);

        Integer noOfDogs = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expectedNoOfDogs,noOfDogs);

    }
}
