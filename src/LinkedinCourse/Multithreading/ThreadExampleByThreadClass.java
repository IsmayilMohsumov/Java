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
public class ThreadExampleByThreadClass extends Thread {

    @Override
    public void run() {
        int i = 1;
        while(i<=10){
//            System.out.println(i+" "+Thread.currentThread().getName());
            System.out.println(i+" "+this.getName());
            i+=1;
            
        }
    }
    
    
}
