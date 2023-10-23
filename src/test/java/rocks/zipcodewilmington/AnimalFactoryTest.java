package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Test
    public void testDog_name_cesar_id_0() {

        String dogName = "cesar";
        Dog cesar = AnimalFactory.createDog(dogName, new Date());
        DogHouse.add(cesar);
        Assert.assertEquals(cesar.getName(), dogName);
        Assert.assertEquals(cesar.getId(), new Integer(0));
    }

    @Test
    public void testDog_name_tommy_id_1() {

        String dogName = "tommy";
        Dog tommy = AnimalFactory.createDog(dogName, new Date());
        DogHouse.add(tommy);
        Assert.assertEquals(tommy.getName(), dogName);
        Assert.assertEquals(tommy.getId(), new Integer(1));
    }

    @Test
    public void testCat_name_x_id_0() {

        String dogName = "xcat";
        Cat xcat = AnimalFactory.createCat(dogName, new Date());
        CatHouse.add(xcat);
        Assert.assertEquals(xcat.getName(), dogName);
        Assert.assertEquals(xcat.getId(), new Integer(0));
    }

    @Test
    public void testCat_name_y_id_1() {

        String dogName = "ycat";
        Cat ycat = AnimalFactory.createCat(dogName, new Date());
        CatHouse.add(ycat);
        Assert.assertEquals(ycat.getName(), dogName);
        Assert.assertEquals(ycat.getId(), new Integer(1));
    }
}
