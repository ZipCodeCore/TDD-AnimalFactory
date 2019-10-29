package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // Done TODO - Create tests for `void add(Dog dog)`
    // Done TODO - Create tests for `void remove(Integer id)`
    // Done TODO - Create tests for `void remove(Dog dog)`
    // Done TODO - Create tests for `Dog getDogById(Integer id)`
    // Done TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void getNumberOfDogs(){
        //Given
        DogHouse.clear();
        Dog returnDog = new Dog(null, null, 48);
        DogHouse.add(returnDog);
        Dog returnDog2 = new Dog(null, null, 49);
        DogHouse.add(returnDog2);

        Integer expected = 2;//expected
        DogHouse.getNumberOfDogs();//actual


        Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
    }

    @Test
    public void addDog(){
        //Given
        DogHouse.clear();
        Dog returnDog = new Dog(null, null, 48);
        Dog expected = returnDog;

        //When
        DogHouse.add(returnDog);

        //Then
        Dog actual = DogHouse.getDogById(48);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogID() {

        //Given
        DogHouse.clear();
        Dog returnDog = new Dog(null, null, 48);
        Dog expected = returnDog;
        DogHouse.add(returnDog);

        //When
        Dog actual = DogHouse.getDogById(48);

        //Then
        Assert.assertEquals(expected, actual);


    }


    @Test
    public void removeByDog(){
        //Given
        Dog dog = new Dog(null, null , 23);

        //When
        DogHouse.remove(dog);

        //Then
       DogHouse.getDogById(23);

    }


    @Test
    public void removeByID(){
        //Given
        Dog dog = new Dog(null, null , 1);

        //When
        DogHouse.remove(1);

        //Then
        DogHouse.getDogById(1);


    }
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
}
