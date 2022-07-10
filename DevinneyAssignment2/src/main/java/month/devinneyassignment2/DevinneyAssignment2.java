/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package month.devinneyassignment2;

import java.util.Scanner;

/**
 *
 * @author katiedevinney
 * @version 1.0
 */
public class DevinneyAssignment2 {

    public static void main(String[] args) {
        DevinneyMonth testMonth;
        DevinneyMonth testMonth2;
        
        testMonth = new DevinneyMonth();
        
        int monthNumber;
        
        Scanner scnr = new Scanner(System.in);
        
        System.out.println("Enter a number between 1 and 12. ");
        monthNumber = scnr.nextInt();
        
        testMonth2 = new DevinneyMonth(monthNumber);
        
        System.out.println(testMonth.get());
        
        System.out.println(testMonth2.get());
    }
}
