package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.DoubleHolder;
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
    public void testGetNumberOfDogs() {
        // Given (
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);
        Integer expected = 1;

        // Then
        Assert.assertEquals(expected,DogHouse.getNumberOfDogs());
    }
    @Test
    public void addDogTest(){
        //given
        Dog dog = new Dog("Astro", new Date(), 1);
      //  Integer expectedId = dog.getId();
        //when
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(dog.getId());

        //then
        Assert.assertEquals(actual,dog );
    }
    @Test
    public void removeDogTest(){
        //given
        Dog dog = new Dog("John", new Date(), 2);

        //when
        DogHouse.remove(dog);
        Dog actual = DogHouse.getDogById(dog.getId());
        //then
        Assert.assertEquals(actual, null);
    }
    @Test
    public void removeDogIdTest(){
        //given
        Dog dog = new Dog("Billy", new Date(), 3);

        //when
        DogHouse.remove(3);
        Dog actual = DogHouse.getDogById(dog.getId());

        //then
        Assert.assertEquals(actual, null);
    }
    @Test
    public void getCatByIdTest(){
        //given
        Dog dog = new Dog("Dog", new Date(), 4);

        //when
        Integer actual = dog.getId();

        //then
        Assert.assertEquals(dog.getId(), actual);
    }
    @Test
    public void getNumberOfDogsTest(){
        //given
        Dog dog1 = new Dog("dog1", new Date(), 5);
        Dog dog2 = new Dog("dog2", new Date(), 6);
        Dog dog3 = new Dog("dog3", new Date(), 7);
        Dog dog4 = new Dog("dog4", new Date(), 8);
        Dog dog5 = new Dog("dog5", new Date(), 9);

        //when
        DogHouse.clear();
        DogHouse.add(dog1);
        DogHouse.add(dog2);
        DogHouse.add(dog3);
        DogHouse.add(dog4);
        DogHouse.add(dog5);

        Integer expected = 5;

        //then
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

}
