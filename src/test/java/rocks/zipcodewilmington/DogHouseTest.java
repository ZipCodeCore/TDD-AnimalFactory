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
    public void addTest(){
        DogHouse.clear();

        // Given (some
        String name = "Milo";
        Date birthDate = new Date();


        // When
        DogHouse.add(AnimalFactory.createDog("Yuki", new Date()));
        DogHouse.add(AnimalFactory.createDog("Yami", new Date()));
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(animal);


        String expected = animal.getName();
        String actual = DogHouse.getDogById(animal.getId()).getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest(){
        DogHouse.clear();
        Dog chloe = AnimalFactory.createDog("Chloe", new Date());
        DogHouse.add(chloe);
        DogHouse.remove(chloe.getId());

        Integer expected = chloe.getId();
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeByDogTest(){
        DogHouse.clear();
        Dog jax = AnimalFactory.createDog("Jax", new Date());
        DogHouse.remove(jax);

        Integer expected = jax.getId();
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getDogByIdTest(){
        DogHouse.clear();
        Date birthDate = new Date();
        Dog chloe = AnimalFactory.createDog("Chloe", birthDate);

        int expected = chloe.getId();
        int actual = DogHouse.getNumberOfDogs();


        Assert.assertEquals(expected, actual);

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

        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
}
