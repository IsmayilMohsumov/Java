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
public class BinarySearch2 {

    public static int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

                   // 0 + (5-0) /2 = 2.5  cast = 2
			// If the element is present at the 
            // middle itself 
            if (arr[mid] == x) {
                return mid;
            }

			// If element is smaller than mid, then 
            // it can only be present in left subarray 
            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            }

			// Else the element can only be present 
            // in right subarray 
            return binarySearch(arr, mid + 1, r, x);
        }

		// We reach here when element is not present 
        // in array 
        return -1;
    }

    // Driver method to test above 
    public static void main(String args[]) {
        int arr[] = {2, 3, 10, 10, 40};
        int n = arr.length;
        int x = 12;
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1) {
            System.out.println("Element not present");
        } else {
            System.out.println("Element found at index " + result);
        }
    }

}
