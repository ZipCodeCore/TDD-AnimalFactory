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
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }


    @Test
    public void dogRemoveIdTest(){
        //given
        String dogName = "Milo";
        Date birthDay = new Date();
        Dog animal = AnimalFactory.createDog(dogName, birthDay);
        DogHouse.clear();


        //when

        Integer expected = 0;
        DogHouse.add(animal);
        DogHouse.remove(animal.getId());

        //then
        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    @Test
    public void removeDogTest(){
        //given
        String dogName = "Milo";
        Date birthDay = new Date();
        Dog animal  = AnimalFactory.createDog(dogName, birthDay);
        DogHouse.add(animal);
        //when
        DogHouse.remove(animal);

        //then
        int actNumbDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(0, actNumbDogs);
    }



    @Test
    public void getDogIdTest(){
        //given
        String dogName = "Milo";
        Date birthDay = new Date();
        Dog animal = AnimalFactory.createDog(dogName,birthDay);
        DogHouse.add(animal);
        Integer givenId = 0;
        DogHouse.clear();

        //when
        int actual = animal.getId();

        //then
        Assert.assertEquals(0, actual);

    }
}
