package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDogTest(){
        // Given
        String givenName = "Mochi";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        DogHouse.clear();
        Dog dog = AnimalFactory.createDog(givenName, givenBirthDate);


        // Then
        Assert.assertEquals(givenName, dog.getName());


    }


    @Test
    public void createCatTest(){
        // Given
        String givenName = "Garfield";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When
        CatHouse.clear();
        Cat cat = AnimalFactory.createCat(givenName, givenBirthDate);


        // Then
        Assert.assertEquals(givenName, cat.getName());


    }

}
