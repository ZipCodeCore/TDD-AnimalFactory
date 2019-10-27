package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
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
    public void getCatByIdTest() {
        String givenName = "rashmi";
        Date givenBirthDate = new Date();
        Integer givenId = 10;
        Cat actualCat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(actualCat);
        Cat expectedCat = CatHouse.getCatById(10);
        Assert.assertEquals(expectedCat , actualCat);
    }

    @Test
    public void getNumberOfCatsTest() {


        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        Cat actualCat = new Cat(givenName, givenBirthDate, givenId);
        Integer actualCats = 1;
        CatHouse.add(actualCat);

        Integer expectedCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCats , actualCats);
    }
    @Test
    public void removeTest() {
        String givenName = "";
        Date givenBirthDate = new Date();
        Integer givenId = 10;
        Cat actualCat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(actualCat);
        CatHouse.remove(10);
        Cat expectedCat = CatHouse.getCatById(10);
        Assert.assertNotEquals(expectedCat , actualCat);
    }

}