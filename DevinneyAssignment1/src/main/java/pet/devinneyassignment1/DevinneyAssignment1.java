/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
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
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.print("Enter your pet's name: ");
        petName = scnr.nextLine();
        
        // consume the nelwine
        // scnr.nextLine();
        
        testPet = new DevinneyPet(petName);
        
        System.out.println("Your pet is " + testPet.getName());
    }
}
