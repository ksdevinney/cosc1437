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
    
    /** 
     * no arg constructor method
     * sets Number to 1 if no argument is passed
     */
    
    public DevinneyMonth() {
        this.Number = 1;
    }
    
    /**
     * constructor takes an int argument and sets the month field
     * if number is outside range, 1 is set
     * @param Number 
     */
    
    public DevinneyMonth(int Number) {
        if (Number >= 1 && Number <= 12) {
            this.Number = Number;
        }
        else {
            this.Number = 1;
        }
        
    }
    
    /** 
     * constructor method
     * takes a string value and matches it to the correct number
     * @param MonthName 
     */
    
    public DevinneyMonth(String MonthName) {
        switch (MonthName) {
            case "December":
                this.Number = 12;
                break;
            case "November":
                this.Number = 11;
                break;
            case "October":
                this.Number = 10;
                break;
            case "September":
                this.Number = 9;
                break;
            case "August":
                this.Number = 8;
                break;
            case "July":
                this.Number = 7;
                break;
            case "June":
                this.Number = 6;
                break;
            case "May":
                this.Number = 5;
                break;
            case "April":
                this.Number = 4;
                break;
            case "March":
                this.Number = 3;
                break;
            case "February":
                this.Number = 2;
                break;
            case "January":
            default:
                this.Number = 1;
        }
    }
    
    /**
     * copy constructor
     * takes another DevinneyMonth object and copies to a new object
     * @param month 
     */
    public DevinneyMonth(DevinneyMonth month) {
        this.Number = month.Number;
    }
    
    public int get() {
        return Number;
    }
    
    public void set(int Number) {
        this.Number = Number;
    }
}
