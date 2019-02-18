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
    public void testAdd(){
        //Given
        CatHouse house = new CatHouse();
        Cat cat = new Cat("aaa", new Date(), 1);
        Integer expectedCat = 1;

        //When
        house.add(cat);
        Integer actualCat = house.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedCat,actualCat);

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeById(){
        //Given
        CatHouse house = new CatHouse();
        Cat cat = new Cat("aaa", new Date(),1);
        Integer expectedCat = 0;
        house.add(cat);

        //
        house.remove(cat.getId());
        Integer actualCat = house.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedCat, actualCat);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCat(){
        //Given
        CatHouse house = new CatHouse();
        Cat cat = new Cat("aaa", new Date(),1);
        Integer expectedCat = 0;
        house.add(cat);

        //When
        house.remove(cat);
        Integer actualCat = house.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedCat, actualCat);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCat(){
        //Given
        CatHouse house = new CatHouse();
        Cat helloKitty = new Cat("aaa",new Date(),1);
        house.add(helloKitty);
        Cat expectedCat = helloKitty;

        //When
        //house.getCatById(cat.getId());
        Cat actualCat = house.getCatById(helloKitty.getId());

        //Then
        Assert.assertEquals(expectedCat, actualCat);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumbers(){
        //Given
        Cat cat = new Cat("aaa", new Date(),1);
        CatHouse house = new CatHouse();
        house.add(cat);
        house.add(cat);
        Integer expectedNumber = 2;

        //When
        Integer actualNumber = house.getNumberOfCats();

        //Then
        Assert.assertEquals(expectedNumber,actualNumber);
    }

}
