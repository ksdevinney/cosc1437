/**
 * uses the DevinneyArray class to create and manipulate an array
 */

package array.devinneyassignment3;

import java.io.*;

/**
 *
 * @author katiedevinney
 * @version 1.0
 */
public class DevinneyAssignment3 {

    public static void main(String[] args) throws IOException {
        // create an object
        DevinneyArray testArray = new DevinneyArray();
        
        // use input method
        testArray.Input(2);
        
        // use output method
        testArray.Output();
        
        // clear array
        testArray.Initialize();
        
        // use readfromfile method
        testArray.ReadFromFile();
        
        // output again
        testArray.Output();
        
        // searchandoutput method
        testArray.SearchAndOutput("Emma");
        
        // get method
        System.out.println(testArray.Get(15));
        
        // set method
        testArray.Set(3, "Katie");
        
        // output again
        testArray.Output();
        
        // tostring method
        System.out.println(testArray.ToString());
        
        // sort method
        testArray.Sort();
        
        // output sorted list
        testArray.Output();
    }
}
