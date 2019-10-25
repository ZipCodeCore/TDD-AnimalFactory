package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
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
    @Test
    public void addTest(){
        int expected = DogHouse.getNumberOfDogs() + 1;
        DogHouse.add(new Dog(null,null,null));
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeTest(){
        int expected = DogHouse.getNumberOfDogs() ;
        Dog dog = new Dog(null,null,null);
        DogHouse.remove(dog);
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeByIdTest() {
        DogHouse.clear();
        int expected = DogHouse.getNumberOfDogs();
        DogHouse.add(new Dog(null, null, 1));
        DogHouse.remove(1);
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getDogByIdTest(){
        DogHouse.clear();
        DogHouse.add(new Dog("larry",null,1));
        Dog expected = DogHouse.getDogById(1);
        Dog actual = DogHouse.getDogById(1);
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getNumberOfDogsById(){
        DogHouse.clear();
        Integer expected = DogHouse.getNumberOfDogs() ;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected,actual);
    }
}
