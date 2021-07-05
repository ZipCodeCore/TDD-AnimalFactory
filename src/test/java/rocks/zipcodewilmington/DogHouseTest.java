package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;
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
    public void testAddDog(){
        DogHouse dogHouse=new DogHouse();
        String expected="bear";
        Dog dog =new Dog(expected,null,null);
        dogHouse.add(dog);
        Assert.assertEquals(expected,dog.getName());

    }
    @Test
    public void testGetDogById(){
        DogHouse dogHouse=new DogHouse();
        Integer id=1;
        Dog dog=new Dog(null,null,id);
        dogHouse.add(dog);
        Assert.assertEquals(dog,dogHouse.getDogById(id));

    }
    @Test
    public void testRemoveIntegerId() {
        DogHouse dogHouse = new DogHouse();
        Integer id = 1;
        Dog dog = new Dog(null, null, id);
        dogHouse.add(dog);
        dogHouse.remove(id);
        Assert.assertEquals(null, dogHouse.getDogById(1));
    }

    @Test
    public void testRemoveDog(){
        DogHouse dogHouse=new DogHouse();
        String expectedName="appukutts";
        Integer id=1;
        Dog dog=new Dog(expectedName,null,1);
        dogHouse.add(dog);
        dogHouse.remove(dog);
        Assert.assertEquals(null,dogHouse.getDogById(1));
    }
}
