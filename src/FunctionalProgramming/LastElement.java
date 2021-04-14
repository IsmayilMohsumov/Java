/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package FunctionalProgramming;

import java.util.ArrayList;

/**
 *
 * @author Paris
 */
public class LastElement {
    public static void main(String[] args) {
//        LastElement.ad(new int[]{1,2,3,4});
        
        ArrayList<Integer> arr = new ArrayList<Integer>(4); 
        
        arr.add(1); 
        arr.add(2); 
        arr.add(3); 
        arr.add(2); 
        
        
        for (int i = 0; i < arr.size(); i++) {
            if(arr.get(i)==4)System.out.println("4 is exist");
            
        }
    }

public static void ad(int array[]){
    System.out.println(array[0]);
    System.out.println(array[array.length-1]);
}
}