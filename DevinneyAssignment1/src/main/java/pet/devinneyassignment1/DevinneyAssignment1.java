/** 
 * This is a program that takes information through user input,
 * creates a class, 
 * and creates a story about a pet
 */

package pet.devinneyassignment1;

// import scanner for user input
import java.util.Scanner;

/**
 *
 * @author katiedevinney
 * @version 1.0
 */
public class DevinneyAssignment1 {
    
    /**
     * main program: no parameters needed
     * 
     * @param args An array of strings that contains the command line argument
     */

    public static void main(String[] args) {
        // variable for the new class
        DevinneyPet testPet;
        
        // variables for class parameters
        String petName;
        String petType;
        int petAge;
        int petWeight;
        String petColor;
        
        // scanner for keyboard input
        Scanner scnr = new Scanner(System.in);
        
        // get petName variable
        System.out.println("Enter your pet's name: ");
        petName = scnr.nextLine();
        
        // get petType variable
        System.out.println("Enter the type of pet: ");
        petType = scnr.nextLine().toLowerCase();
        
        // get petAge variable
        System.out.println("Enter the pet's age, in years: ");
        petAge = scnr.nextInt();
        
        // get petWeight variable
        System.out.println("Enter the pet's weight, in pounds: ");
        petWeight = scnr.nextInt();
        
        //consume the nelwine
        scnr.nextLine();
        
        // get petColor variable
        System.out.println("What color is your pet?");
        petColor = scnr.nextLine().toLowerCase();
        
        // initialize instance of DevinneyPet class
        testPet = new DevinneyPet(petName, petType, petAge, petWeight, petColor);
        
        // get methods to retrieve stored values
        System.out.println("Name: " + testPet.getName());
        System.out.println("Type: " + testPet.getType());
        System.out.println("Age: " + testPet.getAge());
        System.out.println("Weight: " + testPet.getWeight());
        System.out.println("Color: " + testPet.getColor());
        
        // print the story for the information entered
        testPet.printStory();
    }
}
