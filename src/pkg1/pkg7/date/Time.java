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
public class Time {
    private int hour;
    private int minute;
    private int second;
    
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    
        validateTime(this.hour, this.minute, this.second);
    }
    
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        
        validateTime(this.hour, this.minute, this.second);
    }
    public String toString() {
        return String.format("%02d:%02d:%02d", this.hour, this.minute, this.second);
    }
    public Time nextSecond() {
        return new Time(this.hour, this.minute, this.second+1);
    }
    public Time previousSecond() {
        return new Time(this.hour, this.minute, this.second-1);
    }
    
    private void validateTime(int hour, int minute, int second) {
        if(hour>23 || hour<0)
            this.hour = 0;
        if(minute>59 || minute<0)
            this.minute = 0;
        if(second>59 || second<0)
            this.second = 0;
    }
}
