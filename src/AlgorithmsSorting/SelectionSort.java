/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlgorithmsSorting;

/**
 *
 * @author Paris
 */
public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {3, 6, 2, 1, 7, 8, 5, 32};
        int lengthOfArray = arr.length;
        sort(arr);
        print(arr);
    }

    public static void sort(int arr[]) {
        int n = arr.length;

        // One by one move boundary of unsorted subarray 
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array 
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void print(int arrNew[]) {

        System.out.println("Sorted array ");
        for (int i = 0; i < arrNew.length; i++) {
            System.out.print(arrNew[i] + " ");
        }
        System.out.println();

    }

}
