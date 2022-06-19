/** 
 * This is a program that takes information through user input
 * And creates a story about a pet
 */

package pet.devinneyassignment1;
import java.util.Scanner;

/**
 *
 * @author katiedevinney
 */
public class DevinneyAssignment1 {

    public static void main(String[] args) {
        DevinneyPet testPet;
        String petName;
        String petType;
        int petAge;
        int petWeight;
        String petColor;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter your pet's name: ");
        petName = scnr.nextLine();
        
        System.out.println("Enter the type of pet: ");
        petType = scnr.nextLine();
        
        System.out.println("Enter the pet's age, in years: ");
        petAge = scnr.nextInt();
        
        System.out.println("Enter the pet's weight, in pounds: ");
        petWeight = scnr.nextInt();
        
        //consume the nelwine
        scnr.nextLine();
        
        System.out.println("What color is your pet?");
        petColor = scnr.nextLine();
        
        testPet = new DevinneyPet(petName, petType, petAge, petWeight, petColor);

        testPet.printStory();
    }
}
