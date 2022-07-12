/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package month.devinneyassignment2;

/**
 *
 * @author katiedevinney
 * @version 1.0
 */
public class DevinneyAssignment2 {

    public static void main(String[] args) {

        // test objects
        DevinneyMonth testMonth;
        DevinneyMonth testMonth2;
        DevinneyMonth testMonth3;
        DevinneyMonth testMonth4;
        
        // test with no arg constructor
        testMonth = new DevinneyMonth();
        
        // variables for other constructors
        int monthNumber = 2;
        String nameOfMonth = "October";
        
        // test single int constructor
        testMonth2 = new DevinneyMonth(monthNumber);
        
        // test string constructor
        testMonth3 = new DevinneyMonth(nameOfMonth);
        
        // test copy constructor
        // copy month3 to month 4
        testMonth4 = new DevinneyMonth(testMonth3);
        
        // test get method
        System.out.println("Month 1: " + testMonth.get());
        System.out.println("Month 2: " + testMonth2.get());
        System.out.println("Month 3: " + testMonth3.get());
        
        // test getName method
        System.out.println("Month 1: " + testMonth.getName());
        System.out.println("Month 2: " + testMonth2.getName());
        System.out.println("Month 3: " + testMonth3.getName());
        
        // use set method
        testMonth.set(9);
        
        // use toString on all months
        System.out.println("Month 1 state: " + testMonth);
        System.out.println("Month 2 state: " + testMonth2);
        System.out.println("Month 3 state: " + testMonth3);
        System.out.println("Month 4 state: " + testMonth4);
        
        // equals method
        System.out.println("Month 1 equals Month 2? " + testMonth.equals(testMonth2));
        
        // compare method
        System.out.println("Compare Month 2 to Month 3: " + testMonth2.compareTo(testMonth3));
        
        // copy method
        DevinneyMonth monthCopy = testMonth3.copy();
        System.out.println(monthCopy);
    }
}
