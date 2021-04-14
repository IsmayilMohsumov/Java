/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package LinkedinCourse.QueueExample;

/**
 *
 * @author Paris
 */
public class Customer {
    private boolean served;
    private String customerName;

    public Customer(String customerName) {
        this.served=false;
        this.customerName = customerName;
    }
    
    public void serve() {
        served=true;
        System.out.println("Customer " + customerName+ " has been served.");
    }

    @Override
    public String toString() {
        return customerName ;
    }
    
    
    
}
