package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
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
    @Test
    public void addDogTest() {
        DogHouse.add(AnimalFactory.createDog("Rosie", new Date()));

        Integer dogs = 1;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(dogs, actual);
    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogIdTest() {
        Dog doggo =  AnimalFactory.createDog("Rustle", new Date());
        Integer dogID = 0;
        Integer actual = DogHouse.getNumberOfDogs();

        DogHouse.remove(doggo);

        Assert.assertEquals(dogID, actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest() {
        Dog dog = AnimalFactory.createDog("Ryan", new Date());
        DogHouse.add(dog);

        DogHouse.remove(dog);
        Integer noDog = 0;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(noDog, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
    Dog dog = AnimalFactory.createDog("Robin", new Date());
    DogHouse.add(dog);

    Dog actual = DogHouse.getDogById(dog.getId());

    Assert.assertEquals(dog, actual);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest() {
    Dog dog = AnimalFactory.createDog("Essie", new Date());
    DogHouse.add(dog);

    Integer expected = 1;
    Integer actual = DogHouse.getNumberOfDogs();

    Assert.assertEquals(expected, actual);
    }

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
