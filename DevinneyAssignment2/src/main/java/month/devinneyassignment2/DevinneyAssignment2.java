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
        Scanner scnr = new Scanner(System.in);

        // test objects
        DevinneyMonth testMonth;
        DevinneyMonth testMonth2;
        DevinneyMonth testMonth3;
        DevinneyMonth testMonth4;
        DevinneyMonth testCopy;
        
        // test with no arg constructor
        testMonth = new DevinneyMonth();
        // test the set method
        testMonth.set(3);
        
        // variables for other constructors
        int monthNumber;
        String nameOfMonth;
        
        // test single int constructor
        System.out.println("Enter a number between 1 and 12. ");
        monthNumber = scnr.nextInt();
        testMonth2 = new DevinneyMonth(monthNumber);
        
        // consume the extra newline character
        scnr.nextLine();
        
        // test string constructor
        System.out.println("Enter the name of a month: ");
        nameOfMonth = scnr.nextLine();
        testMonth3 = new DevinneyMonth(nameOfMonth);
        
        testMonth4 = new DevinneyMonth(testMonth3);
        
        testCopy = testMonth2.copy();
        
        System.out.println("test 1: " + testMonth.get());
        
        System.out.println("test 2: " + testMonth2.get());
        
        System.out.println("test 3: " + testMonth3.get());
        
        System.out.println("copy: " + testMonth4.get());
        
        System.out.println("Copy method: " + testCopy.toString());
    }
}
