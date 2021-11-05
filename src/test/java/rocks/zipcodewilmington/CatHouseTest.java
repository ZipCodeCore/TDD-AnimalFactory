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
    public void testAddCat() {
        //Given
        CatHouse.clear();
        Cat cat = new Cat("Milo", new Date(), 123);
        CatHouse.add(cat);
        Integer expected = 1;
        //When
        Integer actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(expected, actual);

    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveId() {
        //Given
        CatHouse.clear();
        Cat cat = new Cat("Milo", new Date(), 123);
        CatHouse.add(cat);
        Integer expected = null;
        //When

        CatHouse.remove(123);
        Cat actual = CatHouse.getCatById(123);

        //Then
        Assert.assertEquals(expected, actual);


    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveCat() {
        //Given
        CatHouse.clear();
        Cat cat = new Cat("Milo", new Date(), 123);
        CatHouse.add(cat); // added one
        Integer expected = 0;
        //When
        CatHouse.remove(cat); //removed one
        Integer actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void testGetCatById() {
        //Given
        CatHouse.clear();
        Cat cat = new Cat("Milo", new Date(), 123);
        Cat expected = cat;

        //When
        CatHouse.add(cat); // added one
        Cat actual = CatHouse.getCatById(123);

        //Then
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        //Given
        CatHouse.clear();
        Cat cat = new Cat("Milo", new Date(), 123);
        Cat cat1 = new Cat("Leo", new Date(), 456);
        Integer expected = 2;
        //When
        CatHouse.add(cat);
        CatHouse.add(cat1);
        Integer actual = CatHouse.getNumberOfCats();
        //Then
        Assert.assertEquals(expected, actual);
    }


}
