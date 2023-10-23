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
    @Test
    public void createDogTest(){
        //Given
        String givenName = "Hunter";
        Date givenDate = new Date();
        //When
        DogHouse.clear();
        Dog newDog = AnimalFactory.createDog(givenName, givenDate);
        //Then
        Assert.assertEquals(newDog.getName(), givenName);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest(){
        //Given
        String givenName = "Loki";
        Date givenDate = new Date();
        //When
        CatHouse.clear();
        Cat newCat = AnimalFactory.createCat(givenName, givenDate);
        //Then
        Assert.assertEquals(newCat.getName(), givenName);
    }
}
