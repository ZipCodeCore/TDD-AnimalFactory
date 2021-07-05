package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

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
    public void testAddCat(){
        CatHouse catHouse=new CatHouse();
        String expected="marble";
        Cat cat= new Cat(expected,null,null);
        catHouse.add(cat);
        Assert.assertEquals(expected,cat.getName());
    }

     @Test
     public void testGetIntegerId(){
        CatHouse catHouse =new CatHouse();
        Integer expectedId=1;
        Cat cat =new Cat(null,null,expectedId);
        catHouse.add(cat);
        Assert.assertEquals(cat,catHouse.getCatById(expectedId));
     }

    @Test
    public void testRemoveIntegerId() {
        CatHouse catHouse = new CatHouse();
        Integer id = 1;
        Cat cat =new Cat(null,null,id);
        catHouse.add(cat);
        catHouse.remove(id);
        Assert.assertEquals(null, catHouse.getCatById(id));

    }

    @Test
    public void testRemoveCat() {
        CatHouse catHouse = new CatHouse();
        Integer id = 1;
        Cat cat =new Cat("cora",null,id);
        catHouse.add(cat);
        catHouse.remove(cat);
       // catHouse.remove(id);
        Assert.assertEquals(null,catHouse.getCatById(id));

    }
     @Test
    public void testGetNumberOfCats(){
        Integer expectedNumber=2;
        CatHouse catHouse=new CatHouse();
        Cat cat=new Cat(null,null,null);
        catHouse.add(cat);
        catHouse.add(cat);
        Assert.assertEquals(expectedNumber,catHouse.getNumberOfCats());
     }
}
