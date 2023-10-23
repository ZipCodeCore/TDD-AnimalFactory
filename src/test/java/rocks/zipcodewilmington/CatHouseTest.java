package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.ArrayList;
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


    @Before
    public void setUp() {

    }

    @After
    public void tearDown() {
    CatHouse.clear();
    }

    @Test
    public void testAddCat() {
        Cat cat3 = new Cat("tom", new Date(), 2);
        CatHouse.add(cat3);
        Cat expected = cat3;
        Cat actual = CatHouse.getCatById(2);
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testRemoveCat() {
        Cat cat1 = new Cat("Sheila", new Date(), 2);
        Cat cat2 = new Cat("Bob", new Date(), 4);
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        CatHouse.remove(cat2);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGetCatById() {
        Cat cat3 = new Cat("simon", new Date(), 4);
        CatHouse.add(cat3);
        Cat expected = cat3;
        Cat actual = CatHouse.getCatById(4);
        Assert.assertEquals(expected, actual);
    }


}















