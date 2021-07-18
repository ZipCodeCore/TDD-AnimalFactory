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
    @Test
    public void addCatTest(){
        CatHouse.add(AnimalFactory.createCat("Lils", new Date()));

        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatIDTest(){
        Cat cat = AnimalFactory.createCat("Wets", new Date());
        CatHouse.add(cat);

        CatHouse.remove(cat.getId());

        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest(){
        Cat cat = AnimalFactory.createCat("Wets", new Date());
        CatHouse.add(cat);

        CatHouse.remove(cat);

        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest(){
        Cat cat = AnimalFactory.createCat("Wets", new Date());
        CatHouse.add(cat);

        Cat actual = CatHouse.getCatById(cat.getId());


        Assert.assertEquals(cat, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest(){
        Cat cat = AnimalFactory.createCat("drys", new Date());
        CatHouse.add(cat);

        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

}
