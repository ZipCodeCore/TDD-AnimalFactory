package rocks.zipcodewilmington;

import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Calendar;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void testAddCat(){
        //given
        Cat newCat =  AnimalFactory.createCat("Mckayla",new Date(2019, Calendar.JANUARY,1),1);
        CatHouse.clear();
        //then
        CatHouse.addCat(newCat);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveByID(){

    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void testRemoveByCat(){

    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void testGetCatById(){

    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void testGetNumberOfCats(){

    }
}
