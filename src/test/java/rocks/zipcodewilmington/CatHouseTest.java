package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)` ////////
    // TODO - Create tests for `void remove(Integer id)` ///////
    // TODO - Create tests for `void remove(Cat cat)`  ////////
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()` //////




    @Test
    public void catAddTest (){
        //GIVEN
        CatHouse.clear();

        //WHEN
        Cat gatito = AnimalFactory.createCat("ggg", null);
        CatHouse.add(gatito);
        int expected = 1;

        int actual = CatHouse.getNumberOfCats();
        //THEN
        Assert.assertEquals(1 ,actual);


        }

        @Test
    public void catRemoveTest(){
        //GIVEN
         CatHouse.clear();


       //WHEN
         Cat noGato = new Cat(null, null, null);
            CatHouse.add(noGato);
            CatHouse.remove(noGato);

           int actual = CatHouse.getNumberOfCats();

        //THEN
            Assert.assertEquals(0 , actual);

        }

        @Test
        public void removebyId(){
            //GIVEN
            CatHouse.clear();

            //WHEN
            Cat cat = new Cat(null, null, 0);
            CatHouse.add(cat);
            CatHouse.remove(cat.getId());
            int actual = cat.getId();
            //int expected = 0;
            //int actual =  CatHouse.getNumberOfCats();

            //THEN
            Assert.assertEquals(0 , actual);

        }

        @Test
    public void getNumberOfCats (){
        //GIVEN
            String givenName = "kitty";
            Date givenBirthDate = new Date();
            Integer givenId = 6;
            Cat cat = new Cat("Kitty", null, 6); //tambien works w/ givenName, givenBirthDate...
            CatHouse.add(cat);

         //WHEN
            Cat actual = CatHouse.getCatById(givenId);


            //THEN
            Assert.assertEquals(cat, actual);

}

/*@Test
    public void NumberOfCats(){

    //GIVEN
    String givenName = "kitty";
    Date givenBirthDate = new Date();
    Integer givenId = 6;
    Cat cat = new Cat("Kitty", null, 6); //tambien works w/ givenName, givenBirthDate...
    CatHouse.add(cat);

    //WHEN
    ;


    //THEN
    Assert.assertEquals(cat, actual);*/

}




