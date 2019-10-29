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
    @Test
    public void testGetNumberOfCats() {
        //given
        String name = "";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        //when
        CatHouse.add(animal);
        //then
        CatHouse.getNumberOfCats();
    }

    @Test
    public void testaddCat() {
        //given
        CatHouse Catehouse = new CatHouse();
        Cat Cat = new Cat("Mowmow", new Date(3), 9);
        //when
        Catehouse.add(Cat);
        Cat actual = Catehouse.getCatById(9);
        //then
        Assert.assertEquals(Cat, actual);
    }


    @Test
    public void testRemoveCatName1() {
        // given
        int idOfCat = 2;
        Cat inputCat = new Cat("Floof", new Date(), idOfCat);
        Cat expectedCat = null;
        CatHouse.add(inputCat);

        // when
        CatHouse.remove(inputCat);
        Cat actualCat = CatHouse.getCatById(idOfCat);

        // then
        Assert.assertEquals(expectedCat, actualCat);
    }


    @Test
    public void testRemoveCatName2() {
        // given
        CatHouse house = new CatHouse();
        int idOfCat = 8;
        Cat inputCat = new Cat("Meek", new Date(), idOfCat);
        Cat expectedCat = null;
        house.add(inputCat);

        // when
        house.remove(inputCat);
        Cat actualCat = house.getCatById(idOfCat);

        // then
        Assert.assertEquals(expectedCat, actualCat);
    }

    @Test
    public void testRemoveMethod1() {
        // given
        CatHouse house = new CatHouse();
        int idOfCat = 3;
        Cat inputCat = new Cat("", new Date(), idOfCat);
        Cat expectedCat = null;
        house.add(inputCat);

        // when
        house.remove(idOfCat);
        Cat actualCat = house.getCatById(idOfCat);

        // then
        Assert.assertEquals(expectedCat, actualCat);
    }


    @Test
    public void testRemoveMethod2() {
        // given
        CatHouse house = new CatHouse();
        int idOfCat = 9;
        Cat inputCat = new Cat("", new Date(), idOfCat);
        Cat expectedCat = null;
        house.add(inputCat);

        // when
        house.remove(idOfCat);
        Cat actualCat = house.getCatById(idOfCat);

        // then
        Assert.assertEquals(expectedCat, actualCat);
    }
}
