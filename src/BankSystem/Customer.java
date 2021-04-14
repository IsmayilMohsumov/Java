/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package BankSystem;

/**
 *
 * @author Paris
 */
public class Customer {
    private long bankId;
    private String name;
    private long balance;

    public Customer(long bankId, String name, long balance) {
        this.bankId = bankId;
        this.name = name;
        this.balance = balance;
    }

    public long getBankId() {
        return bankId;
    }

    public String getName() {
        return name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
    

    @Override
    public String toString() {
        return  "name=" + name + ", balance=" + balance;
    }
    
    
    }
