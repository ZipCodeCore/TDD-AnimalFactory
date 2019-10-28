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
    public void addDogTest(){
        Dog testDog = new Dog("Bobby", null, 10);
        DogHouse.add(testDog);
        Assert.assertEquals(testDog, DogHouse.getDogById(10));
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeDogTest(){
        Dog testDog = new Dog("Bobby", null, 11);
        DogHouse.add(testDog);
        DogHouse.remove(testDog);
        Assert.assertEquals(null, DogHouse.getDogById(11));
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogIdTest() {
        Dog testDog = new Dog("Bobby", null, 12);
        DogHouse.add(testDog);
        DogHouse.remove(12);
        Assert.assertEquals(null, DogHouse.getDogById(12));
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest() {
        Dog testDog2 = new Dog("Bobby", new Date(2016,9,25), 13);
        DogHouse.add(testDog2);
        Assert.assertEquals(testDog2, DogHouse.getDogById(13));
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogsTest() {
        Dog testDog2 = new Dog("Bobby", new Date(2016, 9, 25), 14);
        int original = DogHouse.getNumberOfDogs();
        DogHouse.add(testDog2);
        Assert.assertEquals(Integer.valueOf(original + 1), DogHouse.getNumberOfDogs());
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
