/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    
    public int add(int x, int y){
        return x + y;
    }
    
    // This method could throw an ArithmeticException
    public double divide(int x, int y) {
        return x / y;
    }
    
}
