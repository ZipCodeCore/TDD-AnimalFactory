package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
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
    public void addDogTest(){
        //given
        Dog createdDog = AnimalFactory.createDog("Busta", null);



        //when
        DogHouse.add(createdDog);
        int actual = DogHouse.getNumberOfDogs();

        //then
        Assert.assertEquals(1, actual);

    }

    @Test
    public void removeIntegerDogTest(){
        //given
        Dog createdDog = new Dog("Marshall", null, 0);
        Dog createdDog2 = new Dog("Wiggles", null, 2);
        Dog creaatedDog3 = new Dog("Lego", null, 3);


        //when
        DogHouse.add(createdDog);
        DogHouse.add(createdDog2);
        DogHouse.add(creaatedDog3);
        DogHouse.remove(0);

        //then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(2, actual);


    }

    @Test
    public void getDogIdTest(){
        //given
        Dog createdDog = new Dog("Marshall", null, 0);
        Dog createdDog2 = new Dog("Wiggles", null, 2);
        Dog creaatedDog3 = new Dog("Lego", null, 3);


        //when
        DogHouse.add(createdDog);
        DogHouse.add(createdDog2);
        DogHouse.add(creaatedDog3);
        DogHouse.remove(0);

        //then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(2, actual);
        Dog actualDog = DogHouse.getDogById(2);
        Assert.assertEquals(createdDog2, actualDog);
    }

    @Test
    public void removeDogNameTest(){
        //given
        Dog createdDog = new Dog("Marshall", null, 0);
        Dog createdDog2 = new Dog("Wiggles", null, 2);
        Dog creaatedDog3 = new Dog("Lego", null, 3);


        //when
        DogHouse.add(createdDog);
        DogHouse.add(createdDog2);
        DogHouse.add(creaatedDog3);
        DogHouse.remove(createdDog);

        //then
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(2, actual);
        Dog actualDog = DogHouse.getDogById(2);
        Assert.assertEquals(createdDog2, actualDog);
    }
}
