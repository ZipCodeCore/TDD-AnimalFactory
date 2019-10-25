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
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void testGetNumberOfCats() {
        CatHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);

        CatHouse.add(animal);

        int expected = 1;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void addTest() {
        CatHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();

        CatHouse.add(AnimalFactory.createCat("Jax", new Date()));
        CatHouse.add(AnimalFactory.createCat("Luna", new Date()));

        Cat pongo = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(pongo);

        int expected = 3;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }


    @Test
    public void removeIdTest() {
        CatHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();

        CatHouse.add(AnimalFactory.createCat("Jax", new Date()));
        CatHouse.add(AnimalFactory.createCat("Luna", new Date()));

        Cat pongo = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(pongo);

        CatHouse.remove(pongo.getId());

        int expected = 2;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest() {
        CatHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();

        CatHouse.add(AnimalFactory.createCat("Jax", new Date()));
        CatHouse.add(AnimalFactory.createCat("Luna", new Date()));

        Cat pongo = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(pongo);

        CatHouse.remove(pongo);

        int expected = 2;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest() {
        CatHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();

        CatHouse.add(AnimalFactory.createCat("Jax", new Date()));
        CatHouse.add(AnimalFactory.createCat("Luna", new Date()));

        Cat pongo = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(pongo);

        String expected = name;
        String actual = CatHouse.getCatById(pongo.getId()).getName();

        Assert.assertEquals(expected, actual);
    }
}
