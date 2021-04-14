
package AlgorithmsSorting;

/**
 *
 * Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.
 */
public class InsertionSort {

    public static void main(String[] args) {
        int arr [] = {3,5,43,12,4,6,54};
        sort(arr);
        print(arr);
    }
    
    public static void sort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            int key = arr[i];
            int j = i-1;
            while(j >= 0 && arr[j] > key ){
                arr[j+1] = arr[j];
                j = j-1 ;
            }
            arr[j+1]= key;
            
        }
        
    }
    public static void print(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
