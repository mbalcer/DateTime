package pkg1.pkg7.date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mateusz
 */
public class DateTime {
    private Date date;
    private Time time;
    public DateTime(int day, int month, int year, int hour, int minute, int second){
        date = new Date(day,month,year);
        time = new Time(hour, minute, second);
    }
    
    public Date getDate() {
        return date;
    }
    public Time getTime() {
        return time;
    }
    public void setDate(int day, int month, int year) {
        date.setDate(day, month, year);
    }
    public void setTime(int hour, int minute, int second) {
        time.setTime(hour, minute, second);
    }
    public void setDateTime(int day, int month, int year, int hour, int minute, int second){
        date.setDate(day, month, year);
        time.setTime(hour, minute, second);
    }
    public String toString() {
        return String.format("%02d/%02d/%04d %02d:%02d:%02d", date.getDay(), date.getMonth(), date.getYear(), time.getHour(), time.getMinute(), time.getSecond());
    }
    
}
