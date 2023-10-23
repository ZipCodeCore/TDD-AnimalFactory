package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

@Before
    public void setup() {
}

@After
    public void tearDown()  {
}

@Test
    public void testCreateDog() {
    Dog dog1 = AnimalFactory.createDog("spot", new Date(1));
    String expected1 = "spot";
    Date expected2 = new Date(1);
    String actual1 = dog1.getName();
    Date actual2 = dog1.getBirthDate();
    Assert.assertEquals(expected1, actual1);
    Assert.assertEquals(expected2, actual2);
}

@Test
    public void testCreateCat() {
    Cat cat2 = AnimalFactory.createCat("fido", new Date(1));
    String expected1 = "fido";
    Date expected2 = new Date(1);
    String actual1 = cat2.getName();
    Date actual2 = cat2.getBirthDate();
    Assert.assertEquals(expected1, actual1);
    Assert.assertEquals(expected2, actual2);
}





}