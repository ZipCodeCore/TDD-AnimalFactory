package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        Dog myDog = AnimalFactory.createDog("Doggo", new Date());
        boolean actual = myDog instanceof Dog;
        boolean expected = true;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCatTest() {
        Cat myCat = AnimalFactory.createCat("BIGGS", new Date());

        Assert.assertNotNull(myCat);

    }


}
