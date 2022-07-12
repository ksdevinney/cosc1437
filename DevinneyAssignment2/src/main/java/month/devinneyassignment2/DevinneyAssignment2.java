/**
 * a class that uses various methods to set, retrieve, and compare the 
 * Number field of month objects
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
        DevinneyMonth Month1;
        DevinneyMonth Month2;
        DevinneyMonth Month3;
        DevinneyMonth Month4;
        
        // test with no arg constructor
        Month1 = new DevinneyMonth();
        
        // variables for other constructors
        int monthNumber = 2;
        String nameOfMonth = "October";
        
        // test single int constructor
        Month2 = new DevinneyMonth(monthNumber);
        
        // test string constructor
        Month3 = new DevinneyMonth(nameOfMonth);
        
        // test copy constructor
        // copy month3 to month 4
        Month4 = new DevinneyMonth(Month3);
        
        // test get method
        System.out.println("Month 1: " + Month1.get());
        System.out.println("Month 2: " + Month2.get());
        System.out.println("Month 3: " + Month3.get());
        
        // test getName method
        System.out.println("Month 1: " + Month1.getName());
        System.out.println("Month 2: " + Month2.getName());
        System.out.println("Month 3: " + Month3.getName());
        
        // use set method
        Month1.set(9);
        
        // use toString on all months
        System.out.println("Month 1 state: " + Month1);
        System.out.println("Month 2 state: " + Month2);
        System.out.println("Month 3 state: " + Month3);
        System.out.println("Month 4 state: " + Month4);
        
        // equals method
        System.out.println("Month 1 equals Month 2? " + Month1.equals(Month2));
        
        // compare method
        System.out.println("Compare Month 2 to Month 3: " + Month2.compareTo(Month3));
        
        // copy method
        DevinneyMonth monthCopy = Month3.copy();
        System.out.println(monthCopy);
    }
}
