package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
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
    public void addDogTest() {
        Integer expectedDogNum = 2;
        DogHouse.add(new Dog("", new Date(), 12));
        Integer actualCatNum = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogNum, actualCatNum);
    }

    @Test
    public void removeIdTest() {
        Integer givenID = 10;
        Dog dog = new Dog("", new Date(), givenID);
        DogHouse.add(dog);
        DogHouse.remove(givenID);
        Assert.assertNull(DogHouse.getDogById(givenID));
    }

    @Test
    public void removeCatTest() {
        Integer givenId = 19;
        Dog dog = new Dog("", new Date(), givenId);
        DogHouse.add(dog);
        DogHouse.remove(dog);
        Assert.assertNull(DogHouse.getDogById(givenId));
    }

    @Test
    public void getCatIdTest() {
        Integer givenId = 5;
        Dog expectedDog = new Dog("", new Date(), givenId);
        DogHouse.add(expectedDog);
        Dog actualDog = DogHouse.getDogById(givenId);
        Assert.assertEquals(expectedDog, actualDog);
    }
    @Test
    public void testGetNumberOfDogs(){
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

