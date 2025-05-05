package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void createDogTest(){
        //given
        String name = "";
        Date birthDate = new Date();
        Integer id = 1;

        //when
        Dog dog = new Dog(name, birthDate, id);

        //then
        Assert.assertEquals(name, dog.getName());
        Assert.assertEquals(birthDate, dog.getBirthDate());
        Assert.assertEquals(id, dog.getId());
    }
    @Test
    public void createCatTest(){
        //given
        String name = "";
        Date birthDate = new Date();
        Integer id = 1;

        //when
        Cat cat = new Cat(name, birthDate, id);

        //then
        Assert.assertEquals(name, cat.getName());
        Assert.assertEquals(birthDate, cat.getBirthDate());
        Assert.assertEquals(id, cat.getId());
    }

}
