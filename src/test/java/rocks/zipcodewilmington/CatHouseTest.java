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
    public void addTest1() {
        CatHouse catHouse = new CatHouse();
        catHouse.add(new Cat("Wally", new Date(), null));
        int actual = catHouse.getNumberOfCats();
        int expected = 1;
        catHouse.clear();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addTest2() {
        CatHouse catHouse = new CatHouse();
        for(int i = 0; i < 4; i++) {
            catHouse.add(new Cat(null, null, null));
        }
        int actual = catHouse.getNumberOfCats();
        int expected = 4;
        catHouse.clear();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void addTest3() {
        CatHouse catHouse = new CatHouse();
        for(int i = 0; i < 3; i++) {
            catHouse.add(new Cat(null, null, null));
        }
        int actual = catHouse.getNumberOfCats();
        int expected = 3;
        catHouse.clear();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest1() {
        CatHouse catHouse = new CatHouse();
        catHouse.add(new Cat(null, null, 42));
        catHouse.remove(42);
        int actual = catHouse.getNumberOfCats();
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeByIdTest2() {
        CatHouse catHouse = new CatHouse();
        catHouse.add(new Cat(null, null, 42));
        catHouse.add(new Cat(null, null, 12));
        catHouse.add(new Cat(null, null, 3));
        catHouse.remove(3);
        int actual = catHouse.getNumberOfCats();
        int expected = 2;
        catHouse.clear();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeByIdTest3() {
        CatHouse catHouse = new CatHouse();
        catHouse.add(new Cat(null, null, 1374));
        catHouse.remove(1374);
        int actual = catHouse.getNumberOfCats();
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void removeCatTest1() {
        CatHouse catHouse = new CatHouse();
        catHouse.clear();
        Cat cat = new Cat("Jake",null,null);
        catHouse.add(cat);

        catHouse.remove(cat);
        int actual = catHouse.getNumberOfCats();
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeCatTest2() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Mark",null,null);
        catHouse.add(cat);
        catHouse.add(cat);
        catHouse.remove(cat);
        int actual = catHouse.getNumberOfCats();
        int expected = 1;
        catHouse.clear();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeCatTest3() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Harry",null,null);
        catHouse.add(cat);
        catHouse.add(cat);
        catHouse.add(cat);
        catHouse.remove(cat);
        int actual = catHouse.getNumberOfCats();
        int expected = 2;
        catHouse.clear();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatByIdTest1() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Harry",null,32);
        catHouse.add(cat);
        Cat actualCat = catHouse.getCatById(32);
        String actual = actualCat.getName();
        String expected = "Harry";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getCatByIdTest2() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Greg",null,43);
        catHouse.add(cat);
        Cat actualCat = catHouse.getCatById(43);
        String actual = actualCat.getName();
        String expected = "Greg";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getCatByIdTest3() {
        CatHouse catHouse = new CatHouse();
        Cat cat = new Cat("Dave",null,36);
        catHouse.add(cat);
        Cat actualCat = catHouse.getCatById(32);
        String actual = actualCat.getName();
        String expected = "Harry";
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest1() {
        CatHouse catHouse = new CatHouse();
        catHouse.clear();
        for (int i = 0; i < 23; i++) {
            catHouse.add(new Cat(null,null,null));
        }
        int actual = catHouse.getNumberOfCats();
        int expected = 23;
        catHouse.clear();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNumberOfCatsTest2() {
        CatHouse catHouse = new CatHouse();
        catHouse.clear();
        for (int i = 0; i < 2233; i++) {
            catHouse.add(new Cat(null,null,null));
        }
        int actual = catHouse.getNumberOfCats();
        int expected = 2233;
        catHouse.clear();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getNumberOfCatsTest3() {
        CatHouse catHouse = new CatHouse();
        catHouse.clear();
        for (int i = 0; i < 33; i++) {
            catHouse.add(new Cat(null,null,null));
        }
        int actual = catHouse.getNumberOfCats();
        int expected = 33;
        catHouse.clear();
        Assert.assertEquals(expected, actual);
    }
}
