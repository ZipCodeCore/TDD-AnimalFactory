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
    @Test
    public void testAdd(){
        //Given
        DogHouse house = new DogHouse();
        Dog dog = new Dog("aaa", new Date(), 1);
        Integer expectedDogs = 1;

        //When
        house.add(dog);
        Integer actualDogs = house.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedDogs,actualDogs);

    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeById(){
        //Given
        DogHouse house = new DogHouse();
        Dog dog = new Dog("aaa", new Date(),1);
        Integer expectedDog = 0;
        house.add(dog);

        //
        house.remove(dog.getId());
        Integer actualDog = house.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDog(){
        //Given
        DogHouse house = new DogHouse();
        Dog dog = new Dog("aaa", new Date(),1);
        Integer expectedDog = 0;
        house.add(dog);

        //When
        house.remove(dog);
        Integer actualDog = house.getNumberOfDogs();

        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDog(){
        //Given
        DogHouse house = new DogHouse();
        Dog dog = new Dog("aaa",new Date(),1);
        house.add(dog);
        Dog expectedDog = dog;

        //When
        //house.getCatById(cat.getId());
        Dog actualDog = house.getDogById(dog.getId());

        //Then
        Assert.assertEquals(expectedDog, actualDog);
    }
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
}
