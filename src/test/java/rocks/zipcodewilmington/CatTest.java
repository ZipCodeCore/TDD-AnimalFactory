package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testSetName()  {
        //given
        String expectedCatName="Phula";
        Date catDateOfBirth=new Date();
        System.out.println(catDateOfBirth);
        Integer catId=53;
        //when
        Cat myCat=new Cat(expectedCatName,catDateOfBirth,catId);
        //then
        myCat.setName("Phula");
        String actualCatName=myCat.getName();
        Assert.assertEquals(expectedCatName,actualCatName);
    }
    // TODO - Create tests for `speak`
    @Test
    public void testSpeak(){
        //given
        String expectedValue="meow!";
        Date dob=new Date(2020,11,5);
        //when
        Cat mycat=new Cat("kanaka",dob,23);
        //then
        String actualValue=mycat.speak();
        Assert.assertEquals(expectedValue,actualValue);

    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void testSetBirthDate(){
        //given
        Date expectedDOB=new Date(2020,12,31);
        Date someDateValue= new Date(2021,07,01);
        //when
        Cat myCat=new Cat("Tupusi",someDateValue,77);
        Date setDOB=new Date(2020,12,31);
        myCat.setBirthDate(setDOB);
        Date actualValue=myCat.getBirthDate();
        //then
        Assert.assertEquals(expectedDOB,actualValue);
    }
    // TODO - Create tests for `void eat(Food food)`
        @Test
        public void testEat(){
        //given
            Integer expectedValue=1;
            Date someDateValue= new Date(2021,07,01);
            Cat myCat=new Cat("Tupusi",someDateValue,77);
            //when
            Food catFood =new Food("Fish");
            myCat.eat(catFood);
            //then
            Integer actualValue=myCat.getNumberOfMealsEaten();
            Assert.assertEquals(expectedValue,actualValue);
        }
    // TODO - Create tests for `Integer getId()`
        @Test
        public void testGetId(){
            //given
            Integer expectedValue=77;
            //when
            Date someDateValue= new Date(2021,07,01);
            Cat myCat=new Cat("Tupusi",someDateValue,77);
            Integer actualValue= myCat.getId();
            Assert.assertEquals(expectedValue,actualValue);

        }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
        @Test
        public void testInstanceOfAnimal(){
            //given
            Boolean expectedValue=true;
            //when
            Date someDateValue= new Date(2021,07,01);
            Cat myCat=new Cat("Tupusi",someDateValue,77);
            Boolean actualValue=myCat instanceof Animal;
            Assert.assertEquals(expectedValue,actualValue);
        }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
        @Test
        public void testInstanceOfMammal(){
            //given
            Boolean expectedValue=true;
            //when
            Date someDateValue= new Date(2021,07,01);
            Cat myCat=new Cat("Tupusi",someDateValue,77);
            Boolean actualValue=myCat instanceof Mammal;
            Assert.assertEquals(expectedValue,actualValue);
        }


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

}
