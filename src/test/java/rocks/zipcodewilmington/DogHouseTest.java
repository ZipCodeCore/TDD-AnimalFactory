package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
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
        DogHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);

        DogHouse.add(animal);

        int expected = 1;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void addTest() {
        DogHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();

        DogHouse.add(AnimalFactory.createDog("Jax", new Date()));
        DogHouse.add(AnimalFactory.createDog("Luna", new Date()));

        Dog pongo = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(pongo);

        int expected = 3;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeIdTest() {
        DogHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();

        DogHouse.add(AnimalFactory.createDog("Jax", new Date()));
        DogHouse.add(AnimalFactory.createDog("Luna", new Date()));

        Dog pongo = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(pongo);

        DogHouse.remove(pongo.getId());

        int expected = 2;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest() {
        DogHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();

        DogHouse.add(AnimalFactory.createDog("Jax", new Date()));
        DogHouse.add(AnimalFactory.createDog("Luna", new Date()));

        Dog pongo = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(pongo);

        DogHouse.remove(pongo);

        int expected = 2;
        int actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest() {
        DogHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();

        DogHouse.add(AnimalFactory.createDog("Jax", new Date()));
        DogHouse.add(AnimalFactory.createDog("Luna", new Date()));

        Dog pongo = AnimalFactory.createDog(name, birthDate);
        DogHouse.add(pongo);

        String expected = name;
        String actual = DogHouse.getDogById(pongo.getId()).getName();

        Assert.assertEquals(expected, actual);
    }
}
