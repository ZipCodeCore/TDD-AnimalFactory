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
        // given
        String givenName = "Clifford";
        Date givenDob = new Date();
        Dog dog = AnimalFactory.createDog(givenName, givenDob);




    //when
    String getNameResult = dog.getName();
    Date getBirthResult = dog.getBirthDate();

    //Then
        Assert.assertEquals(givenName, getNameResult);
        Assert.assertEquals(givenDob, getBirthResult);

}

    @Test
    public void createCatTest(){
        //given
        String givenName = "Garfield";
        Date givenDob = new Date();


        //when
        Cat cat = AnimalFactory.createCat(givenName, givenDob);
        String getNameResult = cat.getName();
        Date getBirthResult = cat.getBirthDate();

        //Then
        Assert.assertEquals(givenName, getNameResult);
        Assert.assertEquals(givenDob, getBirthResult);
    }


}
