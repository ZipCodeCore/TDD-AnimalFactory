package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
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
    public void addTest(){
        int expected = CatHouse.getNumberOfCats() + 1;
        CatHouse.add(new Cat(null,null,null));
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeTest(){
        int expected = CatHouse.getNumberOfCats() ;
        Cat cat = new Cat(null,null,null);
        CatHouse.remove(cat);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void removeByIdTest() {
        CatHouse.clear();
        int expected = CatHouse.getNumberOfCats();
        CatHouse.add(new Cat(null, null, 1));
        CatHouse.remove(1);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getCatByIdTest(){
        CatHouse.clear();
        CatHouse.add(new Cat("larry",null,1));
        Cat expected = CatHouse.getCatById(1);
        Cat actual = CatHouse.getCatById(1);
        System.out.println(CatHouse.getCatById(1));
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void getNumberOfCatsTest(){
        CatHouse.clear();
        Integer expected = CatHouse.getNumberOfCats() ;
        Integer actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected,actual);
    }
}
