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
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void addCatTest(){
        String catName = "Tigger";
        Date birthDate = new Date();
        Cat testCat = new Cat(catName,birthDate,0);

        int expected = 1;
        int actual = 0;

        // reset
        CatHouse.clear();
        CatHouse.add(testCat);

        actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeCaTByIdTest(){

    }

    @Test
    public void removeCatTest(){

    }

    @Test
    public void getCatByIdTest(){

    }

    @Test
    public void getNumberOfCatsTest(){
        String catName = "Tigger";
        Date birthDate = new Date();
        Cat testCat = new Cat(catName,birthDate,0);

        int expected = 1;
        int actual = 0;

        // reset
        CatHouse.clear();
        CatHouse.add(testCat);

        actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }

}