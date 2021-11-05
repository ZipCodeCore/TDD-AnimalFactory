package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat(){
        //given
        Cat newCat =  new Cat("Mckayla",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.clear();
        //when
        CatHouse.add(newCat);
        Cat actualCat = CatHouse.getCatById(1);
        //then
        Assert.assertEquals(newCat,actualCat);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID(){
        //given
        Cat newCat =  new Cat("Roberto",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.add(newCat);
        Cat expected = null;
        //when
        CatHouse.remove(1);
        Cat actual = CatHouse.getCatById(1);
        //then
        Assert.assertEquals(expected,actual);


    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveByCat(){
        //given
        Cat newCat = new Cat("Elijah",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.add(newCat);
        Cat expected = null;
        //when
        CatHouse.remove(newCat);
        Cat actual = CatHouse.getCatById(1);
        //then
        Assert.assertEquals(expected,actual);

    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById(){
        //given
        Cat expected = new Cat("Yolanda",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.add(expected);
        //when
        Cat actual = CatHouse.getCatById(1);
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        //given
        Cat newCat = new Cat("Archimedes",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.add(newCat);
        Integer expected = 1;
        //when
        Integer actual = CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(expected,actual);

    }
}
