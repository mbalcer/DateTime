/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.pkg7.date;

/**
 *
 * @author Mateusz
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        
        validateDate(this.day,this.month,this.year);
    }
    private void validateDate(int day,int month, int year) {
        if(year<1900 || year>2100)
            this.year = 1970;
        if(month>12 || month < 1)
            this.month = 1;
        if(day>31||day<1)
            this.day = 1;
        if(year%4==0 && month==2 && day>29)
            this.day = 1;
        if(year%4!=0 && month==2 && day>28)
            this.day = 1;
        if(month==2 || month==4 || month==6 || month==9 || month==11)
            if(day>30||day<1)
                this.day = 1;
    }
    
    public int getDay() {
        return this.day; 
    }
    public int getMonth() {
        return this.month; 
    }
    public int getYear() {
        return this.year; 
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setMonth(int month) {
        this.month = month;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
        
        validateDate(this.day,this.month,this.year);
    }
    
    public String toString() {
        return String.format("%02d/%02d/%04d",day,month,year);
    }
    
    public Date nextDay() {
        return new Date(day+1,month,year);
    }
    public Date previousDay() {
        return new Date(day-1,month,year);
    }  
}
