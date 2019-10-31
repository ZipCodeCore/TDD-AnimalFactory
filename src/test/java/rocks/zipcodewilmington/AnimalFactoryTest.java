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
    @Test
    public void createDogTest1() {
        String name = "Bobert";
        Date birthDate = new Date();

        Dog dog = AnimalFactory.createDog(name, birthDate);
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);
    }
    @Test
    public void createDogTest2() {
        String name = "Sarah";
        Date birthDate = new Date();

        Dog dog = AnimalFactory.createDog(name, birthDate);
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);
    }
    @Test
    public void createCatTest1() {
        String name = "Boop";
        Date birthDate = new Date();

        Cat cat = AnimalFactory.createCat(name, birthDate);
        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);
    }
    @Test
    public void createCatTest2() {
        String name = "Lola";
        Date birthDate = new Date();

        Cat cat = AnimalFactory.createCat(name, birthDate);
        String actualName = cat.getName();
        Date actualBirthDate = cat.getBirthDate();

        Assert.assertEquals(name, actualName);
        Assert.assertEquals(birthDate, actualBirthDate);
    }
}
