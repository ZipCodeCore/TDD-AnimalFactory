package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    @Test
    public void TestNewDog() throws ParseException {
        //given
        String expectedName="naai";
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date expectedDate =dateFormat.parse("02/02/2018");
        Integer expectedId=0;
        //when
        Dog dog=new Dog(expectedName,expectedDate,expectedId);

        //then
        Assert.assertEquals(expectedName,dog.getName());
        Assert.assertEquals(expectedDate,dog.getBirthDate());
        Assert.assertEquals(expectedId,dog.getId());
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
    @Test
    public void testSpeak(){
        //given
        String expected="bark!";
        //when
        Dog dog = new Dog(null,null,null);
        //then
        Assert.assertEquals(expected,dog.speak());
    }

    @Test
    public void testIntegerGetId(){
        //given
        Dog dog = new Dog(null,null,null);
        int expectedId = 1;
        //when

        //then
        Assert.assertEquals(expectedId,);
    }
}
