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
    public void getNumberOfDogs(){
        Dog animal = new Dog("Aldo", new Date(), 5);
        DogHouse.add(animal);
        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;

        Assert.assertEquals(actual, expected);
    }


    @Test
    public void getDogByIdTest(){
        Dog animal = new Dog("Miff", new Date(), 1);
        Integer actual = animal.getId();
        Integer expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeTest2(){
        Dog animal = new Dog("Bean", new Date(), 2);
        DogHouse.add(animal);
        DogHouse.remove(animal);
        Integer expected = 3;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeTest(){
        Dog animal = new Dog("George", new Date(), 3);
        DogHouse.add(animal);
        DogHouse.remove(animal.getId());
        Integer expected = 0;
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testAddDog(){
        Dog animal = new Dog("Brandon", new Date(), 4);
        DogHouse.add(animal);
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
