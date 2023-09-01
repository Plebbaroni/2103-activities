/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometry;

/**
 *
 * @author User
 */
public class Geometry {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyPoint coordinate = new MyPoint(5,4);
        coordinate.displayPoint();
        System.out.println(coordinate.toString());
        System.out.println(coordinate.getDistance());
        System.out.println(coordinate.getQuadrant());
        System.out.println(coordinate.getAngle());
    }
    
}
