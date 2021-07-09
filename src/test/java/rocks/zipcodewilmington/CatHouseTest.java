package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

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
    public void addCatTest(){
        // Given
        String givenName = "Garfield";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        CatHouse.clear();

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(1, actual);

}

    @Test
    public void removeCatByIdTest() {
        // Given
        String givenName = "Garfield";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        CatHouse.clear();

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.remove(0);


        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(0, actual);
        Assert.assertNull(CatHouse.getCatById(0));

    }

    @Test
    public void removeCatTest() {
        // Given
        String givenName = "Garfield";
        Date givenBirthDate = new Date();
        Integer givenId = 0;
        CatHouse.clear();

        // When
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.remove(cat);

        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(0, actual);
    }

    @Test
    public void getCatByIdTest() {
        // Given
        CatHouse.clear();
        String givenName = "Garfield";
        Date givenBirthDate = new Date();
        Integer givenId = 2;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);


        // When
        Cat actual = CatHouse.getCatById(givenId);


        // Then
        Assert.assertEquals(cat, actual);

    }

    @Test
    public void getNumberOfCatsTest () {
        // Given
        CatHouse.clear();
        String givenName = "Garfield";
        Date givenBirthDate = new Date();
        Integer givenId = 2;
        Cat cat = new Cat(givenName, givenBirthDate, givenId);
        CatHouse.add(cat);

        // When
        int actual = CatHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(1, actual);

    }


}
