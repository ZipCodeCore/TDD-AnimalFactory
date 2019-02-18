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
    @Test
    public void testCreateDog(){
    //Given
        String name = "Mocha";
        Date birthDate = new Date();
    //When
        Dog actualDog = AnimalFactory.createDog(name,birthDate);
    //Then
        Assert.assertEquals(name,actualDog.getName());
        Assert.assertEquals(birthDate,actualDog.getBirthDate());
    }



    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
        public void testCreateCat(){
            //Given
            String name = "Bailey";
            Date birthDate = new Date();
            //When
            Cat actualCat = AnimalFactory.createCat(name,birthDate);
            //Then
            Assert.assertEquals(name,actualCat.getName());
            Assert.assertEquals(birthDate,actualCat.getBirthDate());
        }

}
