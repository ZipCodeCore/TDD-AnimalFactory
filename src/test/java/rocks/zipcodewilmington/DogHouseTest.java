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

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

    @Before
    public void setup(){}

    @After
    public void tearDown() {
        DogHouse clearDogs = new DogHouse();
        clearDogs.clear();
    }

    // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void testAdd(){
        DogHouse testDogHouseAdd = new DogHouse();
        Integer expected = 1;

        Dog newDog = new Dog ("Scully", new Date(), 1);
        testDogHouseAdd.add(newDog);

        Integer actual = testDogHouseAdd.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemobeId(){
        DogHouse testDogHouseRemId = new DogHouse();
        Integer expected = 0;

        Dog testDog = new Dog("Scully", new Date(), 56);
        Integer dogId = 56;
        testDogHouseRemId.add(testDog);

        testDogHouseRemId.remove(testDog);
        Integer actual = testDogHouseRemId.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void testRemove(){
        DogHouse testDogHouseRem = new DogHouse();
        Integer expected = 0;

        Dog newDog = new Dog("Thor", new Date(), 23);
        testDogHouseRem.add(newDog);

        testDogHouseRem.remove(newDog);
        Integer actual = testDogHouseRem.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void testGetCatById(){
        DogHouse testDogHouseGetById = new DogHouse();
        Dog newDog = new Dog("Scully", new Date(), 356);
        testDogHouseGetById.add(newDog);

        Dog expected = newDog;

        Dog actual = testDogHouseGetById.getDogById(356);

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs(){
        DogHouse testDogHouseNumberDogs = new DogHouse();

        Dog newDog1 = new Dog("Thor", new Date(), 1);
        Dog newDog2 = new Dog("Scully", new Date(), 2);
        Dog newDog3 = new Dog("Maggie", new Date(), 3);
        Dog newDog4 = new Dog("Katie", new Date(), 4);

        testDogHouseNumberDogs.add(newDog1);
        testDogHouseNumberDogs.add(newDog2);
        testDogHouseNumberDogs.add(newDog3);
        testDogHouseNumberDogs.add(newDog4);

        Integer expected = 4;
        Integer actual = testDogHouseNumberDogs.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }


}
