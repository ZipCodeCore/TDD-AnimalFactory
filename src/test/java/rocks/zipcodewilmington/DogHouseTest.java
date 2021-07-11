package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {

  // TODO - Create tests for `void add(Dog dog)`

    @Test
    public void addDogTest() {
        //Given
        Dog addDog = AnimalFactory.createDog("Underdog", null);

        //When
        DogHouse.add(addDog);
        int actual = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(2, actual);
    }

    // TODO - Create tests for `void remove(Dog dog)`

    @Test
    public void removeDogTest(){
        //Given
        Dog dogToBeRemoved = new Dog("Sandy", null, 1);

        //When
        DogHouse.remove(dogToBeRemoved);


        //Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeIntegerDogTest(){
        //Given
        DogHouse dogHouse = new DogHouse();

        //When
        dogHouse.remove(1);


        //Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, actual);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`

    @Test
    public void getDogByIdTest() {
        //Given
        Dog dogId = new Dog("Chaco", null, 0);

        //When
        Integer actual = dogId.getId();
        Integer expected = 0;

        //Then
        Assert.assertEquals(expected, actual);
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
