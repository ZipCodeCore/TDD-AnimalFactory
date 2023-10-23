package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

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
    public void addTest() {
        CatHouse.clear();
        Cat cat = new Cat(null, null, null);
        CatHouse.add(cat);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeTestById() {
        CatHouse.clear();
        Cat cat = new Cat(null, null, 555);
        CatHouse.add(cat);
        CatHouse.remove(555);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void removeTestByCat() {
        CatHouse.clear();
        Cat cat = new Cat(null, null, 554);
        CatHouse.add(cat);
        CatHouse.remove(cat);
        Integer expected = 0;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getCatIdTest() {
        CatHouse.clear();
        Cat cat = new Cat(null, null, 54);
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(54);
        Assert.assertEquals(cat, actual);
    }

    @Test
    public void getNumberOfCatsTest() {
        CatHouse.clear();
        Cat cat = new Cat(null, null, 51);
        CatHouse.add(cat);
        Integer expected = 1;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
}
// include the .clear() jawn 