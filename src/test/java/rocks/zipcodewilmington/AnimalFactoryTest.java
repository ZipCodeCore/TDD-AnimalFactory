package rocks.zipcodewilmington;

import org.junit.Test;
import org.junit.Assert;
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
    public void createDogTest() {
        String givenName = "Tucker";
        Date givenBirthDate = new Date(3);
        Integer expectedId = 0;
        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(expectedId, retrievedId);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        String givenName = "Mike";
        Date givenBirthDate = new Date(3);
        Integer expectedId = 0;
        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(expectedId, retrievedId);
    }
}
