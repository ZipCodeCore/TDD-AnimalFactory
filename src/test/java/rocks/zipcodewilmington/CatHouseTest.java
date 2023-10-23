package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    // TODO - Create tests for `void add(Cat cat)`

    @Test
    public void addCatTest() {
        //Given
        Cat addCat = AnimalFactory.createCat("Mr.Bigglesworth", null);

        //When
        CatHouse.add(addCat);
        int actual = CatHouse.getNumberOfCats();

        //Then
        Assert.assertEquals(2, actual);
    }

    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void removeCatTest(){
        //Given
        Cat catToBeRemoved = new Cat("Luna", null, 1);

        //When
        CatHouse.remove(catToBeRemoved);


        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void removeIntegerCatTest(){
        //Given
        CatHouse catHouse = new CatHouse();

        //When
        catHouse.remove(1);


        //Then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(1, actual);
    }

    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void getCatByIdTest() {
        //Given
        Cat catId = new Cat ("Chaco", null, 0);

        //When
        Integer actual = catId.getId();
        Integer expected = 0;

        //Then
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Fluffy";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }




} // final brace
