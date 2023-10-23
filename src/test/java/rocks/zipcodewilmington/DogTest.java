package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

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
    public void mammalInstanceTest(){
        Dog dog = new Dog("Glorp", new Date(), 7);

        Boolean actual = dog instanceof Mammal;
        Boolean expected = true;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void animalInstanceTest(){
        Dog dog = new Dog("Cork", new Date(), 6);

        Boolean actual = dog instanceof Animal;
        Boolean expected = true;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void getIdTest(){
        Dog dog = new Dog("Darth", new Date(), 5);

        Integer actual = dog.getId();
        Integer expected = 5;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void eatTest(){
        Dog dog = new Dog("Darth", new Date(), 4);

        Food food = new Food("Spaghetti", true);
        dog.eat(food);

        Integer actual = dog.getNumberOfMealsEaten();
        Integer expected = 1;

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void setBirthDateTest(){
        Dog dog = new Dog("Gabbie", new Date(), 3);

        Date expected = new GregorianCalendar(2011, Calendar.MARCH, 11).getTime();
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog("Gabbie", new Date(), 2);

        String actual = dog.speak();
        String expected = "bark";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void newDog(){
        Dog dog = new Dog("Pank", new Date(), 1);

        DogHouse.add(dog);

        Integer actual = DogHouse.getNumberOfDogs();
        Integer expected = 1;

        Assert.assertEquals(expected, actual);
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
