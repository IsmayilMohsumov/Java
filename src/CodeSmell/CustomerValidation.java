/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package CodeSmell;


public class CustomerValidation {
    
    public void ifCustomerNameNull(Customer customer) throws Exception{
        if(customer.getCustomerName().isEmpty() || customer.getCustomerName() == null){
            throw new Exception(" Name is not filled ");
        }
    }
     public void ifCustomerSurnameNull(Customer customer) throws Exception{
        if(customer.getCustomerSurname().isEmpty() || customer.getCustomerSurname() == null){
            throw new Exception(" Surname is not filled ");
        }
    }
      public void ifCustomerIdentityNumberNull(Customer customer) throws Exception{
        if(customer.getCustomerIdentityNumber().isEmpty() || customer.getCustomerIdentityNumber() == null){
            throw new Exception(" IdentityNumber is not filled ");
        }
    }
}
