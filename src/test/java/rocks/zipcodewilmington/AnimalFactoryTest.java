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
        String givenName = "Jafn";
        Date givenDate = new Date();

        Dog animal = AnimalFactory.createDog("Jafn", new Date());
        String actualName = animal.getName();
        Date actualDate = animal.getBirthDate();

        Assert.assertEquals(actualName, givenName);
        Assert.assertEquals(actualDate, givenDate);
    }

    @Test
    public void createCatTest() {
        String givenName = "Jacob";
        Date givenDate = new Date();

        Cat animal = AnimalFactory.createCat("Jacob", new Date());
        String actualName = animal.getName();
        Date actualDate = animal.getBirthDate();

        Assert.assertEquals(actualName, givenName);
        Assert.assertEquals(actualDate, givenDate);
    }

}
