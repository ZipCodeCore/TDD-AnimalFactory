package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

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
        //given
        Cat createdCat = new Cat("Marshall");
        CatHouse catHouse = new CatHouse();


        //when
        CatHouse.add(createdCat);
        int actual = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(1, actual);

    }

    @Test
    public void removeIntegerCatTest(){
        //given
        Cat createdCat = new Cat("Marshall", null, 0);
        Cat createdCat2 = new Cat("Wiggles", null, 2);
        Cat createdCat3 = new Cat("Lego", null, 3);
        CatHouse catHouse = new CatHouse();
        //new instantiation of CatHouse() unnecessary

        //when
        catHouse.add(createdCat);
        catHouse.add(createdCat2);
        CatHouse.add(createdCat3);
        catHouse.remove(0);

        //then
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(2, actual);


    }

    @Test
    public void getCatIdTest(){
        //given
        Cat createdCat = new Cat("Marshall", null, 0);
        Cat createdCat2 = new Cat("Wiggles", null, 2);
        Cat createdCat3 = new Cat("Lego", null, 3);


        //when
        CatHouse.add(createdCat);
        CatHouse.add(createdCat2);
        CatHouse.add(createdCat3);
        CatHouse.remove(0);

        //then
        int actual = CatHouse.getNumberOfCats();
        Cat actualCat = CatHouse.getCatById(2);
        Assert.assertEquals(2, actual);
        Assert.assertEquals(createdCat2, actualCat);

    }
    @Test
    public void addCatTest2(){
        //given
        Cat createdCat = AnimalFactory.createCat("Charzar", null);



        //when
        CatHouse.add(createdCat);
        int actual = CatHouse.getNumberOfCats();

        //then
        Assert.assertEquals(1, actual);

    }
}
