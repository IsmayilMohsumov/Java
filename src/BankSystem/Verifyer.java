/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankSystem;

import java.util.Optional;
import java.util.Scanner;

/**
 *
 * @author Paris
 */
public class Verifyer {

    static Scanner sc = new Scanner(System.in);

    public static long checkAmountsFor() {
        int counter = 0;
        do {
            System.out.println("Please enter amount :");
            long amount = sc.nextLong();
            System.out.println("Please re-enter amount :");

            if (amount != sc.nextLong()) {
                counter++;
            } else {
                return amount;
            }
        } while (counter != 3);
        System.err.println("You had 3 chances please try again.");
        return 0;
    }
    
    public static void checkID(Optional<Customer> opt){
        if (opt.isPresent()) {
            System.out.println("Customer name: " + opt.get().getName() + '\n'
                    + "Customer balance :" + opt.get().getBalance());
        } else {
            System.err.println("User is not present!");
            Menu.menu();
        }
    }
    
    public static boolean isAble(long amount,Customer user){
        long balance = user.getBalance()-amount;
        if(balance>=0){
            return true;
        }else{
            return false;
        }
    }
    
    public static void transaction(boolean is , Optional<Customer> opt,long amount){
        if (is) {
            opt.get().setBalance(opt.get().getBalance() - amount);
            System.out.println("After operation your balance is:" + opt.get().getBalance());
        } else {
            System.err.println("You don't have enough amount in your balance");
            Menu.menu();
        }
        
    }
}
