/**
 * methods for working with an array designed to hold a list of names
 * 
 */

package array.devinneyassignment3;

/**
 *
 * @author katiedevinney
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class DevinneyArray {
   private ArrayList<String> Names;
   private int Number;
   
   /**
    * no-arg constructor that creates an empty array
    */
   
   public DevinneyArray() {
       Names = new ArrayList<>(200);
       this.Initialize();
   }
   
   /**
    * if the array has already been created, reset it
    * otherwise, create an empty array for 200 strings
    */
   
   public void Initialize() {
       if (!Names.isEmpty()) {
           Names.clear();
       }
       
       Number = 0;
       Names = new ArrayList<>(Number);
   }
   
   /**
    * reads names from file and adds each name to array
    * @throws IOException when file cannot be opened
    */
   
   public void ReadFromFile() throws IOException {
       File nameFile = new File("src/Assignment3DataFile.txt");
       Scanner inFile = new Scanner(nameFile);
       
       while (inFile.hasNext()) {
           String line = inFile.nextLine();
           Names.add(line);
       }
       
       Number = Names.size();
       
       inFile.close();
   }
   
   /**
    * reads strings from the console and adds them to the array
    * @param N the number of elements to add
    */
   public void Input(int N) {
       Scanner scnr = new Scanner(System.in);
       int i;
       String newName;
       
       for (i = 0; i < N; i++) {
           System.out.println("Type the name you want to add: ");
           newName = scnr.nextLine();
           Names.add(newName);
           Number++;
       }
   }
   
   /**
    * Outputs the size of the array, and prints each element
    */
   public void Output() {
       int i;
       
       System.out.printf("The array of %d items is:\n", Names.size());
       
       for (i = 0; i < Names.size(); i++) {
           System.out.println(Names.get(i));
       }
   }
   
   /**
    * uses binary search to find a specified value
    * @param S the name to be searched for
    * @return true if name is present in the list, false if not
    */
   
   public boolean Found(String S) {
       int first = 0;
       int middle;
       int last = Names.size() - 1;
       // int position = -1;
       boolean found = false;
       
       while (!found && first <= last) {
           middle = (first + last) / 2;
           if (Names.get(middle).compareTo(S) == 0) {
               found = true;
               // position = middle;
           }
           else if (Names.get(middle).compareTo(S) > 0) {
               last = middle - 1;
           }
           else {
               first = middle + 1;
           }
       }
       return found;
   }
   
   /**
    * performs a sequential search and returns occurrences of the search term
    * @param S search term
    */
   public void SearchAndOutput(String S) {
       int i;
       
       for (i = 0; i < Names.size(); i++) {
           if (Names.get(i).equals(S)) {
               System.out.printf("%s found at index %d\n", S, i);
           }
       }
   }
   
   /**
    * uses selection sort algorithm to sort names in alphabetical order
    */
   
   public void Sort() {
       int startScan, index, minIndex; 
       String minValue;
       
       for (startScan = 0; startScan < Names.size() - 1; startScan++) {
           minIndex = startScan;
           minValue = Names.get(startScan);
           
           for (index = startScan + 1; index < Names.size(); index++) {
               if (Names.get(index).compareTo(minValue) < 0) {
                   minValue = Names.get(index);
                   minIndex = index;
               }
           }
           
           Names.set(minIndex, Names.get(startScan));
           Names.set(startScan, minValue);
       }
   }
   
   /**
    * returns element at specified index
    * @param N desired index
    * @return String element at index
    */
   public String Get(int N) {
       return Names.get(N);
   }
   
   /**
    * sets an element at desired position, or 0 if position is out of bounds
    * @param N index to set
    * @param S element to set
    */
   public void Set(int N, String S) {
       if (N >= Names.size()) {
           Names.set(0, S);
       }
       else {
           Names.set(N, S);
       }
   }
   
   /**
    * prints the contents of the array
    * @return String version of the array
    */
   
   public String ToString() {
       String list;
       StringBuilder summary = new StringBuilder();
       
       summary.append("Names[");
       summary.append(this.Number);
       summary.append("]: ");
       
       for (int i = 0; i < Names.size(); i++) {
           summary.append(Names.get(i));
           summary.append(", ");
       }
       
       list = summary.toString();
       
       return list;
   }
}
