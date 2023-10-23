package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
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
        public void setNameTest() {
            // Given Cat object with name chopper
            Cat c = new Cat("Kitty", new Date(), 1);
            // When I change the name to gimme
            c.setName("gimme");
            // Then name should be changed to gimmy
            Assert.assertEquals("gimme", c.getName());
        }

        @Test
        public void speakTest()  {
            //given
            Cat c = new Cat("cuper", new Date(), 1);
            //when
            String s = c.speak();
            //then
            Assert.assertEquals("meow!",s);

        }


        @Test
        public void setBirthDateTest() {
            //given
            Cat c = new Cat("sweety", new Date(),3);
            //when
            Date d = new Date();
            c.setBirthDate(d);
            //Then
            Assert.assertEquals(d,c.getBirthDate());


        }

        @Test
        public void eatTest() {
            Cat c = new Cat("rocky", new Date(),3);
            Food f = new Food();
            c.eat(f);
            Assert.assertEquals(new Integer(1),c.getNumberOfMealsEaten());

        }


        @Test public void getIDTest() {
            //Given
            Cat c = new Cat("rocky", new Date(),4);
            //When
            c.getId();
            //Then
            Assert.assertEquals(4, c.getId().intValue());

        }


        @Test
        public void animalTest() {

            Cat d = new Cat("rocky", new Date(),4);

            Assert.assertEquals(true, d instanceof Animal);
        }


       @Test
        public void animalInstance() {
            Cat ca = new Cat("rocky", new Date(),4);
            Assert.assertEquals(true, ca instanceof Mammal);
        }


    }
