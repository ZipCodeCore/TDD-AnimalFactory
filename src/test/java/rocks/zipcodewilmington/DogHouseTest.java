package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.ArrayList;
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

    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    DogHouse.clear();
    }

    @Test
    public void testAddDog() {
        DogHouse dogHut = new DogHouse();
        Dog cat3 = new Dog("tom", new Date(), 2);
        dogHut.add(cat3);
        Dog expected = cat3;
        Dog actual = dogHut.getDogById(2);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemoveDog() {
        DogHouse dogHut = new DogHouse();
        Dog dog1 = new Dog("Sheila", new Date(), 2);
        Dog dog2 = new Dog("Bob", new Date(), 4);
        dogHut.add(dog1);
        dogHut.add(dog2);
        dogHut.remove(dog2);
        Integer expected = 1;
        Integer actual = dogHut.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetDogById() {
        DogHouse dogHut = new DogHouse();
        Dog dog3 = new Dog("simon", new Date(), 4);
        dogHut.add(dog3);
        Dog expected = dog3;
        Dog actual = dogHut.getDogById(4);
        Assert.assertEquals(expected, actual);
    }


}
















