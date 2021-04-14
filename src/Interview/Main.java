/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interview;

import java.util.Scanner;

/*
 Because Morten knows it is important to stay hydrated, he drinks 0.5 litres of water per hour of cycling.
 Morten’s smartwatch records the total number of hours spent on cycling each day, for the last 7 days.

 As his best friend, you’ve been asked to write a program that shows how many liters of water Morten should have drunk. The program should accept
 an array of 7 consecutive daily measurements, representing actual hours spent on cycling for the last 7 days.
 As a result, the program should return rounded to the smallest value, number of litres.

 For example:
 3 hours of cycling for last 7 days -> 1 liter
 6.7 hours of cycling for last 7 days -> 3 litres
 11.8 hours of cycling for last 7 days -> 5 litres
 */
public class Main {
    public static void main(String[] args) {
            int arrr[] = {1,2,3,4,5,6,7};   
            
        double drinkedWater = 0.5;  // per hour
        double hoursOnCycling = 0;
//        double waterCapacity ;
        Scanner sc = new Scanner(System.in);
        System.out.println("How many hours did you cycling?");
        hoursOnCycling = sc.nextDouble();
        int sum = (int) (drinkedWater * hoursOnCycling);
        System.out.println(hoursOnCycling+" hours of cycling for last 7 days - > "+ sum+" liter");

//        int arr[] = {3, 5, 6, 7, 8, 5, 6, 5, 3, 1};
//        int over = arr.length / 2;
//        int step = (int) Math.min(4, 0) - 1;
//        System.out.println(step);

    }

}
