/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clock;

/**
 *
 * @author User
 */

public class Clock {
    private int hours;
    private int minutes;
    private int seconds;
    private boolean meridian;
    
    public Clock(){}
    
    public void setClock(int hours, int minutes, int seconds, boolean meridian){
        if(hours > 12 || minutes > 59 || seconds > 60){
            System.out.println("You don't know how to set a clock. SHAME!");
            return; 
        }
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        this.meridian = meridian;
    }
    
    public void advanceTime(int secondsForward){
        //int secondRemainder = seconds % 60;
        while(secondsForward > 60 && secondsForward - 60 > 0){
            secondsForward = secondsForward-60;
            minutes++;
            if(minutes > 59){
                hours++;
                        if(hours>12){
                            hours = 0;
                            meridian = !meridian;
                        }
            }
        }
        
        seconds = seconds + secondsForward;
        if(seconds > 60){
            minutes++;
                if(minutes > 59){
                    hours++;
                            if(hours>12){
                                hours = 0;
                                meridian = !meridian;
                            }
                }
            seconds = seconds-60;
        }
    }
    
    public void tickBySecond(){
        seconds++;
        if(seconds > 60){
            minutes++;
                if(minutes > 59){
                    hours++;
                            if(hours>12){
                                hours = 0;
                                meridian = !meridian;
                            }
                }
            seconds = seconds-60;
        }
    }
    
    public void tickByMinute(){
        minutes++;
            if(minutes > 59){
                hours++;
                if(hours>12){
                    hours = 0;
                    meridian = !meridian;
                }
            }
    }
    
    public void tickByHour(){
        hours++;
            if(hours>12){
                hours = 0;
                meridian = !meridian;
            }
    }
    
    public void displayTime12(){
        System.out.println(hours + " " + minutes + " " + seconds);
    }
    
    public void displayTime24(){
        if(meridian == true){
            hours = hours+12;
            if(hours == 24){
                hours = 0;
            }
        }
        System.out.println(hours + " " + minutes + " " + seconds);
    }
    
    
    public int getHour(){
        return hours;
    }
    
    public int getMinute(){
        return minutes;
    }
    
    public int getSeconds(){
        return seconds;
    }
    
    public String getMeridian(){
        if(meridian == true){
            return "PM";
        }else{
            return "AM";
        }
    }
    
    @Override
    public String toString(){
        String time = String.format("The time is %02d:%02d:%02d %s", hours, minutes, seconds, getMeridian());
        return time;
    }
}

