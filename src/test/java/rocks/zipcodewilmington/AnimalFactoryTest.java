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
    @Test
    public void createDogTest(){
        String expectedName = "";
        Date expectedDate = new Date();
        Dog actualDog = AnimalFactory.createDog(expectedName, expectedDate);
        String actualName = actualDog.getName();
        Date actualBirthdate = actualDog.getBirthDate();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualBirthdate);
    }
    @Test
    public void creatCatTest(){
        String expectedName = "";
        Date expectedDate = new Date();
        Cat actualCat = AnimalFactory.createCat(expectedName, expectedDate);
        String actualName = actualCat.getName();
        Date actualBirthdate = actualCat.getBirthDate();
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualBirthdate);
    }

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
}
