package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {


        // TODO - Create tests for `void add(Cat cat)`
        @Test
        public void addDogTest() {
            Dog dog = new Dog("Her", new Date(), 2);
            DogHouse.add(new Dog("Jim", new Date(), 0));
            DogHouse.add(new Dog("Him", new Date(), 1));
            Integer expected = DogHouse.getNumberOfDogs() + 1;
            DogHouse.add(dog);

            Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
        }
        @Test
        public void removeDogTest(){
            Dog dog = new Dog("Her", new Date(), 2);
            DogHouse.add(new Dog("Jim", new Date(), 0));
            DogHouse.add(dog);
            Integer expected = DogHouse.getNumberOfDogs()-1;
            DogHouse.remove(dog);

            Assert.assertEquals(expected, DogHouse.getNumberOfDogs());
        }


        @Test
        public void getDogByIdTest(){

            Dog dog = new Dog("Ay", new Date(), 2);

            DogHouse.add(dog);

            Assert.assertEquals(dog, DogHouse.getDogById(dog.getId()));
        }


        @Test
        public void removeDogByIdTest(){
        Dog dog = new Dog("Ay", new Date(), 2);
        DogHouse.add(dog);
        DogHouse.remove(dog.getId());
        Assert.assertEquals(null, DogHouse.getDogById(dog.getId()));
        }






        // TODO - Create tests for `Integer getNumberOfCats()`
        @Test
        public void getNumberOfDogsTest() {

            DogHouse.clear();
            DogHouse.add(new Dog("Ay", new Date(), 0));
            DogHouse.add(new Dog("Bee", new Date(), 1));

            int expected = DogHouse.getNumberOfDogs();

            Assert.assertEquals(expected, 2);
        }
    }
