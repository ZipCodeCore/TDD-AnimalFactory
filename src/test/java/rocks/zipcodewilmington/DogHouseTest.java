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

    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void addDogTest() {
        //Given *
        Dog jack = new Dog("Jack", new Date(), 50);
        //When
        DogHouse.add(jack);
        Dog retrievedDog = DogHouse.getDogById(50);
        //Then
        Assert.assertEquals(jack, retrievedDog);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest() {
        //Given *
        Dog lola = new Dog("Lola", new Date(), 25);
        Dog mimi = new Dog("Mimi", new Date(), 12);
        //When
        DogHouse.add(lola);
        DogHouse.add(mimi);
        DogHouse.remove(12);
        Dog removedDog = DogHouse.getDogById(12);
        //Then
        Assert.assertNull (removedDog);
    }

    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeByDogTest() {
        //Given*
        Dog jerry = new Dog("Jerry", new Date(), 10);
        Dog kiko = new Dog("Kiko", new Date(), 11);
        //When
        DogHouse.add(jerry);
        DogHouse.add(kiko);
        DogHouse.remove(jerry);
        Dog removedDog = DogHouse.getDogById(10);
        //Then
        Assert.assertNull(removedDog);
    }

    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){
        //Given*
        Dog nikki = new Dog("Nikki", new Date(), 13);
        Dog coco = new Dog("Coco", new Date(), 14);
        //When
        DogHouse.add(nikki);
        DogHouse.add(coco);
        Dog retrievedDog = DogHouse.getDogById(13);
        //Then
        Assert.assertEquals(retrievedDog, nikki);
    }

    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumOfDogsTest(){
        //Given*
        DogHouse.clear();
        Dog Tbone = new Dog("Tbone", new Date(), 21);
        Dog chocolate = new Dog("Chocolate", new Date(), 22);
        //When
        DogHouse.add(Tbone);
        DogHouse.add(chocolate);
        Integer expectedNumOfDogs = 2;
        Integer retrievedNumOfDogs = DogHouse.getNumberOfDogs();
        //Then
        Assert.assertEquals(expectedNumOfDogs, retrievedNumOfDogs, 0);
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given
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
