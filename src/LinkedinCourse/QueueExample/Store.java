/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedinCourse.QueueExample;

import java.util.LinkedList;

/**
 *
 * @author Paris
 */
public class Store {
    public static void main(String[] args) {
        LinkedList<Customer> queue = new LinkedList<>();
        queue.add(new Customer("Anna"));
        queue.add(new Customer("Bob"));
        queue.add(new Customer("Lusanna"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);
        
    }
    
    public static void serveCustomer(LinkedList<Customer> queue) {
        queue.offerLast(new Customer("Teze Customer"));
        System.out.println(queue);
        
        Customer a=queue.removeLast();
        System.out.println("Cutomer "+a+" has been deleted");
        
        Customer c = queue.poll();
        c.serve();
             
    }
}
