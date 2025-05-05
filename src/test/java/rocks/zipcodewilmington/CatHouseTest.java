package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAdd(){
        //given
        Cat expectedCat=new Cat("Princess",null,15);
       //when
        CatHouse.add(expectedCat);
       //then
        Cat actualCat=CatHouse.getCatById(15);
        Assert.assertEquals(expectedCat,actualCat);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemove(){
        //given
        Cat expectedCat=null;
        Cat myCat=new Cat("Fifa",null,23);
        //when
        CatHouse.add(myCat);
        Cat getCat=CatHouse.getCatById(23);
        CatHouse.remove(myCat);
        //then
        Cat actualCat=CatHouse.getCatById(23);
        Assert.assertEquals(expectedCat,actualCat);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveById(){
        //given
        Cat expectedCat=null;
        Cat newCat=new Cat("Kitty",null,55);
        //when
        CatHouse.add(newCat);
        CatHouse.remove(55);
        //then
        Cat actualCat=CatHouse.getCatById(55);
        Assert.assertEquals(expectedCat,actualCat);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById(){
        //given
        Cat expectedCat=new Cat("Kitty",null,55);
        //when
        CatHouse.add(expectedCat);
        //then
        Cat actualCat=CatHouse.getCatById(55);
        Assert.assertEquals(expectedCat,actualCat);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        //given
        Cat newCat=new Cat("Galore",null,44);
        Integer expectedValue=1;
        //when
        CatHouse.add(newCat);
        Integer actualValue=CatHouse.getNumberOfCats();
        //then
        Assert.assertEquals(expectedValue,actualValue);
    }
}
