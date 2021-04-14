/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeSmell;

public class CustomerDAO {

    public void add(Customer customer) throws Exception {
        CustomerValidation customerValidation = new CustomerValidation();
        customerValidation.ifCustomerNameNull(customer);
        customerValidation.ifCustomerSurnameNull(customer);
        customerValidation.ifCustomerIdentityNumberNull(customer);
        //validation
        System.out.println("Customer added to Database.!!");
    }
}
