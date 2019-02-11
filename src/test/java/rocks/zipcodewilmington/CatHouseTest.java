package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    private CatHouse catHouseTest;
    Cat catExpected = new Cat("yep",new Date(1),15);

    @Before


    // TODO - Create tests for `void add(Cat cat)
    @Test
    public void testAdd(){
        // Given


        // when
        catHouseTest.add(catExpected);

        // then - is this testing correctly?
        Cat catActual = catHouseTest.getCatById(15);
        Assert.assertEquals(catExpected, catActual);

    }


    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID() {
        // given
        Cat catToRemove = new Cat("yep",new Date(1),11);
        catHouseTest.add(catToRemove);

        // when
        catHouseTest.remove(11);

        // then
        Cat catActual = catHouseTest.getCatById(11);
        Assert.assertNull(catActual);


    }


    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveByObject() {
        // given
        Cat catToRemove = new Cat("ByeBye Cat", new Date(2), 144);
        catHouseTest.add(catToRemove);

        // when
        catHouseTest.remove(catToRemove);

        // then -- Is there a better way?
        Cat catActual = catHouseTest.getCatById(144);
        Assert.assertNull(catActual);

    }

    // TODO - Create tests for `Cat getCatById(Integer id)`
   @Test
    public void testGetCatById(){
        // given
        String expectedName = "Are you still here Cat";
        Integer expectedID = 43;

        Cat catToGrab = new Cat(expectedName , new Date(3), expectedID);
        catHouseTest.add(catToGrab);

        // when
        Cat actualCat = catHouseTest.getCatById(43);

        // then
       String actualName = actualCat.getName();
       Integer actualId = actualCat.getId();
       Assert.assertEquals(actualName,expectedName);
       Assert.assertEquals(actualId,expectedID);


    }


    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){
        // Given
        catHouseTest.clear();
        Integer expected = 1;
        Cat catToAdd = new Cat("ByeBye Cat", new Date(2), 144);
        catHouseTest.add(catToAdd);

        Integer actual = catHouseTest.getNumberOfCats();


        Assert.assertEquals(expected, actual);
    }

}
