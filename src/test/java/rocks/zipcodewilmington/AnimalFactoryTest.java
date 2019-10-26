package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {

    @Before
    public void setup() throws Exception{}

    @After
    public void tearDown() {}

    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`

    @Test
    public void testCreateDog(){
        AnimalFactory testFactoryDog = new AnimalFactory();
        Dog testDog = testFactoryDog.createDog("Scully", new Date(20012304));

        String expectedName = "Scully";
        String actualName = testDog.getName();

        Date expectedDate = new Date(20012304);
        Date actualDate = testDog.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);

    }


    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateCat(){
        AnimalFactory testFactoryCat = new AnimalFactory();
        Cat testCat = testFactoryCat.createCat("Francis", new Date(20040601));

        String expectedName = "Francis";
        String actualName = testCat.getName();

        Date expectedDate = new Date(20040601);
        Date actualDate = testCat.getBirthDate();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedDate, actualDate);
    }
}
