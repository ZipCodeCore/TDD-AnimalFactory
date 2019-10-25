package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void createCatTest() {
        CatHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();
        Cat pongo = AnimalFactory.createCat(name, new Date());

        Assert.assertEquals(name, pongo.getName());
        Assert.assertEquals(birthDate, pongo.getBirthDate());
        Assert.assertEquals(0, (int)pongo.getId());

        Cat jax = AnimalFactory.createCat("Jax", new Date());
        Assert.assertEquals(0, (int)jax.getId());

        CatHouse.add(jax);

        Cat luna = AnimalFactory.createCat("luna", new Date());
        Assert.assertEquals(1, (int)luna.getId());
    }


    @Test
    public void createDogTest() {
        DogHouse.clear();

        String name = "Pongo";
        Date birthDate = new Date();
        Dog pongo = AnimalFactory.createDog(name, new Date());

        Assert.assertEquals(name, pongo.getName());
        Assert.assertEquals(birthDate, pongo.getBirthDate());
        Assert.assertEquals(0, (int)pongo.getId());

        Dog jax = AnimalFactory.createDog("Jax", new Date());
        Assert.assertEquals(0, (int)jax.getId());

        DogHouse.add(jax);

        Dog luna = AnimalFactory.createDog("luna", new Date());
        Assert.assertEquals(1, (int)luna.getId());
    }

}
