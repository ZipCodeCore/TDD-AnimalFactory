package rocks.zipcodewilmington.animals.animal_storage;


import rocks.zipcodewilmington.animals.Cat;

/**
 * @author leon on 4/19/18.
 */
public class CatHouse {
    private static AnimalWarehouse<Cat> catHouse = new AnimalWarehouse<>();

    public static void add(Cat cat) {

        catHouse.add(cat);
    }

    public static void remove(Integer id) {
        catHouse.removeAnimalById(id);
    }

    public static void remove(Cat cat) {
        catHouse.removeAnimal(cat);
    }

    public static Cat getCatById(Integer id) {
        return catHouse.getAnimalById(id);
    }

    public static Integer getNumberOfCats() {
        return catHouse.getNumberOfAnimals();
    }

    public static void clear() {
        catHouse.clear();
    }
}