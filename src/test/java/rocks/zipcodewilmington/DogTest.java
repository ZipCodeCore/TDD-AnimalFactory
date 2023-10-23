package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
        public void newDogTest(){
        //given
        String givenName = "Bingo";
        Date dob=new Date(1999,11,5);
        Integer expectedId=15;
        //when
        Dog dog=new Dog(givenName,dob,expectedId);
        Integer actualid=dog.getId();
        Assert.assertEquals(expectedId,actualid);
    }
    // TODO - Create tests for `speak`
    @Test
        public void testSpeak() {
        //given
        String expectedValue = "bark!";
        Date dob = new Date(2020, 11, 5);
        //when
        Dog mydog = new Dog("kanaka", dob, 23);
        //then
        String actualValue = mydog.speak();
        Assert.assertEquals(expectedValue,actualValue);
    }
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
        public void testSetBirthDate(){
        //given
        Date expectedDOB=new Date(2020,12,31);
        Date someDateValue= new Date(2021,07,01);
        //when
        Dog myDog=new Dog("Tupusi",someDateValue,77);
        Date setDOB=new Date(2020,12,31);
        myDog.setBirthDate(setDOB);
        Date actualValue=myDog.getBirthDate();
        //then
        Assert.assertEquals(expectedDOB,actualValue);
    }
    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testEat(){
        //given
        Integer expectedValue=1;
        Date someDateValue= new Date(2021,07,01);
        Dog myDog=new Dog("Tupusi",someDateValue,77);
        //when
        Food catFood =new Food("Fish");
        myDog.eat(catFood);
        //then
        Integer actualValue=myDog.getNumberOfMealsEaten();
        Assert.assertEquals(expectedValue,actualValue);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void testGetId(){
        //given
        Integer expectedValue=77;
        //when
        Date someDateValue= new Date(2021,07,01);
        Dog myDog=new Dog("Tupusi",someDateValue,77);
        Integer actualValue= myDog.getId();
        Assert.assertEquals(expectedValue,actualValue);

    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceOfAnimal(){
        //given
        Boolean expectedValue=true;
        //when
        Date someDateValue= new Date(2021,07,01);
        Dog myDog=new Dog("Tupusi",someDateValue,77);
        Boolean actualValue=myDog instanceof Animal;
        Assert.assertEquals(expectedValue,actualValue);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testInstanceOfMammal(){
        //given
        Boolean expectedValue=true;
        //when
        Dog myDog = new Dog(null, null, null);
        Boolean actualValue=myDog instanceof Mammal;
        Assert.assertEquals(expectedValue,actualValue);
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
}
