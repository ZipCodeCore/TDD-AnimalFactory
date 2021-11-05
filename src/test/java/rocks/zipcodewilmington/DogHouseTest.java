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
    @Test
    //
    public void testAddDog(){
        //given
        Dog expected = new Dog("Eleanor",new Date(),1);
        DogHouse.clear();
        //when
        DogHouse.add(expected);
        Dog actual = DogHouse.getDogById(1);
        //then
        Assert.assertEquals(expected,actual);


    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveById(){
        //given
        Dog expected = null;
        Dog newDog = new Dog("Eleanor",new Date(),1);
        DogHouse.clear();
        DogHouse.add(newDog);
        //when
        DogHouse.remove(1);
        Dog actual = DogHouse.getDogById(1);
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void testRemoveByDog(){
        //given
        Dog expected = null;
        Dog newDog = new Dog("Ulysses",new Date(),1);
        DogHouse.clear();
        DogHouse.add(newDog);
        //when
        DogHouse.remove(newDog);
        Dog actual = DogHouse.getDogById(1);
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById(){
        //given
        Dog expected = new Dog("Anthony",new Date(),1);
        DogHouse.clear();
        DogHouse.add(expected);
        //when
        Dog actual = DogHouse.getDogById(1);
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int expected = 1;
        DogHouse.add(animal);
        // When
        int actual = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expected,actual);
    }
}
