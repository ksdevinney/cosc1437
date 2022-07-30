/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author katiedevinney
 */
import java.util.ArrayList;
import java.util.Scanner;

public class DevinneyArray {
   private ArrayList<String> Names;
   private int Number;
   
   public DevinneyArray() {
       Number = 200;
       Names = new ArrayList<>(Number);  
   }
   
//   public void Initialize() {
//       if (!Names.isEmpty()) {
//           Names.clear();
//       }
//       
//       Number = 0;
//       Names = new ArrayList<>(Number);
//   }
   
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
       
       System.out.printf("The array of %d items is:\n", Number);
       
       for (i = 0; i < Number; i++) {
           System.out.println(Names.get(i));
       }
   }
   
   /**
    * performs a sequential search and returns occurrences of the search term
    * @param S search term
    */
   public void SearchAndOutput(String S) {
       int i;
       
       for (i = 0; i < Names.size(); i++) {
           if (Names.get(i).equals(S)) {
               System.out.printf("%s found at index %d", S, i);
           }
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
}
