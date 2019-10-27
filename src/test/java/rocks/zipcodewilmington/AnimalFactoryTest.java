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
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`


    @Test
    public void createDogTest(){
        String givenName = "Tom";
        Date givenBirthDate = new Date();
        Dog Tommy = AnimalFactory.createDog(givenName , givenBirthDate);
        String actualName=Tommy.getName();
        Date actualDOB=Tommy.getBirthDate();
        Assert.assertEquals(actualName,givenName);
        Assert.assertEquals(actualDOB,givenBirthDate);
    }
    @Test
    public void createCatTest(){
        String givenName = "Jerry";
        Date givenBirthDate = new Date();
        Cat Jerry = AnimalFactory.createCat(givenName , givenBirthDate);
        String actualName=Jerry.getName();
        Date actualDOB=Jerry.getBirthDate();
        Assert.assertEquals(actualName,givenName);
        Assert.assertEquals(actualDOB,givenBirthDate);
    }

}
