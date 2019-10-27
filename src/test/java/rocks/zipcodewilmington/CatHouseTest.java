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
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void addCatTest(){
        Cat testCat = new Cat("Tiger", null, 10);
        CatHouse.add(testCat);
        Assert.assertEquals(testCat, CatHouse.getCatById(10));
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest(){
        Cat testCat = new Cat("Tiger", null, 11);
        CatHouse.add(testCat);
        CatHouse.remove(testCat);
        Assert.assertEquals(null, CatHouse.getCatById(11));
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeCatIdTest() {
        Cat testCat = new Cat("Tiger", null, 12);
        CatHouse.add(testCat);
        CatHouse.remove(12);
        Assert.assertEquals(null, CatHouse.getCatById(12));
    }
        // TODO - Create tests for `Cat getCatById(Integer id)`
        @Test
        public void getCatByIdTest() {
            Cat testCat2 = new Cat("Tiger", new Date(2017,9,25), 13);
            CatHouse.add(testCat2);
            Assert.assertEquals(testCat2, CatHouse.getCatById(13));
        }

        // TODO - Create tests for `Integer getNumberOfCats()`
        @Test
        public void getNumberOfCatsTest() {
            Cat testCat2 = new Cat("Tiger", new Date(2017, 9, 25), 14);
            int original = CatHouse.getNumberOfCats();
            CatHouse.add(testCat2);
            Assert.assertEquals(Integer.valueOf(original + 1), CatHouse.getNumberOfCats());
        }
    }