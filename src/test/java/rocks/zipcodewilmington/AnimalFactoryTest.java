package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
       public void createDogTest() {
        Dog dog = AnimalFactory.createDog("Milo", new Date(1234));
        Assert.assertTrue(dog instanceof Dog);
    }
    @Test
        public void createCatTest() {
        Cat cat = AnimalFactory.createCat("Kitty", new Date(1234));
        Assert.assertTrue(cat instanceof Cat);
    }
}
