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
    public void addTest1() {
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(new Dog("Wally", new Date(), null));
        int actual = dogHouse.getNumberOfDogs();
        int expected = 1;
        dogHouse.clear();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void addTest2() {
        DogHouse dogHouse = new DogHouse();
        for(int i = 0; i < 4; i++) {
            dogHouse.add(new Dog(null, null, null));
        }
        int actual = dogHouse.getNumberOfDogs();
        int expected = 4;
        dogHouse.clear();
        Assert.assertEquals(expected,actual);

    }
    @Test
    public void addTest3() {
        DogHouse dogHouse = new DogHouse();
        for(int i = 0; i < 3; i++) {
            dogHouse.add(new Dog(null, null, null));
        }
        int actual = dogHouse.getNumberOfDogs();
        int expected = 3;
        dogHouse.clear();
        Assert.assertEquals(expected,actual);
    }
    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void removeByIdTest1() {
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(new Dog(null, null, 42));
        dogHouse.remove(42);
        int actual = dogHouse.getNumberOfDogs();
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeByIdTest2() {
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(new Dog(null, null, 42));
        dogHouse.add(new Dog(null, null, 12));
        dogHouse.add(new Dog(null, null, 3));
        dogHouse.remove(3);
        int actual = dogHouse.getNumberOfDogs();
        int expected = 2;
        dogHouse.clear();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeByIdTest3() {
        DogHouse dogHouse = new DogHouse();
        dogHouse.add(new Dog(null, null, 1374));
        dogHouse.remove(1374);
        int actual = dogHouse.getNumberOfDogs();
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDogTest1() {
        DogHouse dogHouse = new DogHouse();
        dogHouse.clear();
        Dog dog = new Dog("Jake",null,null);
        dogHouse.add(dog);

        dogHouse.remove(dog);
        int actual = dogHouse.getNumberOfDogs();
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeDogTest2() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Mark",null,null);
        dogHouse.add(dog);
        dogHouse.add(dog);
        dogHouse.remove(dog);
        int actual = dogHouse.getNumberOfDogs();
        int expected = 1;
        dogHouse.clear();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void removeDogTest3() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Harry",null,null);
        dogHouse.add(dog);
        dogHouse.add(dog);
        dogHouse.add(dog);
        dogHouse.remove(dog);
        int actual = dogHouse.getNumberOfDogs();
        int expected = 2;
        dogHouse.clear();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest1() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Harry",null,32);
        dogHouse.add(dog);
        Dog actualDog = dogHouse.getDogById(32);
        String actual = actualDog.getName();
        String expected = "Harry";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getDogByIdTest2() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Greg",null,43);
        dogHouse.add(dog);
        Dog actualDog = dogHouse.getDogById(43);
        String actual = actualDog.getName();
        String expected = "Greg";
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void getDogByIdTest3() {
        DogHouse dogHouse = new DogHouse();
        Dog dog = new Dog("Dave",null,36);
        dogHouse.add(dog);
        Dog actualDog = dogHouse.getDogById(32);
        String actual = actualDog.getName();
        String expected = "Harry";
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs1() {
        // Given

        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        int actual = DogHouse.getNumberOfDogs();
        int expected = 1;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }
    @Test
    public void testGetNumberOfDogs2() {
        // Given
        String name = "Tucker";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        for(int i = 0; i < 2323; i++) {
            DogHouse.add(animal);
        }

        // Then
        int actual = DogHouse.getNumberOfDogs();
        int expected = 2323;
        Assert.assertEquals(expected, actual);
        DogHouse.clear();
    }
}
