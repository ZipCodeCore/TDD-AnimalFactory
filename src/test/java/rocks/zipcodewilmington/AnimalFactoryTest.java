package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void testCreateDog() throws ParseException {
        //given

        AnimalFactory animalFactory = new AnimalFactory();
        String expected ="karadi";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = dateFormat.parse("02/01/2010");
        //when
        Dog dog = animalFactory.createDog(expected ,date);
        //Then
        Assert.assertEquals(expected,dog.getName());
    }

    @Test
    public void testCreateCat() throws ParseException {
        AnimalFactory animalFactory = new AnimalFactory();
        String expected ="gundus";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date date = dateFormat.parse("02/01/2010");
        //when
        Cat cat = animalFactory.createCat(expected, date);
        //Then
        Assert.assertEquals(expected,cat.getName());
    }



}
