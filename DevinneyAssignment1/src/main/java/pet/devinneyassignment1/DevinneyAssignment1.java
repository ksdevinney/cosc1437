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
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter your pet's name: ");
        petName = scnr.nextLine();
        
        // consume the nelwine
        // scnr.nextLine();
        
        System.out.println("Enter the type of pet: ");
        petType = scnr.nextLine();
        
        System.out.println("How old is your pet?");
        petAge = scnr.nextInt();
        
        testPet = new DevinneyPet(petName, petType, petAge);
        
        System.out.println(testPet.getName() + " is a " + testPet.getType());
        System.out.printf("Your pet's age is %d", testPet.getAge());
    }
}
