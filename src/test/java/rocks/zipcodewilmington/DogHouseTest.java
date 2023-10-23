package rocks.zipcodewilmington;

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
    @Test
    public void testAddDogs() {
        //given
        String givenName = "Shigure";
        Date giveBirthDate = new Date(2020-01-19);
        Integer givenId = 0;
        Dog expectedDog = new Dog(givenName, giveBirthDate, givenId);
        //when
        DogHouse.add(expectedDog);
        Dog actual = DogHouse.getDogById(givenId);
        //then
        Assert.assertEquals(expectedDog, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testCatRemoveByID() {
        //given
        String givenName = "Cyan";
        Date giveBirthDate = new Date(2020-01-19);
        Integer givenId = 0;
        Dog givenDog = new Dog(givenName, giveBirthDate, givenId);
        //when
        DogHouse.add(givenDog);
        DogHouse.remove(givenId);
        Dog actual = DogHouse.getDogById(givenId);
        //then
        Assert.assertEquals(null, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveCat() {
        //given
        String givenName = "Loki";
        Date giveBirthDate = new Date(2020-01-19);
        Integer givenId = 0;
        Dog givenDog = new Dog(givenName, giveBirthDate, givenId);
        //when
        DogHouse.add(givenDog);
        DogHouse.remove(givenDog);
        Dog actual = DogHouse.getDogById(givenId);
        //then
        Assert.assertEquals(null, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetCatById () {
        //given
        String givenName = "Armin";
        Date giveBirthDate = new Date(2020-01-19);
        Integer givenId = 0;
        Dog expectedDog = new Dog(givenName, giveBirthDate, givenId);
        //when
        DogHouse.add(expectedDog);
        Dog actual = DogHouse.getDogById(givenId);
        //then
        Assert.assertEquals(expectedDog, actual);
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
