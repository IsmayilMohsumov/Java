/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Vector;

enum Days {

    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday");

    private String dayName;

    private Days(String dayName) {
        this.dayName = dayName;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

}

enum Mobile {

    MOTOROLA(150),
    NOKIA(300),
    IPHONE(1000),
    SAMSUNG(700);

    private Integer price;

    private Mobile(Integer price) {
        this.price = price;
    }

    public static int compare(int x, int y) {
        return Integer.compare(x, y);
    }

    public int showPrice() {
        return price;
    }

}

public class Enum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (Mobile m : Mobile.values()) {
            System.out.println(m + " " + m.showPrice());
        }

        Days [] daysArr = Days.values();
        Enumeration days;
        Vector dayNames = new Vector();
        for (int i = 0; i < daysArr.length; i++) {
            dayNames.add(daysArr[i]);
        }
        days = dayNames.elements();

        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
        

    }

}
