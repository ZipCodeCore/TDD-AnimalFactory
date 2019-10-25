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
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createDog(){
        String name = "Milo";
        Date birthDate = new Date();

        Dog animal = AnimalFactory.createDog(name, birthDate);

        String expected = animal.getName();
        String actual = name;

        Assert.assertEquals(expected, actual);


    }

    @Test
    public void createCat(){
        String name = "Phelix";
        Date birthDate = new Date();

        Cat animal = AnimalFactory.createCat(name, birthDate);

        String expected = animal.getName();
        String actual = name;
        Assert.assertEquals(expected, actual);

    }
}
