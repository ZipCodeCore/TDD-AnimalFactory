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
    public void createDogTest() {
        //Given
        String givenName = "Slinky";
        Date givenBirthDate = new Date();

        //When
        Dog dogTest = AnimalFactory.createDog(givenName, givenBirthDate);
        DogHouse.add((Dog) dogTest);

        //Then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, actual);
    }







    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createCatTest() {
        //Given
        String givenName = "Tom";
        Date givenBirthDate = new Date();

        //When
        Cat catTest = AnimalFactory.createCat(givenName, givenBirthDate);
        CatHouse.add((Cat) catTest);

        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, actual);

    }
}
