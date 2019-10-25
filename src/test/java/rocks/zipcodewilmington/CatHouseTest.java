package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

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
    public void addTest(){
        CatHouse.clear();

        // Given (some
        String name = "Phelix";
        Date birthDate = new Date();


        // When
        CatHouse.add(AnimalFactory.createCat("Lion", new Date()));
        CatHouse.add(AnimalFactory.createCat("Luna", new Date()));
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.add(animal);


        String expected = animal.getName();
        String actual = CatHouse.getCatById(animal.getId()).getName();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void removeTest(){
        CatHouse.clear();
        Cat jax = AnimalFactory.createCat("Jax", new Date());
        CatHouse.remove(jax.getId());

        Integer expected = jax.getId();
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeByCatTest(){
        CatHouse.clear();
        Cat jax = AnimalFactory.createCat("Jax", new Date());
        CatHouse.remove(jax);

        Integer expected = jax.getId();
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getCatByIdTest(){
        CatHouse.clear();
        Date birthDate = new Date();
        Cat jax = AnimalFactory.createCat("Jax", birthDate);

        int expected = jax.getId();
        int actual = CatHouse.getNumberOfCats();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void getNumberofCatsTest(){
        // Given (some
        String name = "Zula";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        int expected = 1;
        int actual = CatHouse.getNumberOfCats();

        // Then
        CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }


}
