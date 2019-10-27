package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void createDogTest() {
        String name = "Bobby";
        Dog testDog = AnimalFactory.createDog(name, null);

        Assert.assertTrue(testDog instanceof Dog);
    }

    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    public void createCatTest() {
        String name = "Tiger";
        Cat testCat = AnimalFactory.createCat(name, null);

        Assert.assertTrue(testCat instanceof Cat);
    }



}
