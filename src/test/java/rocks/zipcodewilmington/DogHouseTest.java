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
        //System.out.println(DogHouse.getNumberOfDogs());
    }


    @Test
    public void DogAddTest() {
        //GIVEN
        DogHouse.clear();

        //WHEN
        Dog doggo = AnimalFactory.createDog("ggg", null);
        DogHouse.add(doggo);
        int expected = 1;

        int actual = DogHouse.getNumberOfDogs();
        //THEN
        Assert.assertEquals(1, actual);


    }

    @Test
    public void DogRemoveTest() {
        //GIVEN
        DogHouse.clear();


        //WHEN
        Dog nodog = new Dog(null, null, null);
        DogHouse.add(nodog);
        DogHouse.remove(nodog);

        int actual = DogHouse.getNumberOfDogs();

        //THEN
        Assert.assertEquals(0, actual);

    }

    @Test
    public void removebyId() {
        //GIVEN
       DogHouse.clear();

        //WHEN
        Dog dog = new Dog(null, null, 0);
        DogHouse.add(dog);
        DogHouse.remove(dog.getId());
        int actual = dog.getId();
        //int expected = 0;

        //THEN
        Assert.assertEquals(0, actual);

    }

    @Test
    public void getNumberOfCats() {
        //GIVEN
        String givenName = "perro";
        Date givenBirthDate = new Date();
        Integer givenId = 6;
        Dog dog = new Dog("perro", null, 6); //tambien works w/ givenName, givenBirthDate...
        DogHouse.add(dog);

        //WHEN
        Dog actual = DogHouse.getDogById(givenId);


        //THEN
        Assert.assertEquals(dog, actual);


    }
}









