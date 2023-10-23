package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog() {
        //given
        String expectedName = "Clover";
        Date expectedBirthDate = new Date(2016-05-12);
        int expectedId = 0;
        //when
        Dog testDog = AnimalFactory.createDog(expectedName, expectedBirthDate);
        String actualName = testDog.getName();
        Date actualBirthDate = testDog.getBirthDate();
        int actualId = testDog.getId();
        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat() {
        //given
        String expectedName = "Jelly";
        Date expectedBirthDate = new Date(2014-04-14);
        int expectedId = 0;
        //when
        Cat testCat = AnimalFactory.createCat(expectedName, expectedBirthDate);
        String actualName = testCat.getName();
        Date actualBirthDate = testCat.getBirthDate();
        int actualId = testCat.getId();
        //then
        Assert.assertEquals(expectedId, actualId);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);
    }
}
