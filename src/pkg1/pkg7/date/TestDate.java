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
public class TestDate {
    public static void main(String[] args) {
        Date today = new Date(11,5,2018);
        System.out.println(today);
        today.setDate(12, 5, 2018);
        System.out.println(today);
        System.out.println(today.nextDay());
        
        System.out.println(today);
        today.previousDay();
        System.out.println(today);
        System.out.println(today.previousDay());
    
        Date abstractDate = new Date(29,02,2016);
        System.out.println(abstractDate);
        abstractDate.setDate(30,21,4214);
        System.out.println(abstractDate);
        abstractDate.setDate(31,11,1999);
        System.out.println(abstractDate);
        abstractDate.setDate(29,02,2001);
        System.out.println(abstractDate);
        abstractDate.setDate(32,12,1852);
        System.out.println(abstractDate);
        
    }
}
