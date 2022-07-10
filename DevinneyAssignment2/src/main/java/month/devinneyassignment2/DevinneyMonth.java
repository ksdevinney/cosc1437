/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package month.devinneyassignment2;

/**
 *
 * @author katiedevinney
 * @version 1.0
 */
public class DevinneyMonth {
    private int Number;
    
    public DevinneyMonth() {
        this.Number = 1;
    }
    
    public DevinneyMonth(int Number) {
        this.Number = Number;
    }
    
//    public DevinneyMonth(String MonthName) {
//        
//    }
//    
//    public DevinneyMonth(DevinneyMonth month) {
//        
//    }
    
    public int get() {
        return Number;
    }
    
    public void set(int Number) {
        this.Number = Number;
    }
}
