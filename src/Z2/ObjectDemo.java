/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Z2;

import java.io.BufferedReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ObjectDemo extends Object {

   private List synchedList;

   public ObjectDemo() {
      synchedList = Collections.synchronizedList(new LinkedList());
   }

   public String removeElement() throws InterruptedException {
      synchronized (synchedList) {

         while (synchedList.isEmpty()) {
            synchedList.wait();
            System.out.println("Waiting...");
         }
         String element = (String) synchedList.remove(0);

         return element;
      }
   }

   public void addElement(String element) {
      System.out.println("Started...");
      synchronized (synchedList) {

         synchedList.add(element);
         System.out.println("New Element:'" + element + "'");

         synchedList.notifyAll();
      }
      System.out.println("Closing...");
   }

   public static void main(String[] args) {
      final ObjectDemo demo = new ObjectDemo();

      Runnable runA = new Runnable() {

         public void run() {
            try {
               String item = demo.removeElement();
               System.out.println("" + item);
            } catch (InterruptedException ix) {
               System.out.print("");
            } catch (Exception x) {
               System.out.print("");
            }
         }
      };

      Runnable runB = new Runnable() {

         public void run() {
             Scanner sc = new Scanner(System.in);
             System.out.println("Add something to list: " +Thread.currentThread().getName());
             demo.addElement(sc.next());
             try {
                 Thread.sleep(4000);
             } catch (InterruptedException ex) {
                 
             }
         }
      };

      try {
         Thread threadA2 = new Thread(runA, "A");
         threadA2.start();

         Thread.sleep(500);

         Thread threadB = new Thread(runB, "A2");
         threadB.start();

         Thread.sleep(1000);

         threadA2.interrupt();
      } catch (InterruptedException x) {
      }
   }
}
