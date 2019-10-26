package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import java.util.Date;
import java.util.Objects;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Before
    public void setup(){}

    @After
    public void tearDown() {
        CatHouse clearCats = new CatHouse();
        clearCats.clear();
    }

    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void testAdd(){
        CatHouse testCatHouseAdd = new CatHouse();
        Integer expected = 1;

        Cat newCat = new Cat("Francis", new Date(), 1);
        testCatHouseAdd.add(newCat);

        Integer actual = testCatHouseAdd.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemobeId(){
        CatHouse testCatHouseRemId = new CatHouse();
        Integer expected = 0;

        Cat testCat = new Cat("Meatball", new Date(), 70);
        Integer catId = 70;
        testCatHouseRemId.add(testCat);

        testCatHouseRemId.remove(catId);
        Integer actual = testCatHouseRemId.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void testRemove(){
        CatHouse testCatHouseRem = new CatHouse();
        Integer expected = 0;

        Cat testCat = new Cat("Meatball", new Date(), 4);
        testCatHouseRem.add(testCat);


        testCatHouseRem.remove(testCat);
        Integer actual = testCatHouseRem.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void testGetCatById(){
        CatHouse testCatHouseRGetById = new CatHouse();
        Cat testCat = new Cat("Francis", new Date(), 302);
        testCatHouseRGetById.add(testCat);

        Cat expected = testCat ;

        Cat actual = testCatHouseRGetById.getCatById(302);

        Assert.assertEquals(expected, actual);
    }


    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats(){
        CatHouse testCatHouseNumberCats = new CatHouse();

        Cat newCat1 = new Cat("Francis", new Date(), 1);
        Cat newCat2 = new Cat("Meatball", new Date(), 2);
        Cat newCat3 = new Cat("Tigger", new Date(), 3);
        Cat newCat4 = new Cat("Simba", new Date(), 4);

        testCatHouseNumberCats.add(newCat1);
        testCatHouseNumberCats.add(newCat2);
        testCatHouseNumberCats.add(newCat3);
        testCatHouseNumberCats.add(newCat4);

        Integer expected = 4;
        Integer actual = testCatHouseNumberCats.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }


}


