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
    public void testRemoveDogMethod1() {
        // given
        int idOfDog = 0;
        Dog inputDog = new Dog("", new Date(), idOfDog);
        Dog expectedDog = null;
        DogHouse.add(inputDog);

        // when
        DogHouse.remove(inputDog);
        Dog actualDog = DogHouse.getDogById(idOfDog);

        // then
        Assert.assertEquals(expectedDog, actualDog);
    }


    @Test
    public void testRemoveDogMethod2() {
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
        int idOfDog = 0;
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

    @Test
    public void testAddMethod1() {
        // given
        DogHouse house = new DogHouse();
        int idOfDog = 0;
        Dog expectedDog = new Dog("", new Date(), idOfDog);

        // when
        house.add(expectedDog);
        Dog actualDog = house.getDogById(idOfDog);

        // then
        Assert.assertEquals(expectedDog, actualDog);
    }

    @Test
    public void testAddMethod2() {
        // given
        DogHouse house = new DogHouse();
        int idOfDog = 10;
        Dog expectedDog = new Dog("", new Date(), idOfDog);

        // when
        house.add(expectedDog);
        Dog actualDog = house.getDogById(idOfDog);

        // then
        Assert.assertEquals(expectedDog, actualDog);
    }
}
