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
    public void addCatTest() {
        Cat cat = new Cat("Him", new Date(), 2);
        CatHouse.add(new Cat("Jim", new Date(), 0));
        CatHouse.add(new Cat("Him", new Date(), 1));
        Integer expected = CatHouse.getNumberOfCats() + 1;
        CatHouse.add(cat);

        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }
    @Test
    public void removeCatTest(){
        Cat cat = new Cat("Him", new Date(), 2);
        CatHouse.add(new Cat("Jim", new Date(), 0));
        CatHouse.add(new Cat("Him", new Date(), 1));
        CatHouse.add(cat);
        Integer expected = CatHouse.getNumberOfCats() - 1;
        CatHouse.remove(cat);
        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

        @Test
        public void getCatByIdTest(){

            Cat cat = new Cat("Ay", new Date(), 2);
            CatHouse.add(new Cat("Bee", new Date(), 0));
            CatHouse.add(new Cat("Bee", new Date(), 1));
            CatHouse.add(cat);

            Assert.assertEquals(cat, CatHouse.getCatById(cat.getId()));
        }


    @Test
    public void removeCatByIdTest() {

            Cat cat = new Cat("Ay", new Date(), 2);
            CatHouse.add(cat);
            CatHouse.remove(cat.getId());
            Assert.assertEquals(null, CatHouse.getCatById(cat.getId()));
    }






    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCatsTest() {

        CatHouse.clear();
        CatHouse.add(new Cat("Ay", new Date(), 0));
        CatHouse.add(new Cat("Bee", new Date(), 1));

        int expected = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, 2);
    }
}


