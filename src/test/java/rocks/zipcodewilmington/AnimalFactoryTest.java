package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`



    @Test
    public void createCat(){
        //GIVEN
        String nombre = "carlos";
        Date givenBirthDate = new Date();
        Integer id = 0;
        DogHouse.clear();
        //WHEN
        Cat cat = AnimalFactory.createCat(nombre, givenBirthDate);
        //THEN
        Assert.assertEquals(nombre, cat.getName());
    }

    @Test
    public void creatDog(){
        //GIVEN
        String nombre = "mikey";
        Date givenBirthDate = new Date();
        Integer id = 0;
        DogHouse.clear();
        //WHEN

        Dog dog  = AnimalFactory.createDog("mikey", null);

        //THEN
        Assert.assertEquals(nombre, dog.getName());
    }


}

