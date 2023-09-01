/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytime;
import clock.Clock;

/**
 *
 * @author User
 */
public class MyTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Clock royalOak = new Clock();
        royalOak.setClock(1, 34, 23, false);
        royalOak.tickByHour();
        royalOak.tickByMinute();
        royalOak.tickBySecond();
        royalOak.displayTime12();
        royalOak.displayTime24();
        System.out.println(royalOak.toString());
    }
    
}
