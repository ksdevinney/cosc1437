/*
 * This is a class containing basic information about a pet
 * It is used to create a story
 */
package pet.devinneyassignment1;

/**
 *
 * @author katiedevinney
 * @version 1.0
 */


public class DevinneyPet {
    private String Name;    // pet name
    private String Type;    // type of pet
    private int Age;        // pet's age
    private int Weight;     // pet weight
    private String Color;   // color of pet

    public DevinneyPet (String newName, String newType, int newAge, int newWeight, String newColor) {
        Name = newName;
        Type = newType;
        Age = newAge;
        Weight = newWeight;
        Color = newColor;
    }

    /** 
     * sets a name for the DevinneyPet class
     * @param petName the name to be set
     */

    public void setName(String petName) {
        this.Name = petName;
    }

    /**
     * returns the value set for Name
     * @return String representing the name 
     */
    
    public String getName() {
        return Name;
    }
    
    /** 
     * sets a type for the DevinneyPet class
     * @param petType the type to be set
     */
    
    public void setType(String petType) {
        this.Type = petType;
    }
    
    /**
     * returns the value set for Type
     * @return String representing the type 
     */
    
    public String getType() {
        return Type;
    }
    
    /** 
     * sets an age for the DevinneyPet class
     * @param petAge the age to be set
     */
    
    public void setAge(int petAge) {
        this.Age = petAge;
    }
    
    /**
     * returns the value set for Age
     * @return int representing the age 
     */
    
    public int getAge() {
        return Age;
    }
    
    /** 
     * sets a weight for the DevinneyPet class
     * @param petWeight the weight to be set
     */

    public void setWeight(int petWeight) {
        this.Weight = petWeight;
    }
    
    /**
     * returns the value set for Weight
     * @return int representing the weight 
     */
    
    public int getWeight() {
        return Weight;
    }
    
    /** 
     * sets a color for the DevinneyPet class
     * @param petColor the color to be set
     */
    
    public void setColor(String petColor) {
        this.Color = petColor;
    }
    
    /**
     * returns the value set for Color
     * @return String representing the color 
     */
    
    public String getColor() {
        return Color;
    }
    
    /** 
     * Uses the object attributes to write a short story about the pet
     */
    
    public void printStory() {
        System.out.printf("There once was a %s %s called %s who lived in Dallas, "
                + "Texas. " + ""
                + "In June 2022 when it was %d years old, \n%s was %d pounds." + ""
                + " %s was a happy %s and had a long and happy life.", 
                Color, Type, Name, Age, Name, Weight, Name, Type);
    }
}
