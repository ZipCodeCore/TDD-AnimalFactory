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
    public void addTest(){
        //Given *
        Cat loki = new Cat("Loki", new Date(), 1);
        Cat nana = new Cat("nana", new Date(), 2);
        //When
        CatHouse.add(loki);
        Cat retrievedCat = CatHouse.getCatById(1);
        //Then
        Assert.assertEquals(loki, retrievedCat);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest(){
        //Given *
        Cat jack = new Cat("jack", new Date(), 3);
        Cat mini = new Cat("mini", new Date(), 4);
        //When
        CatHouse.add(jack);
        CatHouse.add(mini);
        CatHouse.remove(3);
        Cat retrievedCat = CatHouse.getCatById(3);
        //Then
        Assert.assertNull(retrievedCat);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeByCatTest(){
        //Given *
        Cat cake = new Cat("cake", new Date(), 5);
        Cat candy = new Cat("candy", new Date(), 6);
        //When
        CatHouse.add(cake);
        CatHouse.add(candy);
        CatHouse.remove(candy);
        Cat retrievedCat = CatHouse.getCatById(6);
        //Then
        Assert.assertNull(retrievedCat);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest(){
        //Given *
        Cat blue = new Cat("blue", new Date(), 7);
        Cat red = new Cat("red", new Date(), 8);
        //When
        CatHouse.add(blue);
        CatHouse.add(red);
        Cat retrievedCat = CatHouse.getCatById(8);
        //Then
        Assert.assertEquals(red, retrievedCat);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumOfCats(){
        //Given *
        Cat chubby = new Cat("chubby", new Date(), 11);
        Cat skinny = new Cat("skinny", new Date(), 12);
        //When
        CatHouse.clear();
        CatHouse.add(chubby);
        CatHouse.add(skinny);
        Integer expectedNumOfCats = 2;
        Integer retrievedNumOfCats = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expectedNumOfCats, retrievedNumOfCats, 0);
    }
}
