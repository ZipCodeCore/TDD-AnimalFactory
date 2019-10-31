package rocks.zipcodewilmington;

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
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        //given
        String name = "";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        //when
        DogHouse.add(animal);
        //then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testaddDog() {
        //given
        DogHouse doghouse = new DogHouse();
        Dog dog = new Dog("Persin", new Date(10), 2);
        //when
        doghouse.add(dog);
        Dog actual = doghouse.getDogById(2);
        //then
        Assert.assertEquals(dog, actual);
    }

    @Test
    public void testRemoveDogName1() {
        // given
        int idOfDog = 3;
        Dog inputDog = new Dog("Fluffy", new Date(), idOfDog);
        Dog expectedDog = null;
        DogHouse.add(inputDog);

        // when
        DogHouse.remove(inputDog);
        Dog actualDog = DogHouse.getDogById(idOfDog);

        // then
        Assert.assertEquals(expectedDog, actualDog);
    }


    @Test
    public void testRemoveDogName2() {
        // given
        DogHouse house = new DogHouse();
        int idOfDog = 10;
        Dog inputDog = new Dog("Milo", new Date(), idOfDog);
        Dog expectedDog = null;
        house.add(inputDog);

        // when
        house.remove(inputDog);
        Dog actualDog = house.getDogById(idOfDog);

        // then
        Assert.assertEquals(expectedDog, actualDog);
    }

    @Test
    public void testRemoveMethod1() {
        // given
        DogHouse house = new DogHouse();
        int idOfDog = 5;
        Dog inputDog = new Dog("", new Date(), idOfDog);
        Dog expectedDog = null;
        house.add(inputDog);

        // when
        house.remove(idOfDog);
        Dog actualDog = house.getDogById(idOfDog);

        // then
        Assert.assertEquals(expectedDog, actualDog);
    }


    @Test
    public void testRemoveMethod2() {
        // given
        DogHouse house = new DogHouse();
        int idOfDog = 10;
        Dog inputDog = new Dog("", new Date(), idOfDog);
        Dog expectedDog = null;
        house.add(inputDog);

        // when
        house.remove(idOfDog);
        Dog actualDog = house.getDogById(idOfDog);

        // then
        Assert.assertEquals(expectedDog, actualDog);
    }
}
