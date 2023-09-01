/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//I have forgotten how to do basic trigonometry... I AM FRAUDULENT!
package geometry;

/**
 *
 * @author User
 */
public class MyPoint {
    private int xCoordinate;
    private int yCoordinate;
    
    
    MyPoint(){xCoordinate = yCoordinate = 0;}
    MyPoint(int x, int y){
        xCoordinate = x;
        yCoordinate = y;
    }
    
    
    public int getxCoordinate() {
        return xCoordinate;
    }

    public void setxCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    public int getyCoordinate() {
        return yCoordinate;
    }

    public void setyCoordinate(int yCoordinate) {
        this.yCoordinate = yCoordinate;
    }
    
    public double getDistance(double x, double y){
        double xThing = x-xCoordinate;
        double yThing = y-yCoordinate;
        return Math.sqrt((xThing * xThing)+(yThing * yThing));
    }
    
    public double getDistance(MyPoint coordinates){
        int xThing = coordinates.xCoordinate-xCoordinate;
        int yThing = coordinates.yCoordinate-yCoordinate;
        return Math.sqrt((xThing * xThing)+(yThing * yThing));
    }
    
    public double getDistance(){
        int xThing = 0-xCoordinate;
        int yThing = 0-yCoordinate;
        return Math.sqrt((xThing * xThing)+(yThing * yThing));
    }
    
    public void displayPoint(){
        System.out.println("(" + xCoordinate + "," + yCoordinate + ")");
    }
    
    @Override
    public String toString(){
        String coord = String.format("(%d, %d)", xCoordinate, yCoordinate);
        return coord;
    }
    public int getQuadrant(){
        int x = xCoordinate;
        int y = yCoordinate;
        int result = 0;
        if(x > 0 && x > 0){
            result = 1;
        }
        if(x > 0 && y < 0){
            result = 4;
        }
        if(x<0 && y<0){
            result = 3;
        }
        if(x<0 && y>0){
            result = 2;
        }
        if(x == 0 && y == 0){
            result = 0;
        }
        if(x == 0 && y != 0){
            result = 6;
        }
        if(x != 0 && y == 0){
            result = 5;
        }
        return result;
    }
    
    public double getAngle(){
        double angle = Math.toDegrees(Math.atan2(yCoordinate,xCoordinate));
        if(angle < 0){
            angle = angle+360;
        }
        return angle;
    }
}
