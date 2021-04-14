/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Paris
 */
public class NewMain {

    public static void main(String[] args) {
//        NewMain.countingValleys(8, "UDDDUDUU");

//        int arr[]={2,0,0,0,0,5};
//        NewMain.jum(arr);
//        NewMain.repeatedString("baa", 10);
//        NewMain.compareTriplets(Arrays.asList(55,65,7), Arrays.asList(5,8,102));
//        List<Integer> list = new ArrayList<>();
//        list=Arrays.asList( 11,2,4,
//                            4,5,6,
//                            10,8,-12);
//        List<List<Integer>> listInList = new ArrayList<>();
//        listInList.add(list);
//        NewMain.diagonalDifference(listInList);
//        int arr[] = {1,1,0,-1,-1};
//        NewMain.plusMinus(arr);
//        NewMain.staircase(5);
//        int arr[] = {99, 99, 99, 99, 99, 99, 99, 99, 99, 99};
//        NewMain.birthdayCakeCandles(arr);
//        NewMain.timeConversion("12:15:12PM");
        NewMain.gradingStudents(null);

    }

    static int countingValleys(int n, String s) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'U') {
                if (++sum == 0) {
                    count++;
                }
            } else {
                sum--;
            }
        }
        System.out.println(count);
        return count;
    }

    public static int jum(int[] c) {
        int n = c.length;

        int count = -1;
        for (int i = 0; i < n; i++, count++) {
            if (i < n - 2 && c[i + 2] == 0) {
                i++;
            }
        }
        System.out.println(count);
        return count;
    }

    static long repeatedString(String s, long n) {

        long check = 0;
        int i = 0, j = 0, k = 0;
        long count = 0;

        //aba
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++; //2
            }
        }

        long div = n / s.length(); //3.3333333333
        long reminder = n % s.length(); //1 qaliq 
        System.out.println(div);
        System.out.println(reminder);

        count = div * count; //3 * 2 =6
        System.out.println(count);

        for (i = 0; i < reminder; i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {

        List<Integer> list = new ArrayList<>();
        int alice = 0;
        int bob = 0;
        list.add(0, alice);
        list.add(1, bob);

        for (int i = 0; i < a.size(); i++) {
            int valueOfA = a.get(i);
            int valueOfB = b.get(i);
            boolean bigger = (valueOfA > valueOfB) ? true : false;
            boolean smaller = (valueOfA < valueOfB) ? true : false;
            if (bigger) {
                alice++;
                list.set(0, alice);
            } else if (smaller) {
                bob++;
                list.set(1, bob);
            } else {
                System.out.println("Same");
            }

        }

        System.out.println(list.toString());
        return list;
    }

    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1to9 = 0;
        int sum3to7 = 0;
        for (List<Integer> list : arr) {
            for (int i = 0; i <= list.size(); i += 4) {
                sum1to9 += list.get(i);
            }
        }
        for (List<Integer> list : arr) {
            for (int i = 2; i <= list.size() - 2; i += 2) {
                sum3to7 += list.get(i);
            }
        }
//          System.out.println(sum1to9);
        int total = Math.abs(sum3to7 - sum1to9);
        System.out.println(total);
        return total;
    }

    static void plusMinus(int[] arr) { //4
        //gelen arrayin icinnen nece dene pozitive ve negative ve zero var onlari arrayin length ine bolmek
        int arrayLength = arr.length; // 4
        double positive = 0;
        double negative = 0;
        double zero = 0;
        for (int i = 0; i < arrayLength; i++) {
            int number = arr[i];
            if (number >= 1) {
                positive++;
            } else if (number == 0) {
                zero++;
            } else if (number <= -1) {
                negative++;
            }
        }
        System.out.println(positive / arrayLength);
        System.out.println(negative / arrayLength);
        System.out.println(zero / arrayLength);

    }

    static void staircase(int n) {
        //pilleken seklinde # leri duzur girilen reqqeme gore.
        String str = "#";
        for (int i = 0; i < n; i++) {
            System.out.printf("%" + (n + 1) + "s", str + "\n");
            str = str + "#";
        }

    }

    static void miniMaxSum(int[] arr) { //5 6 9 1 2 gelen arrayden 4 reqem ile en boyuk ve en kicik reqemlerin cemi;
        int arrayLength = arr.length;
        for (int i = arrayLength - 1; i > 1; --i) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        int sumSmallest = 0;
        int sumBiggest = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            sumSmallest += arr[i];
        }

        for (int i = 1; i < arr.length; i++) {
            sumBiggest += arr[i];
        }
        System.out.println(sumSmallest);
        System.out.println(sumBiggest);

    }

    static int birthdayCakeCandles(int[] a) {///5 3 4 6 6
        //3 2 1 3
        //output =  2
        // We have one candle of height 1 , one candle of height 2 , and two candles of height 3.
        //  Your niece only blows out the tallest candles, meaning the candles where height = 3 . Because there are 2 such candles, we print 2 on a new line.
        Arrays.sort(a);  //3 4 5 6 6 
        int count = 0;
        int i = a.length - 1; //4
        int tallest = a[i]; //a[4] = 6 
        if (a[0] == a[i]) {
            return i + 1;
        }
        while (a[i--] == tallest) {
            count++;
        }
        System.out.println(count);
        return count;
    }

    static String timeConversion(String s) {
//Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
//Note: Midnight is 12:00:00AM on a 12-hour clock, and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock, and 12:00:00 on a 24-hour clock.
        int LOCAL = 12;
        int time = Integer.parseInt(s.substring(0, 2));
        String amOrPm = s.substring(s.length() - 2, s.length());
        
        if ("AM".equalsIgnoreCase(amOrPm)) {
            System.out.println(s);
            return s;
        } else {
            if(time ==12){
            System.out.println("00"+s.substring(2, s.length() - 2));
            return 00+s.substring(2, s.length() - 2);
            }
            time += LOCAL;
            System.out.println(time + s.substring(2, s.length() - 2));
            return time + s.substring(2, s.length() - 2);
        }

    }
    
    public static List<Integer> gradingStudents(List<Integer> grades) {
        
        
        return null;
    }
}
