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
    public  void testCreateDog(){
        //Given
        Dog dog = AnimalFactory.createDog("Fluffy", new Date(05-05-2021));
        String expectedName = "Fluffy";
        Date expectedBirthDate = new Date(05-05-2021);
      //When
        String actualName = dog.getName();
        Date actualBirthDate = dog.getBirthDate();
        //Then
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedBirthDate, actualBirthDate);

    }
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateCat(){
     //Given
     Cat cat = AnimalFactory.createCat("Milo", new Date(01-01-2019));
     String expectedName = "Milo";
     Date expectedDate = new Date(01-01-2019);
     //When
     String actualName = cat.getName();
     Date actualDate = cat.getBirthDate();
     //Then
      Assert.assertEquals(expectedName, actualName);
      Assert.assertEquals(expectedDate, actualDate);


    }

}
