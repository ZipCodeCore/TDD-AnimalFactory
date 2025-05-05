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
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`


    @Test
    public void addNumberCatTest(){
        //given
        String catName = "Scratchy";
        Date birthDay = new Date();
        Cat animal  = AnimalFactory.createCat(catName, birthDay);
        CatHouse.clear();

        //when
        CatHouse.add(animal);

        //then
        CatHouse.getNumberOfCats();
    }

    @Test
    public void catRemoveIdTest(){
        //given
        String catName = "Scratchy";
        Date birthDay = new Date();
        Cat animal = AnimalFactory.createCat(catName, birthDay);
        CatHouse.clear();


        //when

        Integer expected = 0;
        CatHouse.add(animal);
        CatHouse.remove(animal.getId());

        //then
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    @Test
    public void removeCatTest(){
        //given
        String catName = "Scratchy";
        Date birthDay = new Date();
        Cat animal  = AnimalFactory.createCat(catName, birthDay);
        CatHouse.add(animal);
        //when
        CatHouse.remove(animal);

        //then
        int actNumbCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(0, actNumbCats);
    }



    @Test
    public void getCatIdTest(){
        //given
        String catName = "Scratchy";
        Date birthDay = new Date();
        Cat animal = AnimalFactory.createCat(catName,birthDay);
        CatHouse.add(animal);
        CatHouse.clear();

        //when
        int actual = animal.getId();

        //then
        Assert.assertEquals(0, actual);
;
    }

}

