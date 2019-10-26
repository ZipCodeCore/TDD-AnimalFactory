package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
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
        Date expectedbirthDate = new Date(4);
        String expectedName = "Barfy";

        Dog testDog = AnimalFactory.createDog(expectedName,expectedbirthDate);

        Date actualbirthDate = testDog.getBirthDate();
        String actualName = testDog.getName();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedbirthDate,actualbirthDate);
    }

    @Test
    public void createCatTest(){
        Date expectedbirthDate = new Date(4);
        String expectedName = "Barfy";

        Cat testCat = AnimalFactory.createCat(expectedName,expectedbirthDate);

        Date actualbirthDate = testCat.getBirthDate();
        String actualName = testCat.getName();

        Assert.assertEquals(expectedName,actualName);
        Assert.assertEquals(expectedbirthDate,actualbirthDate);
    }
}
