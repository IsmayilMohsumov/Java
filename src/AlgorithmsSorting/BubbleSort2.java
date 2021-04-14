package AlgorithmsSorting;

public class BubbleSort2 {

    int array[] = {8, 4, 3, 1, 2, 5, 7, 6, 9};
    int arrayLength = array.length;

    public static void main(String[] args) {
        BubbleSort2 bubble = new BubbleSort2();
        bubble.insertionSort();
        bubble.printArray();
    }

    public void bubbleSort() {
        for (int i = arrayLength - 1; i > 1; --i) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swapValues(j, j + 1);
                }
            }
        }

    }

    public void selectionSort() {
        for (int i = 0; i < arrayLength; i++) {
            int minimum = i; //min=0
            for (int j = i; j < arrayLength; j++) {//i=0
                if (array[minimum] > array[j]) {//arr[0] = 8  > arr[0] = 8  | arr[0]=8 > arr[1] = 4 
                    minimum = j; // minimum = 1;
                }
            }
            swapValues(i, minimum);
        }
    }

    public void insertionSort() {
        // int array[] = {8, 4, 3, 1, 2, 5, 7, 6, 9};
        for (int i = 1; i < arrayLength; i++) {
            int j = i;  // j=1 
            int toInsert = array[i]; //toInsert = 4
            while ((j > 0) && (array[j - 1] > toInsert)) {  // 1 > 0 ve array[0] = 8 > 4  --- true  || ikinci dongude uje  0 alir ve girmir
                array[j] = array[j - 1]; //arr[1] = 4 ; 
                j--; // 1- 1  = 0
            }
            array[j] = toInsert; //arr[0] = 4 
            System.out.println("\nArray[" + i + "]= " + array[i] + " Array[" + j + "]= " + array[j] + " toInsert = " + toInsert + "\n");
        }
    }

    public void sort2(int a[]) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    swapValues(i, i + 1);
                    sorted = false;
                }
            }
        }
    }

    private void swapValues(int indexOne, int indexTwo) {
        int temp = array[indexOne];
        array[indexOne] = array[indexTwo];
        array[indexTwo] = temp;
    }

    public void printArray() {
        for (int i = 0; i < arrayLength; i++) {
            System.out.print(" |" + i + "|");
            System.out.print(" |" + array[i] + "|\n");
        }
    }
}
