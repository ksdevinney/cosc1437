/**
 * creates an array and does some other fun things
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
        DevinneyArray testArray = new DevinneyArray();
        
        testArray.ReadFromFile();
        testArray.Output();
        
        
    }
}
