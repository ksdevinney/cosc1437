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
//    private int Weight;     // pet weight
//    private String Color;   // color of pet

    public DevinneyPet (String newName, String newType, int newAge) {
        Name = newName;
        Type = newType;
        Age = newAge;
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

}
