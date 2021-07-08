package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @After
    public void tearDown() {
        CatHouse catHouse = new CatHouse();
        catHouse.clear();
    }

    @Test
    public void addTest() {
        // Given
        int expectedNumberOfCats = 1;

        // When
        CatHouse catHouse = new CatHouse();
        catHouse.add(new Cat(null, null, null));
        int actualNumberOfCats = catHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }

    @Test
    public void removeByIdTest() {
        // Given
        int expectedNumberOfCats = 1;

        // When
        CatHouse catHouse = new CatHouse();
        catHouse.add(new Cat(null, null, 1));
        catHouse.add(new Cat(null, null, 2));
        catHouse.remove(1);
        int actualNumberOfCats = catHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }

    @Test
    public void removeByCatTest() {
        // Given
        int expectedNumberOfCats = 1;

        // When
        CatHouse catHouse = new CatHouse();
        Cat george = new Cat(null, null, null);
        Cat allen = new Cat(null, null, null);
        catHouse.add(george);
        catHouse.add(allen);
        catHouse.remove(allen);
        int actualNumberOfCats = catHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }

    @Test
    public void getCatByIdTest() {
        // Given
        Cat expectedCat = new Cat(null, null, 6);

        // When
        CatHouse catHouse = new CatHouse();
        catHouse.add(expectedCat);
        Cat actualCat = catHouse.getCatById(6);
        // Then
        Assert.assertEquals(expectedCat, actualCat);
    }

    @Test
    public void getNumberOfCatsTest() {
        // Given
        int expectedNumberOfCats = 5;

        // When
        CatHouse catHouse = new CatHouse();
        catHouse.add(new Cat(null, null, null));
        catHouse.add(new Cat(null, null, null));
        catHouse.add(new Cat(null, null, null));
        catHouse.add(new Cat(null, null, null));
        catHouse.add(new Cat(null, null, null));
        int actualNumberOfCats = catHouse.getNumberOfCats();

        // Then
        Assert.assertEquals(expectedNumberOfCats, actualNumberOfCats);
    }
}
