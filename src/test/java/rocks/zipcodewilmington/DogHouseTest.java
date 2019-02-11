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
    public void testAdd(){
        // Given
        String expectedName = "fido";
        Date expectedBd = new Date(1);
        Integer expectedCountOfObjects = 1;

        Dog animalTest = AnimalFactory.createDog(expectedName,expectedBd);
        DogHouse.clear();

        // when
        DogHouse.add(animalTest);

        // then
        Integer actualCountOfObjects = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedCountOfObjects,actualCountOfObjects);


    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void testRemoveById() {
        
    }

    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Integer total = 1;
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        Integer actualCount = DogHouse.getNumberOfDogs();
        Assert.assertEquals(total,actualCount);


    }
}
