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
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void addDogTest(){
        // Given
        String givenName = "Mochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        DogHouse.clear();

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);
        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(1, actual);

    }

    @Test
    public void removeDogByIdTest() {
        // Given
        String givenName = "Mochi Junior";
        Date givenBirthDate = new Date();
        Integer givenId = 1;


        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.remove(1);


        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(0, actual);
        Assert.assertNull(DogHouse.getDogById(0));

    }

    @Test
    public void removeDogTest() {
        // Given
        String givenName = "Macha";
        Date givenBirthDate = new Date();
        Integer givenId = 2;
        DogHouse.clear();

        // When
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.remove(dog);

        int actual = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(0, actual);
    }


//    @Test
//    public void getNumberOfDogsTest () {
//        // Given
//        String givenName = "Macha";
//        Date givenBirthDate = new Date();
//        Integer givenId = 2;
//        Dog dog = new Dog(givenName, givenBirthDate, givenId);
//        DogHouse.add(dog);
//
//        // When
//        int actual = DogHouse.getNumberOfDogs();
//
//        // Then
//        Assert.assertEquals(1, actual);
//
//    }

    @Test
    public void getDogByIdTest() {
        // Given
        String givenName = "Macha";
        Date givenBirthDate = new Date();
        Integer givenId = 2;
        Dog dog = new Dog(givenName, givenBirthDate, givenId);
        DogHouse.add(dog);

        // When
        Dog actual = DogHouse.getDogById(givenId);


        // Then
        Assert.assertEquals(dog, actual);

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
