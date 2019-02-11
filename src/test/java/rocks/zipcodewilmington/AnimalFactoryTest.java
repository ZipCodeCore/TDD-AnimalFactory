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
    public void constructorDogTest() {
        // Given (dog data)
        String dogName = "Zues";
        Date bdate = new Date(1);


        // When (a dog is constructed)
        AnimalFactory animal = new AnimalFactory();
        Dog dog = animal.createDog(dogName, bdate);


        // When
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(dogName, retrievedName);
        Assert.assertEquals(bdate, retrievedBirthDate);
    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void constructorCatTest() {
        // Given (dog data)
        String catName = "flipper";
        Date bdate = new Date(99);


        // When (a cat is constructed)
        AnimalFactory animal = new AnimalFactory();
        Cat cat = animal.createCat(catName, bdate);


        // When
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(catName, retrievedName);
        Assert.assertEquals(bdate, retrievedBirthDate);
    }

}
