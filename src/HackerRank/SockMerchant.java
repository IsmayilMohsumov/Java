package HackerRank;

import java.util.Arrays;

public class SockMerchant {
//John works at a clothing store. He has a large pile of socks that he must pair by color for sale.
//Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

    public static void main(String[] args) {
        SockMerchant.sockMerchant(10, new int[]{1,2,3,4,5,6,7,8,9,0});
    }

    static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            //10 20 20 10 10 30 50 10 20
            if (ar[i] == ar[i + 1]) {
                count = count + 1;
                i = i + 1;
            }
        }
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i]);
            
        }
        System.out.println("");
        System.out.println(count);
        return count;

    }

}
