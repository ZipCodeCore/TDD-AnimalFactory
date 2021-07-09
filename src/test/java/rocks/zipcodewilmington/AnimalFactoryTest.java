package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
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
    public void createAnimalTest(){
        //given
        String givenName = "Julie";
        Date givenBirthDate = new Date();


        //when
        Animal newCat = AnimalFactory.createCat(givenName, givenBirthDate);
        CatHouse.add((Cat) newCat);

        //then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, actual);
    }

    @Test
    public void createAnimalTest2(){
        //given
        String givenName = "James";
        Date givenBirthDate = new Date();


        //when
        Dog newCat = AnimalFactory.createDog(givenName, givenBirthDate);
        DogHouse.add((Dog) newCat); //guess I can name dog newCat if I want

        //then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(1, actual);
    }
}
