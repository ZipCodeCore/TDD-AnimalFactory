package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.ArrayList;
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


@Before
public void setUp() {

}

@After
    public void tearDown()  {

}

 void testAddCat()  {
    CatHouse catHut = new CatHouse();
    Cat cat2 = new Cat("tom", new Date(), 2);
    catHut.add(cat2);
    Cat expected = cat2;
    Cat actual = catHut.getCatById(2);
    Assert.assertEquals(expected, actual);
}


@Test
    public void testRemoveCat()  {
    CatHouse catHut = new CatHouse();
    Cat cat1 = new Cat("Sheila", new Date(), 2);
    Cat cat2 = new Cat("Bob", new Date(), 4);
    catHut.add(cat1);
    catHut.add(cat2);
    catHut.remove(cat2);
    Integer expected = 1;
    Integer actual = catHut.getNumberOfCats();
    Assert.assertEquals(expected, actual);
}

@Test
    public void testGetCatById()    {
    CatHouse catHut = new CatHouse();
    Cat cat3 = new Cat("simon", new Date(), 4);
    catHut.add(cat3);
    Cat expected = cat3;
    Cat actual = catHut.getCatById(4);
    Assert.assertEquals(expected, actual);








}














}
