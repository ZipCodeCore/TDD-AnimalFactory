package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    @Test
    public void newDogTest() {
        Dog dog = new Dog("FireDog", new Date(), 21312);
        boolean actual = dog instanceof Dog;
        boolean expected = true;

       // Assert.assertNotNull(dog);

      Assert.assertEquals(expected, actual);

//        public void createDogTest() {
//            Dog myDog = AnimalFactory.createDog("Doggo", new Date());
//            boolean actual = myDog instanceof Dog;
//            boolean expected = true;
//
//            Assert.assertEquals(expected, actual);
//        }

//        @Test
//        public void createCatTest() {
//            Cat myCat = AnimalFactory.createCat("BIGGS", new Date());
//
//            Assert.assertNotNull(myCat);
        }

    // TODO - Create tests for `speak`
    @Test
    public void speakTest() {
        Dog dog = new Dog("IceDog", new Date(), 433);
        String actual = dog.speak();
        String expected = "bark!";

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDateTest() {
        Dog dog = AnimalFactory.createDog("MeltDog", new Date(01-1-2001));
        Date expected = new Date(01-1-2001);

         Date actual = dog.getBirthDate();


        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest() {
        Food food = new Food();
        Dog dog = new Dog("McDog", new Date(), 231);

        dog.eat(food);
        Integer actual = dog.getNumberOfMealsEaten();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIdTest() {
        Dog dog = new Dog("WarmDog", new Date(), 88);

        Integer expected = 88;
        Integer actual = dog.getId();

        Assert.assertEquals(expected, actual);
    }

    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void animalTest(){
        Dog dog = new Dog("HotDog", new Date(), 6);

        Assert.assertTrue(dog instanceof Animal);
    }

    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void mammalTest() {
        Dog dog = AnimalFactory.createDog("ColdDog",new Date());

        Assert.assertTrue(dog instanceof Mammal);
    }


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
