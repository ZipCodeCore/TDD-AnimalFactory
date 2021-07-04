package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest() {
        //Given
        String expected = "Cora";
        Date date = new Date();
        //When
        Cat cat = new Cat(expected, date, 1);
        cat.setName(expected);
        //Then
        Assert.assertEquals(expected,cat.getName());


    }
    @Test
    public void speakTest(){
        //Given
        String expected = "meow!";
        //When
        Cat cat = new Cat(null, null , null);
        //Then
        Assert.assertEquals(expected, cat.speak());
    }

    @Test
    public void testSetBirthDate() throws ParseException {
        //given
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        Date expected = dateFormat.parse("02/01/2010");

        //when
        Cat cat=new Cat(null,null,null);
        cat.setBirthDate(expected);

        //then
        Assert.assertEquals(expected,cat.getBirthDate());
    }

    @Test
    public void testEat(){
        ArrayList<Food> eatenMeals = new ArrayList<>();
        Integer expected = 2;
        Food food = new Food();
        Cat cat= new Cat(null,null,null);
        cat.eat(food);
        cat.eat(food);

        Assert.assertEquals(expected,cat.getNumberOfMealsEaten());

    }

}
