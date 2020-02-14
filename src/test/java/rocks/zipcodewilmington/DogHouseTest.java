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
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void TestRemoveInt() {
        String name = "Gizmo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        DogHouse.remove(1);
        Assert.assertNull(DogHouse.getDogById(1));
    }

    @Test
    public void TestRemoveDog() {
        String name = "Gizmo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        DogHouse.remove(animal);
        Assert.assertNull(DogHouse.getDogById(1));
    }


    @Test
    public void TestGetDogById() {
        String name = "Gizmo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        Dog expected = animal;
        Dog actual = DogHouse.getDogById(1);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void TestGetNumberOfDogs() {
        String name = "Gizmo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        Integer expected = 1;
        Integer actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

    // Not sure how this could be different than either getNumberOfDogs or getDogByID?
    @Test
    public void TestAdd() {
        String name = "Gizmo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        Assert.assertEquals(new Integer(1), DogHouse.getNumberOfDogs());
    }
}
