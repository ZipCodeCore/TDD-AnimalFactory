package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Calendar;
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
        Date expectedBirthDate = new Date(2000, Calendar.MAY,4);
        //should this be type animal?
        //when
        Dog newDog = AnimalFactory.createDog(expectedName,expectedBirthDate);
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
        Date expectedBirthDate = new Date(2019, Calendar.APRIL,8);
        //when
        Cat newCat =  AnimalFactory.createCat(expectedName,expectedBirthDate);
        String actualName = newCat.getName();
        Date actualBirthDate = newCat.getBirthDate();
        //then
        Assert.assertEquals(expectedBirthDate,actualBirthDate);
        Assert.assertEquals(expectedName,actualName);

    }
}
