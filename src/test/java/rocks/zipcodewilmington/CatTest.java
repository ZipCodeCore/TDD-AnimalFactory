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
   public void setNameTest(){

       String expected = "Gatito";

       Cat cat = new Cat("Gatito");
       //cat.setName(expected);
       String actual = cat.getName();

       Assert.assertEquals(expected,actual);       //actual es el given
   }




    @Test
    public void speakTest() {
        String expected = "meow!";

        Cat cat = new Cat(null, null, null);
        cat.speak();

        String actual = cat.speak();
        //THEN
        Assert.assertEquals(expected, actual);
    }

        @Test
public void setBirthDate(){
    Date expBirthDate = new Date(21-2-2001); // still pass if nada adentro en los parameters.

    Cat cat = new Cat("gato", expBirthDate, 0); // still pass if pu null for all 3.
    cat.setBirthDate(expBirthDate);

    Date actualBirthDate = cat.getBirthDate();
    Assert.assertEquals(expBirthDate, actualBirthDate);

}

@Test // es igual q set name test
public void setNamesTest(){
//GIVEN
    String givenName = "Zula";
    Date givenBirthDate = new Date();
    Integer givenId = 0;

    //WHEN
    String expected = "cheese";
    Cat cat = new Cat(null, null,null);
    cat.setName(expected);
    String actual = cat.getName();

    //THEN
    Assert.assertEquals(expected, actual);
}

    @Test
    public void eatTest() {
        int expected = 0;


        Cat cat = new Cat(null, null, null);
        Food food = new Food();
        int actual = cat.getNumberOfMealsEaten();
        cat.eat(food);

        Assert.assertEquals(expected, actual);
    }


@Test
public void getId() {
    int expected = 0;

    Cat cat = new Cat(null, null, 0);
    int actual = cat.getId();

    Assert.assertEquals(expected, actual);

}


@Test
public void animalInheritanceTest (){
    //given
    String givenName = "CARROTS";
    Date givenBirthDate = new Date();
    Integer givenId = 0;

    //when
    Cat cat = new Cat(null, null, 0);
    boolean expected = true;
    boolean actual = cat instanceof Animal;
    //then
    Assert.assertEquals(expected, actual);
}

@Test
    public void mammalInheritanceTest(){
    String givenName = "CARROTS";
    Date givenBirthDate = new Date();
    Integer givenId = 0;

    //when
    Cat cat = new Cat(null, null, 0);
    boolean expected = true;
    boolean actual = cat instanceof Mammal;
    //then
    Assert.assertEquals(expected, actual);
}

}





