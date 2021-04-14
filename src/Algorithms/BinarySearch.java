/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algorithms;

/**
 *
 * @author Paris
 */
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {4, 5, 7, 8, 9, 10, 22, 30};
        int mid = arr.length / 2;
        int arrLegth = arr.length;
        int shouldFind = 22 ;
        int value = 0;

        if (arr[mid] == shouldFind) {
            System.out.println("Elemnt found at index " + mid);
        }
        if (arr[mid] > shouldFind) {
            value = binarySearc(arr, mid - 1, arrLegth, shouldFind);
        }
        if (arr[mid] < shouldFind) {
            value = binarySearc(arr, mid - 1, arrLegth, shouldFind);
        }
        
        System.out.println("arr:" +value);

    }

    public static int binarySearc(int arr[], int mid, int arrLength, int shouldFind) {
        if (arr[mid] == shouldFind) {
            System.out.println("Elemnt found at index " + mid);
            return mid;
        }
        if (arr[mid] > shouldFind) {
            return binarySearc(arr, mid - 1, arrLength, shouldFind);
        }
        if (arr[mid] < shouldFind) {
            return binarySearc(arr, mid + 1, arrLength, shouldFind);
        }

        return -1;
    }

}
