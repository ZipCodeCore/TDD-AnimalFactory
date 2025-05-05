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
    public void testAdd(){
        //given
        Dog expectedDog=new Dog("Rocky",null,7);
        //when
        DogHouse.add(expectedDog);
        //then
        Dog actualDog=DogHouse.getDogById(7);
        Assert.assertEquals(expectedDog,actualDog);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemove(){
        //given
        Dog expectedDog=null;
        Dog myDog=new Dog("Fifa",null,23);
        //when
        DogHouse.add(myDog);
        DogHouse.clear();
        //then
        Dog actualDog=DogHouse.getDogById(23);
        Assert.assertEquals(expectedDog,actualDog);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveById(){
        //given
        Dog expectedDog=null;
        Dog newDog=new Dog("Bruno",null,55);
        //when
        DogHouse.add(newDog);
        DogHouse.clear();
        //then
        Dog actualDog=DogHouse.getDogById(55);
        Assert.assertEquals(expectedDog,actualDog);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void testGetDogById(){
        //given
        Dog expectedDog=new Dog("Fifa",null,23);
        //when
        DogHouse.add(expectedDog);
        //then
        Dog actualDog=DogHouse.getDogById(23);
        Assert.assertEquals(expectedDog,actualDog);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        //given
        Dog newDog=new Dog("Bruno",null,44);
        Integer expectedValue=2;
        //when
        DogHouse.add(newDog);
        Integer actualValue=DogHouse.getNumberOfDogs();
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }
}
