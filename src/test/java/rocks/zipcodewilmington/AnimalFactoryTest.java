package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
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
    public void createDogTest(){
        // Creates new Dog
        Date birthDate = new Date();
        Dog dog = AnimalFactory.createDog("Pancho",birthDate);

        // test
        Assert.assertEquals(dog.getBirthDate(),birthDate);
        Assert.assertEquals(dog.getName(),"Pancho");
    }

    @Test
    public void createCatTest() {
        // Creates new Dog
        Date birthDate = new Date();
        Cat cat = AnimalFactory.createCat("Nina", birthDate);

        // test
        Assert.assertEquals(cat.getBirthDate(), birthDate);
        Assert.assertEquals(cat.getName(), "Nina");
    }
}
