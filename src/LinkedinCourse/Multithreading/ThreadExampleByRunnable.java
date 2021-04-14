/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedinCourse.Multithreading;

/**
 *
 * @author Paris
 */
public class ThreadExampleByRunnable implements Runnable { // bu istifade eger basqa seyi extend etmek lazim olarsa deye var

    @Override
    public void run() {
        int i = 1;
        while (i <= 10) {
            System.out.println(i+" "+Thread.currentThread().getName());
            i += 1;
        }

    }
}
