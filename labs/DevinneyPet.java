/**
 * DevinneyPet Class
 * This class takes information about a pet and creates a story.
 */

// import java.util.Scanner;

public class DevinneyPet {
    private String Name;    // pet name
//    private String Type;    // type of pet
//    private int Age;        // pet's age
//    private int Weight;     // pet weight
//    private String Color;   // color of pet

    public DevinneyPet (String newName) {
        Name = newName;
    }

    // class methods

    public void setName(String petName) {
        this.Name = petName;
    }

    public String getName() {
        return Name;
    }

}