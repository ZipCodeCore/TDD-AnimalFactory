package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */

public class AnimalFactoryTest {

    @Test
    public void testCreateDog(){
        Date date = new Date();
        int id = 1;
        String name = "Jeff";

        Dog dog = new Dog(name, date, id);

        Date expectedDate = dog.getBirthDate();
        int expectedId = dog.getId();
        String expectedName = dog.getName();

        Assert.assertEquals(date, expectedDate);
        Assert.assertEquals(id, expectedId);
        Assert.assertEquals(name, expectedName);

    }

    @Test
    public void createCat(){
        Date date = new Date();
        int id = 1;
        String name = "Biggs";

        Cat cat = new Cat(name, date, id);

        Date expectedDate = cat.getBirthDate();
        int expectedId = cat.getId();
        String expectedName = cat.getName();

        Assert.assertEquals(date, expectedDate);
        Assert.assertEquals(id, expectedId);
        Assert.assertEquals(name, expectedName);
    }
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

}



