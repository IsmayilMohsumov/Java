/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

import java.util.Random;
import java.util.Scanner;
/*
Start from the leftmost element of arr[] and one by one compare x with each element of arr[]
If x matches with an element, return the index.
If x doesn’t match with any of elements, return -1.

*/

public class LinearSearch {

    public static void main(String[] args) {
        int arr[];
        int arraySize, userValue;
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an size for array :");
        arraySize = sc.nextInt();
        arr = new int[arraySize];

        System.out.println("-----------------");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rd.nextInt(10)+1;
        }
        System.out.println("-----------------"+ arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter an value that you want to find :");
        userValue = sc.nextInt();
        
        for (int i = 0; i < arr.length; i++) {
              if(arr[i]==userValue){
                  System.out.println("Element " + userValue +" is present at index: "+i);
                  return;
              }else {
                  System.out.println("Element " + userValue +" is not present at index:" + i);
              }
        }
    }

}
