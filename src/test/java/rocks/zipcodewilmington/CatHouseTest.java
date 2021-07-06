package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    @Test
    public void addTest(){
        Cat cat = new Cat("Bart", new Date(), 1);
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(cat.getId());

        Assert.assertEquals(cat, actual);
    }

    @Test
    public void removeTestById(){
        Cat cat = new Cat("Joseph", new Date(), 1);
        CatHouse.add(cat);
        CatHouse.remove(cat.getId());

        Object actual = CatHouse.getCatById(cat.getId());

        Assert.assertNull(actual);
    }

    @Test
    public void removeTest(){
        Cat cat = new Cat("Joseph", new Date(), 1);
        CatHouse.add(cat);
        CatHouse.remove(cat);

        Object actual = CatHouse.getCatById(cat.getId());

        Assert.assertNull(actual);
    }

    @Test
    public void getCatByIdTest(){
        Cat expected = new Cat("Joseph", new Date(), 1);
        CatHouse.add(expected);

        Object actual = CatHouse.getCatById(expected.getId());

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getNumberOfCatsTests(){
        Cat catA = new Cat("Joseph", new Date(), 1);
        Cat catB = new Cat("Bella", new Date(), 2);
        CatHouse.add(catA);
        CatHouse.add(catB);

        int expected = 2;
        int actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(actual, expected);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
}

