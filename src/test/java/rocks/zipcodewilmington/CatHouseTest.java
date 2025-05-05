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
    //given
    Cat cat = new Cat("Kitty", new Date(), 1);

    //when
    CatHouse.add(cat);
    Cat actual = CatHouse.getCatById(cat.getId());

    //then
    Assert.assertEquals(cat,actual);
}
@Test
    public void removeCatTest(){
    //given
    Cat cat= new Cat("Sylvester", new Date(), 2);

    //when
    CatHouse.remove(cat);
    Cat actual = CatHouse.getCatById(cat.getId());

    //then
    Assert.assertEquals(null, actual);

}
@Test
    public void removeCatIDTest(){
    //given
    Cat cat = new Cat("Tom", new Date(), 3);

    //when
    CatHouse.remove(3);
    Cat actual = CatHouse.getCatById(cat.getId());

    //then
    Assert.assertEquals(null, actual);
}
@Test
    public void getCatByIdTest(){
    //given
    Cat cat = new Cat("Cat", new Date(), 4);

    //when
    Integer actual = cat.getId();

    //then
    Assert.assertEquals(cat.getId(), actual);
}
@Test
    public void getNumberOfCatsTest(){
    //given
    Cat cat1 = new Cat("cat1", new Date(), 5);
    Cat cat2 = new Cat("cat2", new Date(), 6);
    Cat cat3 = new Cat("cat3", new Date(), 7);
    Cat cat4 = new Cat("cat4", new Date(), 8);
    Cat cat5 = new Cat("cat5", new Date(), 9);

    //when
    CatHouse.add(cat1);
    CatHouse.add(cat2);
    CatHouse.add(cat3);
    CatHouse.add(cat4);
    CatHouse.add(cat5);

    Integer expected = 5;

    //then
    Assert.assertEquals(expected, CatHouse.getNumberOfCats());


}
}
