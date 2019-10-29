package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.Cat;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void getNumberOfCats(){
        //Given
        CatHouse.clear();
        Cat returnCat = new Cat(null, null, 48);
        CatHouse.add(returnCat);
        Cat returnCat2 = new Cat(null, null, 49);
        CatHouse.add(returnCat2);

        Integer expected = 2;//expected
        CatHouse.getNumberOfCats();//actual


        Assert.assertEquals(expected, CatHouse.getNumberOfCats());
    }

    @Test
    public void addCat(){
        //Given
        CatHouse.clear();
        Cat returnCat = new Cat(null, null, 48);
        Cat expected = returnCat;

        //When
        CatHouse.add(returnCat);

        //Then
        Cat actual = CatHouse.getCatById(48);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatID() {

        //Given
        CatHouse.clear();
        Cat returnCat = new Cat(null, null, 48);
        Cat expected = returnCat;
        CatHouse.add(returnCat);

        //When
        Cat actual = CatHouse.getCatById(48);

        //Then
        Assert.assertEquals(expected, actual);


    }


    @Test
    public void removeByCat(){
        //Given
        Cat cat = new Cat(null, null , 23);

        //When
        CatHouse.remove(cat);

        //Then
        CatHouse.getCatById(23);

    }


    @Test
    public void removeByID(){
        //Given
        Cat cat = new Cat(null, null , 1);

        //When
        CatHouse.remove(1);

        //Then
        CatHouse.getCatById(1);


    }
    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }
}
