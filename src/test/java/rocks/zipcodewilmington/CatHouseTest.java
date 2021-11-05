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
    @Test
    public void testAddCat2(){
        //given
        Cat newCat =  new Cat("Ckayla",new Date(209, Calendar.JANUARY,1),8);
        CatHouse.clear();
        //when
        CatHouse.add(newCat);
        Cat actualCat = CatHouse.getCatById(8);
        //then
        Assert.assertEquals(newCat,actualCat);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID(){
        //given
        Cat newCat =  new Cat("Roberto",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.clear();
        CatHouse.add(newCat);
        Cat expected = null;
        //when
        CatHouse.remove(1);
        Cat actual = CatHouse.getCatById(1);
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemoveByID2(){
        //given
        Cat newCat =  new Cat("Oberto",new Date(19, Calendar.JANUARY,9),222);
        CatHouse.clear();
        CatHouse.add(newCat);
        Cat expected = null;
        //when
        CatHouse.remove(222);
        Cat actual = CatHouse.getCatById(222);
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveByCat(){
        //given
        Cat newCat = new Cat("Elijah",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.clear();
        CatHouse.add(newCat);
        Cat expected = null;
        //when
        CatHouse.remove(newCat);
        Cat actual = CatHouse.getCatById(1);
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testRemoveByCat2(){
        //given
        Cat newCat = new Cat("Lijah",new Date(20199, Calendar.JANUARY,3),33);
        CatHouse.clear();
        CatHouse.add(newCat);
        Cat expected = null;
        //when
        CatHouse.remove(newCat);
        Cat actual = CatHouse.getCatById(33);
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById(){
        //given
        Cat expected = new Cat("Yolanda",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.clear();
        CatHouse.add(expected);
        //when
        Cat actual = CatHouse.getCatById(1);
        //then
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void testGetCatById2(){
        //given
        Cat expected = new Cat("Olanda",new Date(20219, Calendar.JANUARY,12),10923);
        CatHouse.clear();
        CatHouse.add(expected);
        //when
        Cat actual = CatHouse.getCatById(10923);
        //then
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        //given
        Cat newCat = new Cat("Archimedes",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.clear();
        CatHouse.add(newCat);
        Integer expected = 1;
        //when
        Integer actual = CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void testGetNumberOfCats2(){
        //given
        Cat newCat2 = new Cat("Rchimedes",new Date(20139, Calendar.JANUARY,23),53);
        CatHouse.clear();
        CatHouse.add(newCat2);
        Integer expected = 2;
        Cat newCat = new Cat("Archimedes",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.add(newCat);
        //when
        Integer actual = CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(expected,actual);

    }
}
