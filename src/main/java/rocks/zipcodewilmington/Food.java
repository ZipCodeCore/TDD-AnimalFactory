package rocks.zipcodewilmington;

/**
 * @author leon on 4/19/18.
 */
public class Food {
    private String brand;
    private int ounces;
    private String typeOfMeat;
    private boolean isWet;

    public Food(String brand, int ounces, String typeOfMeat, boolean isWet){
        this.brand = brand;
        this.ounces = ounces;
        this.typeOfMeat = typeOfMeat;
        this.isWet = isWet;

    }
}
