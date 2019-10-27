package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
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
    public void testadd() {
        // Given (some
        String name = "Milano";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat("Milano", null);
        Cat animal1 = AnimalFactory.createCat("crany", null);
        Cat animal2 = AnimalFactory.createCat("coony", null);
        Integer expectedNoOfCats = 3;

        // When
        CatHouse.clear();
        CatHouse.add(animal);
        CatHouse.add(animal1);
        CatHouse.add(animal2);

        // Then
        Integer noOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNoOfCats,noOfCats);

    }

    @Test
    public void testremovebyId1() {
        // Given (some
        String name = "Milano";
        Date birthDate = new Date();
        CatHouse.clear();
        for (int i=0 ; i<10 ; i++) {
            Cat animal = AnimalFactory.createCat("Milano", null);
            CatHouse.add(animal);
        }

        Integer expectedNoOfCats = 8;

        CatHouse.remove(5);
        CatHouse.remove(2);

        Integer noOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNoOfCats,noOfCats);

    }

    @Test
    public void testremove() {
        // Given (some
        String name = "Milcky";
        Date birthDate = new Date();
        CatHouse.clear();
        for (int i=0 ; i<10 ; i++) {
            Cat animal = AnimalFactory.createCat("Milcky", null);
            CatHouse.add(animal);
        }

        Integer expectedNoOfCats = 8;

        CatHouse.remove(6);
        CatHouse.remove(2);

        Integer noOfCats = CatHouse.getNumberOfCats();

        Assert.assertEquals(expectedNoOfCats,noOfCats);

    }
}
