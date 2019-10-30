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

        Integer expectedCatNum = 1;
        CatHouse.add(new Cat("", new Date(), 12));
        Integer actualCatNum = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCatNum, actualCatNum);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeIdTest(){
       Integer givenID = 10;
       Cat cat = new Cat("", new Date(), givenID);
       CatHouse.add(cat);
       CatHouse.remove(givenID);
       Assert.assertNull(CatHouse.getCatById(givenID));
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest(){
       Integer givenId = 19;
       Cat cat = new Cat("", new Date(), givenId);
       CatHouse.add(cat);
       CatHouse.remove(cat);
       Assert.assertNull(CatHouse.getCatById(givenId));
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatIdTest(){
       Integer givenId = 5;
       Cat expectedCat = new Cat("", new Date(), givenId);
       CatHouse.add(expectedCat);
       Cat actualCat = CatHouse.getCatById(givenId);
       Assert.assertEquals(expectedCat, actualCat);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void numOfCatsTest(){
        Integer expectedCatNum = 1;
        CatHouse.clear();
        CatHouse.add(new Cat("", new Date(), 12));
        Integer actualCatNum = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCatNum, actualCatNum);
    }
}
