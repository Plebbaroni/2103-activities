/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

/**
 *
 * @author User
 */
public class ExceptionEx1 {

    public static void main(String args[]) {
        try{
            int[] nums = {3, 2, 6, 1};
            badUse(nums);
        }catch(Exception e){
            System.out.println("EXCEPTION: " + e);
        }
    }

    public static void badUse(int[] vals) {
        int total = 0;

        for (int i = 0; i < vals.length; i++) {
            int index = vals[i];
            total += vals[index];
        }
         System.out.println(total);
    }
}

