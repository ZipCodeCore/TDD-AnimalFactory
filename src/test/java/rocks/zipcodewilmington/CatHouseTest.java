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
        CatHouse.add(new Cat("Nina", new Date(),0));
        Integer catsBefore = CatHouse.getNumberOfCats() + 1;
        CatHouse.add(new Cat("Mini", new Date(),1));

        Assert.assertEquals(catsBefore, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeIdTest(){
        CatHouse.add(new Cat("Nina", new Date(),0));
        CatHouse.add(new Cat("Mini", new Date(),1));

        Integer catsBefore = CatHouse.getNumberOfCats() - 1;
        CatHouse.remove(0);
        Assert.assertEquals(catsBefore, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeCatTest(){
        Cat newCat = new Cat("kitten", new Date(),2);
        CatHouse.add(new Cat("Nina", new Date(),0));
        CatHouse.add(new Cat("Mini", new Date(),1));
        CatHouse.add(newCat);

        Integer catsBefore = CatHouse.getNumberOfCats() - 1;
        CatHouse.remove(newCat);
        Assert.assertEquals(catsBefore, CatHouse.getNumberOfCats());
    }

    @Test
    public void getCatByIdTest(){
        Cat newCat = new Cat("kitten", new Date(),2);
        CatHouse.add(new Cat("Nina", new Date(),0));
        CatHouse.add(new Cat("Mini", new Date(),1));
        CatHouse.add(newCat);

        Assert.assertEquals(newCat, CatHouse.getCatById(newCat.getId()));
    }

    @Test
    public void getNumeberOfCatsTest() {
        CatHouse.add(new Cat("Nina", new Date(), 0));
        Integer catsBefore = CatHouse.getNumberOfCats() + 1;
        CatHouse.add(new Cat("Mini", new Date(), 1));

        Assert.assertEquals(catsBefore, CatHouse.getNumberOfCats());
    }
}
