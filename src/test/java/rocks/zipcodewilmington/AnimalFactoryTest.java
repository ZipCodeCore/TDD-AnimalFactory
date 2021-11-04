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
    @Test
    public void testCreateDog(){
        //given
        String expectedName = "Samantha";
        Date expectedBirthDate = new Date(2000,4,4);
        //should this be type animal?
        Dog newDog = AnimalFactory.createDog(expectedName,expectedBirthDate);
        //when
        String actualName = newDog.getName();
        Date actualBirthDate = newDog.getBirthDate();
        //then
        Assert.assertEquals(expectedBirthDate,actualBirthDate);
        Assert.assertEquals(expectedName,actualName);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat(){
        //given
        String expectedName = "Rutherford";
        Date expectedBirthDate = new Date(2019,3,8);
        Cat newCat =  AnimalFactory.createCat(expectedName,expectedBirthDate);
        //when
        String actualName = newCat.getName();
        Date actualBirthDate = newCat.getBirthDate();
        //then
        Assert.assertEquals(expectedBirthDate,actualBirthDate);
        Assert.assertEquals(expectedName,actualName);

    }
}
