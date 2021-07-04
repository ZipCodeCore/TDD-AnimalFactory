package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    @Test
    public void testCreateDog(){
        //given
        String expectedName="Bingo";
        Date dob=new Date();
        //when
        Dog newDog=AnimalFactory.createDog(expectedName,dob);
        //then
        String actualName=newDog.getName();
        Assert.assertEquals(expectedName,actualName);
    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat(){
        //given
        String expectedName="Phula";
        Date dob=new Date();
        //when
        Cat newCat=AnimalFactory.createCat(expectedName,dob);
        //then
        String actualName=newCat.getName();
        Assert.assertEquals(expectedName,actualName);
    }

}
