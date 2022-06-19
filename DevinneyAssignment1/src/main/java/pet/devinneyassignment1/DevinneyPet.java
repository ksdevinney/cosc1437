/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pet.devinneyassignment1;

/**
 *
 * @author katiedevinney
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

    // class methods

    public void setName(String petName) {
        this.Name = petName;
    }

    public String getName() {
        return Name;
    }
    
    public void setType(String petType) {
        this.Type = petType;
    }
    
    public String getType() {
        return Type;
    }
    
    public void setAge(int petAge) {
        this.Age = petAge;
    }
    
    public int getAge() {
        return Age;
    }

    public void setWeight(int petWeight) {
        this.Weight = petWeight;
    }
    
    public int getWeight() {
        return Weight;
    }
    
    public void setColor(String petColor) {
        this.Color = petColor;
    }
    
    public String getColor() {
        return Color;
    }
    
    public void printStory() {
        System.out.printf("There once was a %s %s called %s who lived in Dallas, Texas. " + ""
                + "In June 2022 when it was %d years old, \n%s was %d pounds." + ""
                + " %s was a happy %s and had a long and happy life.", 
                Color, Type, Name, Age, Name, Weight, Name, Type);
    }
}
