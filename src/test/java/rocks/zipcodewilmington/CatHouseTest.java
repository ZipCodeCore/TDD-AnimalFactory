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
    @Test
    public void addTest() {
        //given
        Cat expected = new Cat(null, null, 4);
        CatHouse house = new CatHouse();
        //when
        house.clear();
        house.add(expected);
        Cat actual = CatHouse.getCatById(4);
        //then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest() {
        //given
        Cat expected = null;
        Cat cat = new Cat(null, null, 2);
        CatHouse house = new CatHouse();
        //when
        house.clear();
        house.add(expected);
        house.remove(expected);
        Cat actual = house.getCatById(2);
        //then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest() {
        //given we have a DogHouse && ID && Dog that exist
        Cat expected = null;
        Cat cat = new Cat(null, null, 2);
        CatHouse house = new CatHouse();
        //when
        house.clear();
        house.add(cat);
        house.remove(cat);
        Cat actual = house.getCatById(2);
            //then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest() {
        Cat expected = new Cat(null, null, 2);
        CatHouse house = new CatHouse();
        house.clear();
        house.add(expected);
        Cat actual = house.getCatById(2);

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCats() {
        //given

        //when

        //then

    }

}
