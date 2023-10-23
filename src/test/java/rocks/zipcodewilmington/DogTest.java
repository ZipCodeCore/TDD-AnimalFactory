package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

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
    public void test_new_dog() {
        Dog d = new Dog("Tom", new Date(), 1);
        d.setName("Tom");
        Assert.assertEquals("Tom", d.getName());

    }

    @Test
    public void test_speak() {
        Dog d = new Dog("Tom", new Date(), 2);
        String dd = d.speak();
        Assert.assertEquals("bark!", dd);
    }

    @Test
    public void test_set_DateOfBirth() {
        Dog d = new Dog("Tom", new Date(), 2);
        Date e = new Date();
        d.setBirthDate(e);
        Assert.assertEquals(e, d.getBirthDate());
    }

    @Test
    public void test_eat() {
        Dog d = new Dog("Tom", new Date(), 2);
        Food food = new Food();
        d.eat(food);
        Assert.assertEquals(new Integer(1), d.getNumberOfMealsEaten());
    }

    @Test
    public void test_getId() {

        Dog d = new Dog("Tom", new Date(), 2);
        d.getId();
        Assert.assertEquals(2, d.getId().intValue());
    }


    @Test
    public void animalTest() {
        Dog d = new Dog("doggy", new Date(), 2);
        Assert.assertEquals(true, d instanceof Animal);

    }

    @Test
    public void mammalTest() {
        Dog d = new Dog("doggy", new Date(), 2);
        Assert.assertEquals(true, d instanceof Mammal);
    }


}


