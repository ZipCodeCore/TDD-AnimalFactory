package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
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

    @Before
    public void setup() {
        CatHouse.clear();
    }

    @Test
    public void testAdd_add_lilly_cat() {

        Cat lillyCat = AnimalFactory.createCat("Lilly", new Date());
        CatHouse.add(lillyCat);

        Assert.assertEquals(CatHouse.getNumberOfCats(), Integer.valueOf(1));
        Assert.assertEquals(lillyCat, CatHouse.getCatById(0));
    }

    @Test
    public void testAdd_add_millo_cat() {

        Cat milloCat = AnimalFactory.createCat("millo", new Date());
        CatHouse.add(milloCat);

        Assert.assertEquals(CatHouse.getNumberOfCats(), Integer.valueOf(1));
        Assert.assertEquals(milloCat, CatHouse.getCatById(0));
    }

    @Test
    public void testAdd_remove_by_id_lilly_cat() {

        // Given Lilly Cat exists in CatHouse
        CatHouse.add(AnimalFactory.createCat("Lilly", new Date()));
        Assert.assertEquals(CatHouse.getNumberOfCats(), Integer.valueOf(1));

        // When Lilly cat removed from Cat House
        CatHouse.remove(0);

        // Then No cat lives in CatHouse
        Assert.assertEquals(CatHouse.getNumberOfCats(), Integer.valueOf(0));
    }

    @Test
    public void testAdd_remove_by_id_milo_cat() {

        // Given Lilly Cat exists in CatHouse
        CatHouse.add(AnimalFactory.createCat("Lilly", new Date()));
        CatHouse.add(AnimalFactory.createCat("Millo", new Date()));
        Assert.assertEquals(CatHouse.getNumberOfCats(), Integer.valueOf(2));

        // When Lilly cat removed from Cat House
        CatHouse.remove(1);

        // Then No cat lives in CatHouse
        Assert.assertEquals(CatHouse.getNumberOfCats(), Integer.valueOf(1));
        Assert.assertEquals(CatHouse.getCatById(0).getName(), "Lilly");
    }

    @Test
    public void testAdd_remove_by_object_millo_cat() {

        Cat milo = AnimalFactory.createCat("Milo>", new Date());
        CatHouse.add(milo);

        CatHouse.remove(milo);

        Assert.assertEquals(CatHouse.getNumberOfCats(), Integer.valueOf(0));
    }

    @Test
    public void testAdd_remove_by_object_lilly_cat() {

        Cat lilly = AnimalFactory.createCat("Lilly", new Date());
        CatHouse.add(lilly);
        CatHouse.add(AnimalFactory.createCat("Milo", new Date()));

        CatHouse.remove(lilly);

        Assert.assertEquals(CatHouse.getNumberOfCats(), Integer.valueOf(1));
    }

    @Test
    public void testNumberOfCats_three_cats_in_house() {

        // Given Lilly Cat exists in CatHouse
        CatHouse.add(AnimalFactory.createCat("Lilly", new Date()));
        CatHouse.add(AnimalFactory.createCat("Millo", new Date()));
        CatHouse.add(AnimalFactory.createCat("Oliver", new Date()));

        // When Lilly cat removed from Cat House
        int numberOfCats = CatHouse.getNumberOfCats();

        // Then No cat lives in CatHouse
        Assert.assertEquals(numberOfCats, 3);
    }

    @Test
    public void testNumberOfCats_no_cat_in_house() {

        // Given No Cats are added

        // When Lilly cat removed from Cat House
        int numberOfCats = CatHouse.getNumberOfCats();

        // Then No cat lives in CatHouse
        Assert.assertEquals(numberOfCats, 0);
    }

    @Test
    public void testGteById_add_three_cats_get_id_1() {

        CatHouse.add(AnimalFactory.createCat("Milo", new Date()));
        Cat expectedCat = AnimalFactory.createCat("Lilly", new Date());
        CatHouse.add(expectedCat);
        CatHouse.add(AnimalFactory.createCat("Oliver", new Date()));

        Cat actualCat = CatHouse.getCatById(1);

        Assert.assertEquals(expectedCat, actualCat);
    }
}
