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
    private DogHouse dogHouseTest;
    Dog dogExpeced = new Dog("x",new Date(1),15);

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void testAdd(){
        // Given
        String expectedName = "fido";
        Date expectedBd = new Date(1);
        Integer expectedCountOfObjects = 1;

        Dog animalTest = AnimalFactory.createDog(expectedName,expectedBd);
        DogHouse.clear();

        // when
        DogHouse.add(animalTest);

        // then
        Integer actualCountOfObjects = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedCountOfObjects,actualCountOfObjects);


    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveById() {

    //Given
    Dog dogToRemove = new Dog("Y", new Date(), 99);
    dogHouseTest.add(dogToRemove)  ;


    // when
        dogHouseTest.remove(99);

    // then
    Dog dogActual = dogHouseTest.getDogById(99);
        Assert.assertNull(dogActual);

    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveObject(){
        // Given
        Dog dogToRemove = new Dog("byeBYe doggie", new Date(30),100);
        dogHouseTest.add(dogToRemove);

        // When
        dogHouseTest.remove(dogToRemove);

        // Then
        Dog dogActual = dogHouseTest.getDogById(100);
        Assert.assertNull(dogActual);

    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById() {
        // Given
        String expectedName = "Getting by ID";
        Integer expectedID = 98;
        Dog dogbyId = new Dog(expectedName, new Date(), expectedID);
        dogHouseTest.add(dogbyId);

        // When
        Dog actualDog = dogHouseTest.getDogById(expectedID);

        // then
        String actualName = actualDog.getName();
        Integer actualint = actualDog.getId();

        Assert.assertEquals(actualName,expectedName);
        Assert.assertEquals(actualint,expectedID);


    }


    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Integer total = 1;
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        Integer actualCount = DogHouse.getNumberOfDogs();
        Assert.assertEquals(total,actualCount);


    }
}
