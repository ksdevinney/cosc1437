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
     * no argument constructor method
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
    
    /**
     * returns the value set for Number
     * @return int Number
     */
    
    public int get() {
        return Number;
    }
    
    /**
     * sets a number for a DevinneyMonth object
     * @param Number value to be set
     */
    
    public void set(int Number) {
        this.Number = Number;
    }
    
    /**
     * 
     * @param a DevinneyMonth object
     * @return String name representing the month
     */
    
    public String getName() {
        //int monthNumber = this.Number;
        
        String str; 
        
        switch (this.Number) {
            case 12:
                str = "December";
                break;
            case 11:
                str = "November";
                break;
            case 10:
                str = "October";
                break;
            case 9:
                str = "September";
                break;
            case 8:
                str = "August";
                break;
            case 7:
                str = "July";
                break;
            case 6:
                str = "June";
                break;
            case 5:
                str = "May";
                break;
            case 4:
                str = "April";
                break;
            case 3:
                str = "March";
                break;
            case 2:
                str = "February";
                break;
            case 1:
            default:
                str = "January";
        }
        
        return str;
    }
    
    /**
     * makes a copy of the object using a calling object
     * @return copied DevinneyMonth
     */
    
    public DevinneyMonth copy() {
        DevinneyMonth copyMonth = new DevinneyMonth(Number);
        return copyMonth;
    }
    
    /**
     * toString method
     * @return a string describing the object
     */
    
    public String toString() {
        String str = "Month is " + this.Number;
        
        return str;
    }
    
    public boolean equals(DevinneyMonth month) {
        if (this.Number == month.Number) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public int compareTo(DevinneyMonth month) {
        if (this.Number == month.Number) {
            return 0;
        }
        else if (this.Number > month.Number) {
            return 1;
        } 
        else {
            return -1;
        }
    }
}
