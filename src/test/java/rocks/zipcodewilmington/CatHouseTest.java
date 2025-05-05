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
    public void catAddTest() {
        //given
        String givenName = "Kevin";
        Date giveBirthDate = new Date(2020-01-19);
        Integer givenId = 0;
        Cat expectedCat = new Cat(givenName, giveBirthDate, givenId);
        //when
        CatHouse.add(expectedCat);
        Cat actual = CatHouse.getCatById(givenId);
        //then
        Assert.assertEquals(expectedCat, actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testCatRemoveByID() {
        //given
        String givenName = "Kyo";
        Date giveBirthDate = new Date(2020-01-19);
        Integer givenId = 0;
        Cat givenCat = new Cat(givenName, giveBirthDate, givenId);
        //when
        CatHouse.add(givenCat);
        CatHouse.remove(givenId);
        Cat actual = CatHouse.getCatById(givenId);
        //then
        Assert.assertEquals(null, actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat() {
        //given
        String givenName = "Kyo";
        Date giveBirthDate = new Date(2020-01-19);
        Integer givenId = 0;
        Cat givenCat = new Cat(givenName, giveBirthDate, givenId);
        //when
        CatHouse.add(givenCat);
        CatHouse.remove(givenCat);
        Cat actual = CatHouse.getCatById(givenId);
        //then
        Assert.assertEquals(null, actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById () {
        //given
        String givenName = "Ruby";
        Date giveBirthDate = new Date(2020-01-19);
        Integer givenId = 0;
        Cat expectedCat = new Cat(givenName, giveBirthDate, givenId);
        //when
        CatHouse.add(expectedCat);
        Cat actual = CatHouse.getCatById(givenId);
        //then
        Assert.assertEquals(expectedCat, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats() {
        //given
        Integer expected = 2;
        Date givenBirthDate1 = new Date(2021-02-01);
        Date givenBirthDate2 = new Date(2020-05-15);
        Cat cat1 = new Cat("Totoro", givenBirthDate1, 0);
        Cat cat2 = new Cat("Cocoa", givenBirthDate2, 1);
        //when
        CatHouse.add(cat1);
        CatHouse.add(cat2);
        Integer actual = CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(expected, actual);
    }
}
